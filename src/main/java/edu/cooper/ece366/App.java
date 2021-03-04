package edu.cooper.ece366;

import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.initExceptionHandler;
import static spark.Spark.options;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.cooper.ece366.auth.AuthStoreImpl;
import edu.cooper.ece366.handler.Handler;
import edu.cooper.ece366.model.User;
import edu.cooper.ece366.model.UserBuilder;
import edu.cooper.ece366.service.FeedServiceImpl;
import edu.cooper.ece366.store.ContentStoreImpl;
import edu.cooper.ece366.store.UserStoreImpl;
import io.norberg.automatter.AutoMatter;
import io.norberg.automatter.gson.AutoMatterTypeAdapterFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import spark.Request;
import spark.Response;
import spark.ResponseTransformer;

public class App {

  public static void main(String[] args) {
    // root is 'src/main/resources', so put files in 'src/main/resources/public'
    staticFiles.location("/public"); // Static files

    Gson gson =
        new GsonBuilder().registerTypeAdapterFactory(new AutoMatterTypeAdapterFactory()).create();

    ResponseTransformer responseTransformer =
        model -> {
          if (model == null) {
            return "";
          }
          return gson.toJson(model);
        };

    initExceptionHandler(Throwable::printStackTrace);

    Handler handler =
        new Handler(
            new UserStoreImpl(),
            new FeedServiceImpl(new ContentStoreImpl()),
            new AuthStoreImpl(),
            gson);

    /* goal: a user can load a feed and then watch content
     pre-req
     * create store with content -- couple movies, couple shows/seasons/episodes (record genre)
     * create store with users -- maybe we capture genre preferences for the feed
     service layer
     * service can fetch user and content info as well as derive a feed based on user prefs/existing content
     * api/handler layer that will extract req info and delegate to service and generate response info
    */

    // allow cors (cross origin resource sharing) so that different domain/port can fetch

    options(
        "/*",
        (request, response) -> {
          String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
          if (accessControlRequestHeaders != null) {
            //            response.header("Access-Control-Allow-Headers",
            // accessControlRequestHeaders);
            response.header("Access-Control-Allow-Headers", "*");
          }

          String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
          if (accessControlRequestMethod != null) {
            response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            response.header("Access-Control-Allow-Methods", "*");
          }

          return "OK";
        });

    before(
        (req, res) -> {
          res.header("Access-Control-Allow-Origin", "*");
          res.header("Access-Control-Allow-Headers", "*");
          res.type("application/json");
        });

    get("/ping", (req, res) -> "OK");
    get("/cookie-example", App::cookieExample, responseTransformer);
    get("/header-example", App::headerExample, responseTransformer);
    post("/login", (req, res) -> handler.login(req, res), gson::toJson);
    post("/logout", (req, res) -> handler.logout(req, res), gson::toJson);
    get("/me", (req, res) -> handler.me(req, res), gson::toJson);
    get("/user/:userId", (req, res) -> handler.getUser(req), gson::toJson);
    get("/user/:userId/feed", (req, res) -> handler.getFeed(req), gson::toJson);
  }

  private static HeaderExample headerExample(final Request request, final Response response) {
    String accessToken = Optional.ofNullable(request.headers("access-token")).orElseThrow();
    response.header("current-time", "now");
    response.header("my-app-header", "yeet");
    return new HeaderExampleBuilder().build();
  }

  @AutoMatter
  interface CookieExample {
    String requestCookie();

    String responseCookie();
  }

  @AutoMatter
  interface HeaderExample {
    Optional<String> request();

    Optional<String> response();
  }

  private static final Map<String, User> cookieMap = new HashMap<>();

  static {
    cookieMap.put("decafbad", new UserBuilder().id("1").name("ethan").build());
  }

  // "me" endpoint
  private static User cookieExample(final Request request, final Response response) {
    String msg = Optional.ofNullable(request.cookie("user")).orElseThrow();

    User user = cookieMap.get(msg);
    if (user == null) {
      response.status(401);
      return null;
    }

    //    response.cookie("server-msg", "yeet");

    //    return new CookieExampleBuilder().requestCookie(msg).responseCookie("yeet").build();
    return user;
  }
}
