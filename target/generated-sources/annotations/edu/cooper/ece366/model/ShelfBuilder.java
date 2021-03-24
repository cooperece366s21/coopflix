package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class ShelfBuilder {
  private String title;

  private List<Content> shelfItems;

  public ShelfBuilder() {
  }

  private ShelfBuilder(Shelf v) {
    this.title = v.title();
    List<Content> _shelfItems = v.shelfItems();
    this.shelfItems = (_shelfItems == null) ? null : new ArrayList<Content>(_shelfItems);
  }

  private ShelfBuilder(ShelfBuilder v) {
    this.title = v.title;
    this.shelfItems = (v.shelfItems == null) ? null : new ArrayList<Content>(v.shelfItems);
  }

  public String title() {
    return title;
  }

  public ShelfBuilder title(String title) {
    if (title == null) {
      throw new NullPointerException("title");
    }
    this.title = title;
    return this;
  }

  public List<Content> shelfItems() {
    if (this.shelfItems == null) {
      this.shelfItems = new ArrayList<Content>();
    }
    return shelfItems;
  }

  public ShelfBuilder shelfItems(List<? extends Content> shelfItems) {
    return shelfItems((Collection<? extends Content>) shelfItems);
  }

  public ShelfBuilder shelfItems(Collection<? extends Content> shelfItems) {
    if (shelfItems == null) {
      throw new NullPointerException("shelfItems");
    }
    for (Content item : shelfItems) {
      if (item == null) {
        throw new NullPointerException("shelfItems: null item");
      }
    }
    this.shelfItems = new ArrayList<Content>(shelfItems);
    return this;
  }

  public ShelfBuilder shelfItems(Iterable<? extends Content> shelfItems) {
    if (shelfItems == null) {
      throw new NullPointerException("shelfItems");
    }
    if (shelfItems instanceof Collection) {
      return shelfItems((Collection<? extends Content>) shelfItems);
    }
    return shelfItems(shelfItems.iterator());
  }

  public ShelfBuilder shelfItems(Iterator<? extends Content> shelfItems) {
    if (shelfItems == null) {
      throw new NullPointerException("shelfItems");
    }
    this.shelfItems = new ArrayList<Content>();
    while (shelfItems.hasNext()) {
      Content item = shelfItems.next();
      if (item == null) {
        throw new NullPointerException("shelfItems: null item");
      }
      this.shelfItems.add(item);
    }
    return this;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public final ShelfBuilder shelfItems(Content... shelfItems) {
    if (shelfItems == null) {
      throw new NullPointerException("shelfItems");
    }
    return shelfItems(Arrays.asList(shelfItems));
  }

  public ShelfBuilder addShelfItem(Content shelfItem) {
    if (shelfItem == null) {
      throw new NullPointerException("shelfItem");
    }
    if (this.shelfItems == null) {
      this.shelfItems = new ArrayList<Content>();
    }
    shelfItems.add(shelfItem);
    return this;
  }

  public Shelf build() {
    List<Content> _shelfItems = (shelfItems != null) ? Collections.unmodifiableList(new ArrayList<Content>(shelfItems)) : Collections.<Content>emptyList();
    return new Value(title, _shelfItems);
  }

  public static ShelfBuilder from(Shelf v) {
    return new ShelfBuilder(v);
  }

  public static ShelfBuilder from(ShelfBuilder v) {
    return new ShelfBuilder(v);
  }

  private static final class Value implements Shelf {
    private final String title;

    private final List<Content> shelfItems;

    private Value(@AutoMatter.Field("title") String title,
        @AutoMatter.Field("shelfItems") List<Content> shelfItems) {
      if (title == null) {
        throw new NullPointerException("title");
      }
      this.title = title;
      this.shelfItems = (shelfItems != null) ? shelfItems : Collections.<Content>emptyList();
    }

    @AutoMatter.Field
    @Override
    public String title() {
      return title;
    }

    @AutoMatter.Field
    @Override
    public List<Content> shelfItems() {
      return shelfItems;
    }

    public ShelfBuilder builder() {
      return new ShelfBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Shelf)) {
        return false;
      }
      final Shelf that = (Shelf) o;
      if (title != null ? !title.equals(that.title()) : that.title() != null) {
        return false;
      }
      if (shelfItems != null ? !shelfItems.equals(that.shelfItems()) : that.shelfItems() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
      result = 31 * result + (this.shelfItems != null ? this.shelfItems.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Shelf{" +
      "title=" + title +
      ", shelfItems=" + shelfItems +
      '}';
    }
  }
}
