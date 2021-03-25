package edu.cooper.ece366.model;

import edu.cooper.ece366.model.Content.Genre;
import io.norberg.automatter.AutoMatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@AutoMatter
public interface User {
  String id();

  String name();

  Optional<Subscription> subscription();

  List<Genre> preferredGenres();

  enum Subscription {
    FAMILY_BASIC,
    FAMILY_HD,
    SINGLE_BASIC,
    SINGLE_HD;

    public static Optional<Subscription> fromDbValue(String dbValue) {
      return Arrays.asList(Subscription.values())
          .stream()
          .filter(s -> dbValue.equalsIgnoreCase(s.name()))
          .findFirst();
    }
  }
}
