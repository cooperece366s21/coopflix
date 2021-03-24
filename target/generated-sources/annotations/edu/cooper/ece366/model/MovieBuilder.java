package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class MovieBuilder {
  private String id;

  private String title;

  private Optional<String> thumbnail;

  private Optional<String> distributorId;

  private Content.Genre genre;

  private Optional<Content.Rating> rating;

  private Optional<String> fileId;

  private Optional<Integer> length;

  private Optional<String> description;

  public MovieBuilder() {
    this.thumbnail = Optional.empty();
    this.distributorId = Optional.empty();
    this.rating = Optional.empty();
    this.fileId = Optional.empty();
    this.length = Optional.empty();
    this.description = Optional.empty();
  }

  private MovieBuilder(Movie v) {
    this.id = v.id();
    this.title = v.title();
    this.thumbnail = v.thumbnail();
    this.distributorId = v.distributorId();
    this.genre = v.genre();
    this.rating = v.rating();
    this.fileId = v.fileId();
    this.length = v.length();
    this.description = v.description();
  }

  private MovieBuilder(MovieBuilder v) {
    this.id = v.id;
    this.title = v.title;
    this.thumbnail = v.thumbnail;
    this.distributorId = v.distributorId;
    this.genre = v.genre;
    this.rating = v.rating;
    this.fileId = v.fileId;
    this.length = v.length;
    this.description = v.description;
  }

  public String id() {
    return id;
  }

  public MovieBuilder id(String id) {
    if (id == null) {
      throw new NullPointerException("id");
    }
    this.id = id;
    return this;
  }

  public String title() {
    return title;
  }

  public MovieBuilder title(String title) {
    if (title == null) {
      throw new NullPointerException("title");
    }
    this.title = title;
    return this;
  }

  public Optional<String> thumbnail() {
    return thumbnail;
  }

  public MovieBuilder thumbnail(String thumbnail) {
    return thumbnail(Optional.ofNullable(thumbnail));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder thumbnail(Optional<? extends String> thumbnail) {
    if (thumbnail == null) {
      throw new NullPointerException("thumbnail");
    }
    this.thumbnail = (Optional<String>)thumbnail;
    return this;
  }

  public Optional<String> distributorId() {
    return distributorId;
  }

  public MovieBuilder distributorId(String distributorId) {
    return distributorId(Optional.ofNullable(distributorId));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder distributorId(Optional<? extends String> distributorId) {
    if (distributorId == null) {
      throw new NullPointerException("distributorId");
    }
    this.distributorId = (Optional<String>)distributorId;
    return this;
  }

  public Content.Genre genre() {
    return genre;
  }

  public MovieBuilder genre(Content.Genre genre) {
    if (genre == null) {
      throw new NullPointerException("genre");
    }
    this.genre = genre;
    return this;
  }

  public Optional<Content.Rating> rating() {
    return rating;
  }

  public MovieBuilder rating(Content.Rating rating) {
    return rating(Optional.ofNullable(rating));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder rating(Optional<? extends Content.Rating> rating) {
    if (rating == null) {
      throw new NullPointerException("rating");
    }
    this.rating = (Optional<Content.Rating>)rating;
    return this;
  }

  public Optional<String> fileId() {
    return fileId;
  }

  public MovieBuilder fileId(String fileId) {
    return fileId(Optional.ofNullable(fileId));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder fileId(Optional<? extends String> fileId) {
    if (fileId == null) {
      throw new NullPointerException("fileId");
    }
    this.fileId = (Optional<String>)fileId;
    return this;
  }

  public Optional<Integer> length() {
    return length;
  }

  public MovieBuilder length(Integer length) {
    return length(Optional.ofNullable(length));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder length(Optional<? extends Integer> length) {
    if (length == null) {
      throw new NullPointerException("length");
    }
    this.length = (Optional<Integer>)length;
    return this;
  }

  public Optional<String> description() {
    return description;
  }

  public MovieBuilder description(String description) {
    return description(Optional.ofNullable(description));
  }

  @SuppressWarnings("unchecked")
  public MovieBuilder description(Optional<? extends String> description) {
    if (description == null) {
      throw new NullPointerException("description");
    }
    this.description = (Optional<String>)description;
    return this;
  }

  public Movie build() {
    return new Value(id, title, thumbnail, distributorId, genre, rating, fileId, length, description);
  }

  public static MovieBuilder from(Movie v) {
    return new MovieBuilder(v);
  }

  public static MovieBuilder from(MovieBuilder v) {
    return new MovieBuilder(v);
  }

  private static final class Value implements Movie {
    private final String id;

    private final String title;

    private final Optional<String> thumbnail;

    private final Optional<String> distributorId;

    private final Content.Genre genre;

    private final Optional<Content.Rating> rating;

    private final Optional<String> fileId;

    private final Optional<Integer> length;

    private final Optional<String> description;

    private Value(@AutoMatter.Field("id") String id, @AutoMatter.Field("title") String title,
        @AutoMatter.Field("thumbnail") Optional<String> thumbnail,
        @AutoMatter.Field("distributorId") Optional<String> distributorId,
        @AutoMatter.Field("genre") Content.Genre genre,
        @AutoMatter.Field("rating") Optional<Content.Rating> rating,
        @AutoMatter.Field("fileId") Optional<String> fileId,
        @AutoMatter.Field("length") Optional<Integer> length,
        @AutoMatter.Field("description") Optional<String> description) {
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
      if (fileId == null) {
        throw new NullPointerException("fileId");
      }
      if (length == null) {
        throw new NullPointerException("length");
      }
      if (description == null) {
        throw new NullPointerException("description");
      }
      this.id = id;
      this.title = title;
      this.thumbnail = thumbnail;
      this.distributorId = distributorId;
      this.genre = genre;
      this.rating = rating;
      this.fileId = fileId;
      this.length = length;
      this.description = description;
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

    @AutoMatter.Field
    @Override
    public Optional<String> fileId() {
      return fileId;
    }

    @AutoMatter.Field
    @Override
    public Optional<Integer> length() {
      return length;
    }

    @AutoMatter.Field
    @Override
    public Optional<String> description() {
      return description;
    }

    public MovieBuilder builder() {
      return new MovieBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Movie)) {
        return false;
      }
      final Movie that = (Movie) o;
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
      if (fileId != null ? !fileId.equals(that.fileId()) : that.fileId() != null) {
        return false;
      }
      if (length != null ? !length.equals(that.length()) : that.length() != null) {
        return false;
      }
      if (description != null ? !description.equals(that.description()) : that.description() != null) {
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
      result = 31 * result + (this.fileId != null ? this.fileId.hashCode() : 0);
      result = 31 * result + (this.length != null ? this.length.hashCode() : 0);
      result = 31 * result + (this.description != null ? this.description.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Movie{" +
      "id=" + id +
      ", title=" + title +
      ", thumbnail=" + thumbnail +
      ", distributorId=" + distributorId +
      ", genre=" + genre +
      ", rating=" + rating +
      ", fileId=" + fileId +
      ", length=" + length +
      ", description=" + description +
      '}';
    }
  }
}
