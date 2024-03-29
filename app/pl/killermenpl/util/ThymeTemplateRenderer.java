package pl.killermenpl.util;

import java.util.ArrayList;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;
import org.thymeleaf.resourceresolver.FileResourceResolver;
import org.thymeleaf.templatemode.StandardTemplateModeHandlers;
import org.thymeleaf.templateresolver.TemplateResolver;

import models.User;
import play.Configuration;
import play.twirl.api.Html;

public class ThymeTemplateRenderer {

	
	public static Configuration config;
	 
	// public Application app;

	private TemplateEngine engine;
	public IContext context;

	private static ThymeTemplateRenderer instance;
	private ArrayList<String> sessionVars;

	private ThymeTemplateRenderer() {
		TemplateResolver resolver = new TemplateResolver();
		resolver.setTemplateMode(StandardTemplateModeHandlers.HTML5.getTemplateModeName());
		resolver.setPrefix("public/templates/");
		resolver.setSuffix(".html");
		resolver.setResourceResolver(new FileResourceResolver());
		// if(app!=null && app.isDev())
		// System.out.println(app.isDev());
		resolver.setCacheTTLMs(100l);
		// else
		// resolver.setCacheTTLMs(10000000l);
		engine = new TemplateEngine();
		engine.setTemplateResolver(resolver);

		context = new Context();
//		context.getVariables();

		sessionVars = new ArrayList<>();
	}

	public static ThymeTemplateRenderer get() {
		if (instance == null) {
			instance = new ThymeTemplateRenderer();
			if(config!=null && config.getBoolean("isDeployed", false)){
				instance.engine.getTemplateResolvers().forEach((resolver)->{
//					if(resolver instanceof TemplateResolver)
						((TemplateResolver)resolver).setPrefix("/public/templates/");
				});
			}
		}
//		System.out.println(config==null);
		return instance;
	}

	public Html render(String name) {
		Html html = null;

		setVariable("session", play.mvc.Http.Context.current().session());
		
		if(play.mvc.Http.Context.current().session().containsKey("user"))
			setVariable("user", User.find.byId(Long.parseLong(play.mvc.Http.Context.current().session().get("user"), 10)));
		
		String result = engine.process(name, context);
		html = new Html(result);

		context.getVariables().clear();

		return html;
	}

	public ThymeTemplateRenderer setVariable(String name, Object value) {
		context.getVariables().put(name, value);
		return this;
	}

	public ThymeTemplateRenderer watchSessionVariable(String name) {
		if (sessionVars.contains(name))
			return this;
		sessionVars.add(name);
		return this;
	}
}
