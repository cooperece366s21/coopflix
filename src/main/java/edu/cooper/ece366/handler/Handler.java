package edu.cooper.ece366.handler;

import com.google.gson.Gson;
import edu.cooper.ece366.auth.Auth;
import edu.cooper.ece366.auth.AuthStore;
import edu.cooper.ece366.model.Feed;
import edu.cooper.ece366.model.User;
import edu.cooper.ece366.service.FeedService;
import edu.cooper.ece366.store.UserStore;
import java.util.Optional;
import spark.Request;
import spark.Response;

public class Handler {

  private final UserStore userStore;
  private final FeedService feedService;
  private final AuthStore authStore;
  private final Gson gson;

  public Handler(
      UserStore userStore, FeedService feedService, final AuthStore authStore, final Gson gson) {
    this.userStore = userStore;
    this.feedService = feedService;
    this.authStore = authStore;
    this.gson = gson;
  }

  public User getUser(Request request) {
    String userId = request.params(":userId");
    return userStore.get(userId);
  }

  public Feed getFeed(Request request) {
    String token = request.headers("coopflixuser");
    User userFromCookie = authStore.getUser(token).get();
    User userFromRequest = getUser(request);
    if (userFromCookie != userFromRequest) {
      // throw or return
    }
    return feedService.getFeedForUser(userFromRequest);
  }

  public User login(final Request request, final Response response) {
    Auth auth = gson.fromJson(request.body(), Auth.class);
    User user = userStore.get(auth.username());
    if ("password".equals(auth.password())) {
      // authorized
      String token = authStore.setUser(user);
      response.header("coopflixuser", token);
      response.status(200);
      return user;
    }
    // unauthorized
    response.status(401);

    return null;
  }

  public Object logout(final Request req, final Response res) {
    authStore.invalidate(req.headers("coopflixuser"));
    res.status(200);

    return null;
  }

  public User me(final Request req, final Response res) {
    String token = req.headers("coopflixuser");
    if (token == null) {
      res.status(401);
      return null;
    }
    Optional<User> user = authStore.getUser(token);
    if (user.isPresent()) {
      return user.get();
    } else {
      res.status(401);
      return null;
    }
  }
}
