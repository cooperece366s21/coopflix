package edu.cooper.ece366.store;

import edu.cooper.ece366.model.Content.Genre;
import edu.cooper.ece366.model.User;
import edu.cooper.ece366.model.User.Subscription;
import edu.cooper.ece366.model.UserBuilder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

public class CoopflixJdbi {

  public static Jdbi create(String jdbcUrl) {
    Jdbi jdbi = Jdbi.create(jdbcUrl, "root", "password");
    jdbi.installPlugin(new SqlObjectPlugin());
    // you can register row mappers here or you can use @RegisterRowMapper annotation on each Dao
    // method
    //    jdbi.registerRowMapper(new UserMapper());
    return jdbi;
  }

  public static class UserRowMapper implements RowMapper<User> {
    @Override
    public User map(final ResultSet rs, final StatementContext ctx) throws SQLException {
      String id = rs.getString("id");
      String name = rs.getString("name");
      String subscription = rs.getString("subscription");
      //      List<Genre> genres =
      //          Arrays.stream((String[]) rs.getArray("genres").getArray())
      //              .map(Genre::fromDbValue)
      //              .collect(Collectors.toList());
      List<Genre> genres =
          Arrays.stream(rs.getString("genres").split(",", -1))
              .map(Genre::fromDbValue)
              .collect(Collectors.toList());
      return new UserBuilder()
          .id(id)
          .name(name)
          .subscription(Subscription.fromDbValue(subscription))
          .preferredGenres(genres)
          .build();
    }
  }
}
