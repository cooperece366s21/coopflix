package edu.cooper.ece366.store;

import edu.cooper.ece366.model.Content;
import edu.cooper.ece366.model.Content.Genre;
import edu.cooper.ece366.model.Content.Rating;
import edu.cooper.ece366.model.User;
import java.util.List;

public interface ContentStore {

  Content get(String id);

  List<Content> getByGenre(Genre genre);

  List<Content> getByRating(Rating rating);

  void playContent(String id, User user);
}
