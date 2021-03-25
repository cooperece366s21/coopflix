package edu.cooper.ece366.store;

import edu.cooper.ece366.model.User;
import edu.cooper.ece366.model.User.Subscription;

public interface UserStore {

  User get(String id);

  User add(String name, Subscription subscription);
}
