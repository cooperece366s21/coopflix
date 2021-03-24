package edu.cooper.ece366.auth;

import edu.cooper.ece366.model.User;
import java.util.Optional;

public interface AuthStore {

  // validates cookie value
  Boolean validate(User user, String cookie);

  Optional<User> getUser(String cookie);

  // returns cookie value
  String setUser(User user);

  // invalidates cookie
  void invalidate(String cookie);
}
