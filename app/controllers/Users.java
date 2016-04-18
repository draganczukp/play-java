package controllers;

import static pl.killermenpl.util.StringUitls.isEmpty;

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
	private static boolean errored = false;

	public Result root() {
		return redirect("/");
	}

	public Result register() {
		// Got here from <a href="/users/register/">
		errors.clear();
		errored = false;
		renderer.setVariable("title", "Register");
		renderer.setVariable("action", "register");
		if (request().method().equalsIgnoreCase("post")) {
			DynamicForm form = factory.form().bindFromRequest();
			System.out.println(form.get("login"));
			if (User.find.where().ilike("login", form.get("login")).findUnique() != null) {
				error("User with that name already exists");
				return userFormErrorResult();
			}

			String login = form.get("login");
			String email = form.get("email");
			String password = form.get("password");
			String password2 = form.get("password2");
			// System.out.println(login);
			if (isEmpty(login))
				error("Login cannot be empty");
			if (isEmpty(email))
				error("Email cannot be empty");
			if (isEmpty(password))
				error("Password cannot be empty");
			if (isEmpty(password2))
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

			renderer.setVariable("registerSuccesfull", true);

			user.save();
			renderer.setVariable("action", "home");
			return redirect("/");
		}
		renderer.setVariable("action", "register");
		renderer.setVariable("title", "Register");
		return ok(renderer.render("index"));
	}

	private void error(String error) {
		errored = true;
		errors.add(error);
	}

	private Result userFormErrorResult() {
		renderer.setVariable("errors", errors);
		return badRequest(renderer.render("index"));
	}

	public Result login() {
		renderer.setVariable("action", "login");
		renderer.setVariable("title", "Login");
		if (request().method().equalsIgnoreCase("get"))
			return ok(renderer.render("index"));

		DynamicForm form = factory.form().bindFromRequest();

		String login = form.get("login");
		String password = form.get("password");

		if (isEmpty(login))
			error("Login cannot be empty!");
		if (isEmpty(password))
			error("Password cannot be empty!");
		if (errored)
			return userFormErrorResult();

		User user = User.find.where().like("login", login).findUnique();

		if (user == null)
			error("User with that username does not exists!");
		if (errored)
			return userFormErrorResult();

		if (!BCrypt.checkpw(password, user.password))
			error("Invalid password!");

		if (errored)
			return userFormErrorResult();

		session("isLoggedIn", "true");
		
		user.password = "No.";
//		session("userAsJson", Json.toJson(user).asText());
		session("user", String.valueOf(user.id));
		renderer.setVariable("user", user);
//		System.out.println("Login");
		return redirect("/");
	}

	public Result logout() {
		session().clear();
		renderer.context.getVariables().clear();
		return redirect("/");
	}

	public Result get(Long id) {
//		System.out.println(id);
		renderer.setVariable("action", "user");
		renderer.setVariable("title", User.find.byId(id).login);
		renderer.setVariable("user2", User.find.byId(id));
		
		return ok(renderer.render("index"));
	}
}
