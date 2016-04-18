package controllers;

import com.google.inject.Inject;

import pl.killermenpl.util.ThymeTemplateRenderer;
import play.Configuration;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    
	@Inject
	public Configuration config;
	
    public Result index() {
    	
    	if(ThymeTemplateRenderer.config==null)
    		ThymeTemplateRenderer.config = config;
    	
    	ThymeTemplateRenderer renderer = ThymeTemplateRenderer.get();
    	
    	renderer.setVariable("title", "Home");
    	renderer.setVariable("action", "home");
    	
    	
    	return ok(renderer.render("index"));
    }

}
