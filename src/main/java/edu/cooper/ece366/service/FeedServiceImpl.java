package edu.cooper.ece366.service;

import edu.cooper.ece366.model.Content.Genre;
import edu.cooper.ece366.model.Feed;
import edu.cooper.ece366.model.FeedBuilder;
import edu.cooper.ece366.model.Shelf;
import edu.cooper.ece366.model.ShelfBuilder;
import edu.cooper.ece366.model.User;
import edu.cooper.ece366.store.ContentStore;
import java.util.List;
import java.util.stream.Collectors;

public class FeedServiceImpl implements FeedService {

  private final ContentStore contentStore;

  public FeedServiceImpl(ContentStore contentStore) {
    this.contentStore = contentStore;
  }

  @Override
  public Feed getFeedForUser(final User user) {
    // very simple: fetch all preferred genres, grab description, separate shelves by genre
    List<Shelf> shelves =
        user.preferredGenres().stream()
            .map(contentStore::getByGenre)
            .filter(list -> !list.isEmpty())
            .map(
                items ->
                    new ShelfBuilder()
                        .shelfItems(items)
                        .title(getShelfDescription(items.get(0).genre()))
                        .build())
            .collect(Collectors.toList());

    return new FeedBuilder().shelves(shelves).build();
  }

  private String getShelfDescription(Genre genre) {
    switch (genre) {
      case COMEDY:
        return "because you like laughies";
      case HORROR:
        return "because your partner doesn't appreciate being scared";
      case MYSTERY:
        return "you like puzzles, don't you?";
      case ACTION:
        return "it's all in the thrills";
      case DRAMA:
        return "sometimes a good cry is good for your health";
      default:
        throw new IllegalStateException("Unexpected value: " + genre);
    }
  }
}
