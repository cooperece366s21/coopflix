package edu.cooper.ece366.model;

import java.util.Optional;

public interface PlayableContent extends Content {
  Optional<String> fileId();

  Optional<Integer> length();

  Optional<String> description();
}
