package edu.cooper.ece366.model;

import io.norberg.automatter.AutoMatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class ShowBuilder {
  private String id;

  private String title;

  private Optional<String> thumbnail;

  private Optional<String> distributorId;

  private Content.Genre genre;

  private Optional<Content.Rating> rating;

  private Optional<String> synopsis;

  private List<Season> seasons;

  public ShowBuilder() {
    this.thumbnail = Optional.empty();
    this.distributorId = Optional.empty();
    this.rating = Optional.empty();
    this.synopsis = Optional.empty();
  }

  private ShowBuilder(Show v) {
    this.id = v.id();
    this.title = v.title();
    this.thumbnail = v.thumbnail();
    this.distributorId = v.distributorId();
    this.genre = v.genre();
    this.rating = v.rating();
    this.synopsis = v.synopsis();
    List<Season> _seasons = v.seasons();
    this.seasons = (_seasons == null) ? null : new ArrayList<Season>(_seasons);
  }

  private ShowBuilder(ShowBuilder v) {
    this.id = v.id;
    this.title = v.title;
    this.thumbnail = v.thumbnail;
    this.distributorId = v.distributorId;
    this.genre = v.genre;
    this.rating = v.rating;
    this.synopsis = v.synopsis;
    this.seasons = (v.seasons == null) ? null : new ArrayList<Season>(v.seasons);
  }

  public String id() {
    return id;
  }

  public ShowBuilder id(String id) {
    if (id == null) {
      throw new NullPointerException("id");
    }
    this.id = id;
    return this;
  }

  public String title() {
    return title;
  }

  public ShowBuilder title(String title) {
    if (title == null) {
      throw new NullPointerException("title");
    }
    this.title = title;
    return this;
  }

  public Optional<String> thumbnail() {
    return thumbnail;
  }

  public ShowBuilder thumbnail(String thumbnail) {
    return thumbnail(Optional.ofNullable(thumbnail));
  }

  @SuppressWarnings("unchecked")
  public ShowBuilder thumbnail(Optional<? extends String> thumbnail) {
    if (thumbnail == null) {
      throw new NullPointerException("thumbnail");
    }
    this.thumbnail = (Optional<String>)thumbnail;
    return this;
  }

  public Optional<String> distributorId() {
    return distributorId;
  }

  public ShowBuilder distributorId(String distributorId) {
    return distributorId(Optional.ofNullable(distributorId));
  }

  @SuppressWarnings("unchecked")
  public ShowBuilder distributorId(Optional<? extends String> distributorId) {
    if (distributorId == null) {
      throw new NullPointerException("distributorId");
    }
    this.distributorId = (Optional<String>)distributorId;
    return this;
  }

  public Content.Genre genre() {
    return genre;
  }

  public ShowBuilder genre(Content.Genre genre) {
    if (genre == null) {
      throw new NullPointerException("genre");
    }
    this.genre = genre;
    return this;
  }

  public Optional<Content.Rating> rating() {
    return rating;
  }

  public ShowBuilder rating(Content.Rating rating) {
    return rating(Optional.ofNullable(rating));
  }

  @SuppressWarnings("unchecked")
  public ShowBuilder rating(Optional<? extends Content.Rating> rating) {
    if (rating == null) {
      throw new NullPointerException("rating");
    }
    this.rating = (Optional<Content.Rating>)rating;
    return this;
  }

  public Optional<String> synopsis() {
    return synopsis;
  }

  public ShowBuilder synopsis(String synopsis) {
    return synopsis(Optional.ofNullable(synopsis));
  }

  @SuppressWarnings("unchecked")
  public ShowBuilder synopsis(Optional<? extends String> synopsis) {
    if (synopsis == null) {
      throw new NullPointerException("synopsis");
    }
    this.synopsis = (Optional<String>)synopsis;
    return this;
  }

  public List<Season> seasons() {
    if (this.seasons == null) {
      this.seasons = new ArrayList<Season>();
    }
    return seasons;
  }

  public ShowBuilder seasons(List<? extends Season> seasons) {
    return seasons((Collection<? extends Season>) seasons);
  }

  public ShowBuilder seasons(Collection<? extends Season> seasons) {
    if (seasons == null) {
      throw new NullPointerException("seasons");
    }
    for (Season item : seasons) {
      if (item == null) {
        throw new NullPointerException("seasons: null item");
      }
    }
    this.seasons = new ArrayList<Season>(seasons);
    return this;
  }

  public ShowBuilder seasons(Iterable<? extends Season> seasons) {
    if (seasons == null) {
      throw new NullPointerException("seasons");
    }
    if (seasons instanceof Collection) {
      return seasons((Collection<? extends Season>) seasons);
    }
    return seasons(seasons.iterator());
  }

  public ShowBuilder seasons(Iterator<? extends Season> seasons) {
    if (seasons == null) {
      throw new NullPointerException("seasons");
    }
    this.seasons = new ArrayList<Season>();
    while (seasons.hasNext()) {
      Season item = seasons.next();
      if (item == null) {
        throw new NullPointerException("seasons: null item");
      }
      this.seasons.add(item);
    }
    return this;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public final ShowBuilder seasons(Season... seasons) {
    if (seasons == null) {
      throw new NullPointerException("seasons");
    }
    return seasons(Arrays.asList(seasons));
  }

  public ShowBuilder addSeason(Season season) {
    if (season == null) {
      throw new NullPointerException("season");
    }
    if (this.seasons == null) {
      this.seasons = new ArrayList<Season>();
    }
    seasons.add(season);
    return this;
  }

  public Show build() {
    List<Season> _seasons = (seasons != null) ? Collections.unmodifiableList(new ArrayList<Season>(seasons)) : Collections.<Season>emptyList();
    return new Value(id, title, thumbnail, distributorId, genre, rating, synopsis, _seasons);
  }

  public static ShowBuilder from(Show v) {
    return new ShowBuilder(v);
  }

  public static ShowBuilder from(ShowBuilder v) {
    return new ShowBuilder(v);
  }

  private static final class Value implements Show {
    private final String id;

    private final String title;

    private final Optional<String> thumbnail;

    private final Optional<String> distributorId;

    private final Content.Genre genre;

    private final Optional<Content.Rating> rating;

    private final Optional<String> synopsis;

    private final List<Season> seasons;

    private Value(@AutoMatter.Field("id") String id, @AutoMatter.Field("title") String title,
        @AutoMatter.Field("thumbnail") Optional<String> thumbnail,
        @AutoMatter.Field("distributorId") Optional<String> distributorId,
        @AutoMatter.Field("genre") Content.Genre genre,
        @AutoMatter.Field("rating") Optional<Content.Rating> rating,
        @AutoMatter.Field("synopsis") Optional<String> synopsis,
        @AutoMatter.Field("seasons") List<Season> seasons) {
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
      if (synopsis == null) {
        throw new NullPointerException("synopsis");
      }
      this.id = id;
      this.title = title;
      this.thumbnail = thumbnail;
      this.distributorId = distributorId;
      this.genre = genre;
      this.rating = rating;
      this.synopsis = synopsis;
      this.seasons = (seasons != null) ? seasons : Collections.<Season>emptyList();
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
    public Optional<String> synopsis() {
      return synopsis;
    }

    @AutoMatter.Field
    @Override
    public List<Season> seasons() {
      return seasons;
    }

    public ShowBuilder builder() {
      return new ShowBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Show)) {
        return false;
      }
      final Show that = (Show) o;
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
      if (synopsis != null ? !synopsis.equals(that.synopsis()) : that.synopsis() != null) {
        return false;
      }
      if (seasons != null ? !seasons.equals(that.seasons()) : that.seasons() != null) {
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
      result = 31 * result + (this.synopsis != null ? this.synopsis.hashCode() : 0);
      result = 31 * result + (this.seasons != null ? this.seasons.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Show{" +
      "id=" + id +
      ", title=" + title +
      ", thumbnail=" + thumbnail +
      ", distributorId=" + distributorId +
      ", genre=" + genre +
      ", rating=" + rating +
      ", synopsis=" + synopsis +
      ", seasons=" + seasons +
      '}';
    }
  }
}
