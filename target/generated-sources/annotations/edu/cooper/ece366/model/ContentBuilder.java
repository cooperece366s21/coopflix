package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class ContentBuilder {
  private String id;

  private String title;

  private Optional<String> thumbnail;

  private Optional<String> distributorId;

  private Content.Genre genre;

  private Optional<Content.Rating> rating;

  public ContentBuilder() {
    this.thumbnail = Optional.empty();
    this.distributorId = Optional.empty();
    this.rating = Optional.empty();
  }

  private ContentBuilder(Content v) {
    this.id = v.id();
    this.title = v.title();
    this.thumbnail = v.thumbnail();
    this.distributorId = v.distributorId();
    this.genre = v.genre();
    this.rating = v.rating();
  }

  private ContentBuilder(ContentBuilder v) {
    this.id = v.id;
    this.title = v.title;
    this.thumbnail = v.thumbnail;
    this.distributorId = v.distributorId;
    this.genre = v.genre;
    this.rating = v.rating;
  }

  public String id() {
    return id;
  }

  public ContentBuilder id(String id) {
    if (id == null) {
      throw new NullPointerException("id");
    }
    this.id = id;
    return this;
  }

  public String title() {
    return title;
  }

  public ContentBuilder title(String title) {
    if (title == null) {
      throw new NullPointerException("title");
    }
    this.title = title;
    return this;
  }

  public Optional<String> thumbnail() {
    return thumbnail;
  }

  public ContentBuilder thumbnail(String thumbnail) {
    return thumbnail(Optional.ofNullable(thumbnail));
  }

  @SuppressWarnings("unchecked")
  public ContentBuilder thumbnail(Optional<? extends String> thumbnail) {
    if (thumbnail == null) {
      throw new NullPointerException("thumbnail");
    }
    this.thumbnail = (Optional<String>)thumbnail;
    return this;
  }

  public Optional<String> distributorId() {
    return distributorId;
  }

  public ContentBuilder distributorId(String distributorId) {
    return distributorId(Optional.ofNullable(distributorId));
  }

  @SuppressWarnings("unchecked")
  public ContentBuilder distributorId(Optional<? extends String> distributorId) {
    if (distributorId == null) {
      throw new NullPointerException("distributorId");
    }
    this.distributorId = (Optional<String>)distributorId;
    return this;
  }

  public Content.Genre genre() {
    return genre;
  }

  public ContentBuilder genre(Content.Genre genre) {
    if (genre == null) {
      throw new NullPointerException("genre");
    }
    this.genre = genre;
    return this;
  }

  public Optional<Content.Rating> rating() {
    return rating;
  }

  public ContentBuilder rating(Content.Rating rating) {
    return rating(Optional.ofNullable(rating));
  }

  @SuppressWarnings("unchecked")
  public ContentBuilder rating(Optional<? extends Content.Rating> rating) {
    if (rating == null) {
      throw new NullPointerException("rating");
    }
    this.rating = (Optional<Content.Rating>)rating;
    return this;
  }

  public Content build() {
    return new Value(id, title, thumbnail, distributorId, genre, rating);
  }

  public static ContentBuilder from(Content v) {
    return new ContentBuilder(v);
  }

  public static ContentBuilder from(ContentBuilder v) {
    return new ContentBuilder(v);
  }

  private static final class Value implements Content {
    private final String id;

    private final String title;

    private final Optional<String> thumbnail;

    private final Optional<String> distributorId;

    private final Content.Genre genre;

    private final Optional<Content.Rating> rating;

    private Value(@AutoMatter.Field("id") String id, @AutoMatter.Field("title") String title,
        @AutoMatter.Field("thumbnail") Optional<String> thumbnail,
        @AutoMatter.Field("distributorId") Optional<String> distributorId,
        @AutoMatter.Field("genre") Content.Genre genre,
        @AutoMatter.Field("rating") Optional<Content.Rating> rating) {
      if (id == null) {
        throw new NullPointerException("id");
      }
      if (title == null) {
        throw new NullPointerException("title");
      }
      if (thumbnail == null) {
        throw new NullPointerException("thumbnail");
      }
      if (distributorId == null) {
        throw new NullPointerException("distributorId");
      }
      if (genre == null) {
        throw new NullPointerException("genre");
      }
      if (rating == null) {
        throw new NullPointerException("rating");
      }
      this.id = id;
      this.title = title;
      this.thumbnail = thumbnail;
      this.distributorId = distributorId;
      this.genre = genre;
      this.rating = rating;
    }

    @AutoMatter.Field
    @Override
    public String id() {
      return id;
    }

    @AutoMatter.Field
    @Override
    public String title() {
      return title;
    }

    @AutoMatter.Field
    @Override
    public Optional<String> thumbnail() {
      return thumbnail;
    }

    @AutoMatter.Field
    @Override
    public Optional<String> distributorId() {
      return distributorId;
    }

    @AutoMatter.Field
    @Override
    public Content.Genre genre() {
      return genre;
    }

    @AutoMatter.Field
    @Override
    public Optional<Content.Rating> rating() {
      return rating;
    }

    public ContentBuilder builder() {
      return new ContentBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Content)) {
        return false;
      }
      final Content that = (Content) o;
      if (id != null ? !id.equals(that.id()) : that.id() != null) {
        return false;
      }
      if (title != null ? !title.equals(that.title()) : that.title() != null) {
        return false;
      }
      if (thumbnail != null ? !thumbnail.equals(that.thumbnail()) : that.thumbnail() != null) {
        return false;
      }
      if (distributorId != null ? !distributorId.equals(that.distributorId()) : that.distributorId() != null) {
        return false;
      }
      if (genre != null ? !genre.equals(that.genre()) : that.genre() != null) {
        return false;
      }
      if (rating != null ? !rating.equals(that.rating()) : that.rating() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
      result = 31 * result + (this.title != null ? this.title.hashCode() : 0);
      result = 31 * result + (this.thumbnail != null ? this.thumbnail.hashCode() : 0);
      result = 31 * result + (this.distributorId != null ? this.distributorId.hashCode() : 0);
      result = 31 * result + (this.genre != null ? this.genre.hashCode() : 0);
      result = 31 * result + (this.rating != null ? this.rating.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Content{" +
      "id=" + id +
      ", title=" + title +
      ", thumbnail=" + thumbnail +
      ", distributorId=" + distributorId +
      ", genre=" + genre +
      ", rating=" + rating +
      '}';
    }
  }
}
