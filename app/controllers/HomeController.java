package controllers;

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
    	
    	renderer.setVariable("title", "Home");
    	renderer.setVariable("action", "home");
    	
    	renderer.watchSessionVariable("isLoggedIn");
    	renderer.watchSessionVariable("user");
    	
    	return ok(renderer.render("index"));
    }

}
