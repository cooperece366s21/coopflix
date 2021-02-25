package edu.cooper.ece366.model;

import edu.cooper.ece366.model.Content.Genre;
import io.norberg.automatter.AutoMatter;
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
    SINGLE_HD
  }
}
