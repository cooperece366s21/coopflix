package edu.cooper.ece366;

import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.initExceptionHandler;
import static spark.Spark.options;
import static spark.Spark.post;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.cooper.ece366.auth.AuthStoreImpl;
import edu.cooper.ece366.handler.Handler;
import edu.cooper.ece366.service.FeedServiceImpl;
import edu.cooper.ece366.store.ContentStoreImpl;
import edu.cooper.ece366.store.UserStoreImpl;
import io.norberg.automatter.gson.AutoMatterTypeAdapterFactory;

public class App {
  public static void main(String[] args) {
    Gson gson =
        new GsonBuilder().registerTypeAdapterFactory(new AutoMatterTypeAdapterFactory()).create();

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
//            response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
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
    post("/login", (req, res) -> handler.login(req, res), gson::toJson);
    get("/logout", (req, res) -> handler.logout(req, res), gson::toJson);
    get("/me", (req, res) -> handler.me(req, res), gson::toJson);
    get("/user/:userId", (req, res) -> handler.getUser(req), gson::toJson);
    get("/user/:userId/feed", (req, res) -> handler.getFeed(req), gson::toJson);
  }
}
