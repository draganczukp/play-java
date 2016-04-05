
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import com.google.inject.Inject;
import com.google.inject.Provider;

import pl.killermenpl.util.ThymeTemplateRenderer;
import play.Configuration;
import play.Environment;
import play.api.OptionalSourceMapper;
import play.api.routing.Router;
import play.http.DefaultHttpErrorHandler;
import play.mvc.Result;
import play.mvc.Results;
import play.mvc.Http.RequestHeader;

public class ErrorHandler extends DefaultHttpErrorHandler {

	@Inject
	public ErrorHandler(Configuration configuration, Environment environment, OptionalSourceMapper sourceMapper,
			Provider<Router> routes) {
		super(configuration, environment, sourceMapper, routes);
	}

	@Override
	public CompletionStage<Result> onNotFound(RequestHeader request, String message) {
		new CompletableFuture<>();
		CompletionStage<Result> r = CompletableFuture.completedFuture(Results.notFound(
			ThymeTemplateRenderer.get().setVariable("title", "404").setVariable("action", "error").setVariable("message", message).render("error404")
			));
		return r;
	}
	

}
