package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.Optional;

@AutoMatter
public interface Content {

  String id();

  String title();

  Optional<String> thumbnail();

  Optional<String> distributorId();

  Genre genre();

  Optional<Rating> rating();

  enum Genre {
    COMEDY,
    HORROR,
    MYSTERY,
    ACTION,
    DRAMA
  }

  enum Rating {
    G,
    PG,
    PG13,
    R
  }
}
