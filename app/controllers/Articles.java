package controllers;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;

import models.Article;
import models.User;
import pl.killermenpl.util.StringUitls;
import pl.killermenpl.util.ThymeTemplateRenderer;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

public class Articles extends Controller {

	protected ThymeTemplateRenderer renderer = ThymeTemplateRenderer.get();

	@Inject
	public FormFactory factory;

	private boolean errored = false;

	private ArrayList<String> errors = new ArrayList<>();

	public Result list() {

		List<Article> articles = Article.find.all();

		// if (!articles.isEmpty())
		renderer.setVariable("articles", articles);
		renderer.setVariable("action", "articleList");
		renderer.setVariable("title", "Articles");
		return ok(renderer.render("index"));
	}

	public Result get(Long id) {
		Article article = Article.find.byId(id);

		if (article == null) {
			return badRequest("No such article");
		}
		renderer.setVariable("title", article.title);
		renderer.setVariable("action", "showArticle");
		renderer.setVariable("article", article);
		article.views++;
		return ok(renderer.render("index"));
	}

	private void error(String error) {
		errored = true;
		errors.add(error);
	}

	private Result articleErrorResult() {
		renderer.setVariable("errors", errors);
		return badRequest(renderer.render("index"));
	}

	public Result add() {
		// assumes getting from submitting an article
		renderer.setVariable("title", "Add article").setVariable("action", "addArticle");
		if (request().method().equalsIgnoreCase("post")) {
			DynamicForm form = factory.form().bindFromRequest();

			Article article = null;
			if (form.get("id").equalsIgnoreCase("-1")) {
				article = new Article();
				Long userId = Long.parseLong(session("user"), 10);
				article.author = User.find.byId(userId);
			} else {
				article = Article.find.byId(Long.parseLong(form.get("id"), 10));
			}
			article.title = form.get("title");
			article.content = form.get("content");
			// System.out.println(article.toString());

//			if (StringUitls.isEmpty(article.title)) {
//				error("Article title cannot be empty!");
//				return articleErrorResult();
//			}
			if (form.get("action").equalsIgnoreCase("save")) {
				article.update();
			} else if (form.get("action").equalsIgnoreCase("save_and_view")) {
				article.update();
				return redirect("/articles/" + article.id + "/get");
			} else if (form.get("action").equalsIgnoreCase("abort")) {
				return redirect("/articles");
			}

			renderer.setVariable("article", article);
		}

		return ok(renderer.render("index"));
	}

	public Result edit(Long id) {
		Article article = Article.find.byId(id);
		renderer.setVariable("title", "Edit article").setVariable("action", "editArticle");

		if (article == null) {
			return badRequest("No such article");
		}
		if (request().method().equalsIgnoreCase("post")) {
			DynamicForm form = factory.form().bindFromRequest();
			article.title = form.get("title");
			article.content = form.get("content");
			// System.out.println(article.toString());
			System.out.println(article.content);

			if (StringUitls.isEmpty(article.title)) {
				error("Article title cannot be empty!");
				return articleErrorResult();
			}

			if (form.get("action").equalsIgnoreCase("save")) {
				article.save();
			} else if (form.get("action").equalsIgnoreCase("save_and_view")) {
				article.save();
				return redirect("/articles/" + article.id + "/get");
			} else if (form.get("action").equalsIgnoreCase("abort")) {
				return redirect("/articles");
			}
		}
		renderer.setVariable("article", article);

		return ok(renderer.render("index"));
	}
}
