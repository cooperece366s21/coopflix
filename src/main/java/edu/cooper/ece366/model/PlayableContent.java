package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.Optional;

@AutoMatter
public interface PlayableContent extends Content {
  Optional<String> fileId();

  Optional<Integer> length();

  Optional<String> description();
}
