package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.List;
import java.util.Optional;

@AutoMatter
public interface Show extends Content {
  Optional<String> synopsis();

  List<Season> seasons();
}
