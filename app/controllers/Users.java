package controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.mindrot.jbcrypt.BCrypt;

import com.google.inject.Inject;

import models.User;
import pl.killermenpl.util.ThymeTemplateRenderer;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class Users extends Controller {
	@Inject
	public FormFactory factory;

	protected static ThymeTemplateRenderer renderer = ThymeTemplateRenderer.get();
	protected static HashMap<String, Object> vars = new HashMap<>();
	private static ArrayList<String> errors = new ArrayList<>();

	public Result root() {
		User.find.all();
		return TODO;
	}

	public Result register() {
		// Got here from <a href="/users/register/">
		boolean errored = false;
		renderer.setVariable("title", "Register");
		renderer.setVariable("action", "register");
		if (request().method().equalsIgnoreCase("post")) {
			DynamicForm form = factory.form().bindFromRequest();
			System.out.println(form.get("username"));
			if (User.find.where().ilike("login", form.get("login")) != null) {
				error("User with that name already exists");
				return userFormErrorResult();
			}

			String login = form.get("login"), email = form.get("email"), password = form.get("password"),
					password2 = form.get("password2");

			if (login == null)
				error("Login cannot be empty");
			if (email == null)
				error("Email cannot be empty");
			if (password == null)
				error("Password cannot be empty");
			if (password == null)
				error("You must type in you password again");
			if (!password.equals(password2))
				error("Passwords don't match");

			if (errored) {
				return userFormErrorResult();
			}
			
			User user = new User();
			user.email = email;
			user.login = login;
			user.password = BCrypt.hashpw(password, BCrypt.gensalt());
			
			user.save();
		}
		renderer.setVariable("registerSuccesfull", true);
		return ok(renderer.render("index"));
	}

	private void error(String error) {
		errors.add(error);
	}

	private Result userFormErrorResult() {
		renderer.setVariable("errors", errors);
		return badRequest(renderer.render("index"));
	}

	public Result login() {

		renderer.context.getVariables().putAll(vars);
		return TODO;
	}

	public Result logout() {

		renderer.context.getVariables().putAll(vars);
		return TODO;
	}

	public Result get(Long id) {

		renderer.context.getVariables().putAll(vars);
		return TODO;
	}
}
