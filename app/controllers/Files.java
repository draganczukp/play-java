package controllers;

import java.io.File;

import play.mvc.Controller;
import play.mvc.Result;


//TODO:Finish dile handling
public class Files extends Controller {
	
	/**
	 * @param path relative to public/files/
	 * @return
	 */
	public Result get(String path){
		File file = new File("public/files/"+path); 
		return ok(file);
	}
	
	public Result upload(){
		return TODO;
	}
	
}
