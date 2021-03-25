package edu.cooper.ece366.store;

import edu.cooper.ece366.model.User;
import org.jdbi.v3.core.Jdbi;

public class UserStoreMysql implements UserStore {

  // for testing purposes
  public static void main(String[] args) {
    UserStoreMysql userStoreMysql =
        new UserStoreMysql(
            CoopflixJdbi.create("jdbc:mysql://localhost:3306/coopflix?serverTimezone=UTC"));

    String userId = "0c6d7ffd-7717-4e2f-b769-238154906e6b";
    User user = userStoreMysql.get(userId);
    System.out.println(user);
  }

  private final Jdbi jdbi;

  public UserStoreMysql(final Jdbi jdbi) {
    this.jdbi = jdbi;
  }

  @Override
  public User get(final String id) {
    return jdbi.withHandle(handle -> handle.attach(UserDao.class).getUser(id));
  }
}
