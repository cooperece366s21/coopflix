package edu.cooper.ece366.store;

import edu.cooper.ece366.model.User;
import edu.cooper.ece366.model.User.Subscription;
import java.util.UUID;
import org.jdbi.v3.core.Jdbi;

public class UserStoreMysql implements UserStore {

  // for testing purposes
  public static void main(String[] args) {
    UserStoreMysql userStoreMysql =
        new UserStoreMysql(
            CoopflixJdbi.create("jdbc:mysql://localhost:3306/coopflix?serverTimezone=UTC"));

    //    String userId = UUID.randomUUID().toString();
    //    User user = userStoreMysql.get(userId);
    //    System.out.println(user);

    User yeet = userStoreMysql.add("yeet", Subscription.FAMILY_HD);

    User userAfterWrite = userStoreMysql.get(yeet.id());
    System.out.println(userAfterWrite);
  }

  private final Jdbi jdbi;

  public UserStoreMysql(final Jdbi jdbi) {
    this.jdbi = jdbi;
  }

  @Override
  public User get(final String id) {
    return jdbi.withHandle(handle -> handle.attach(UserDao.class).getUser(id));
  }

  @Override
  public User add(final String name, final Subscription subscription) {
    String id = UUID.randomUUID().toString();
    jdbi.useHandle(
        handle -> {
          handle.attach(UserDao.class).insertUser(id, name, subscription);
        });
    return get(id);
  }
}
