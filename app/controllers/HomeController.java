package controllers;

import java.util.HashMap;

import pl.killermenpl.util.ThymeTemplateRenderer;
import play.mvc.Controller;
import play.mvc.Result;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    
//	@Inject
//	public SoyFileSet.Builder builder;
	
    public Result index() {
    	ThymeTemplateRenderer renderer = ThymeTemplateRenderer.get();
    	HashMap<String, Object> vars = new HashMap<>();
    	vars.put("page", "/");
    	vars.put("title", "Home");
    	vars.put("isLoggedIn", session().containsKey("username"));
//    	vars.put("user", User)
    	
    	renderer.context.getVariables().putAll(vars);
    	return ok(renderer.render("index"));
    }

}
