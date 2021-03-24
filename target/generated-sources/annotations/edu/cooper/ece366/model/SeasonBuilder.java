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
public final class SeasonBuilder {
  private List<Episode> episodes;

  public SeasonBuilder() {
  }

  private SeasonBuilder(Season v) {
    List<Episode> _episodes = v.episodes();
    this.episodes = (_episodes == null) ? null : new ArrayList<Episode>(_episodes);
  }

  private SeasonBuilder(SeasonBuilder v) {
    this.episodes = (v.episodes == null) ? null : new ArrayList<Episode>(v.episodes);
  }

  public List<Episode> episodes() {
    if (this.episodes == null) {
      this.episodes = new ArrayList<Episode>();
    }
    return episodes;
  }

  public SeasonBuilder episodes(List<? extends Episode> episodes) {
    return episodes((Collection<? extends Episode>) episodes);
  }

  public SeasonBuilder episodes(Collection<? extends Episode> episodes) {
    if (episodes == null) {
      throw new NullPointerException("episodes");
    }
    for (Episode item : episodes) {
      if (item == null) {
        throw new NullPointerException("episodes: null item");
      }
    }
    this.episodes = new ArrayList<Episode>(episodes);
    return this;
  }

  public SeasonBuilder episodes(Iterable<? extends Episode> episodes) {
    if (episodes == null) {
      throw new NullPointerException("episodes");
    }
    if (episodes instanceof Collection) {
      return episodes((Collection<? extends Episode>) episodes);
    }
    return episodes(episodes.iterator());
  }

  public SeasonBuilder episodes(Iterator<? extends Episode> episodes) {
    if (episodes == null) {
      throw new NullPointerException("episodes");
    }
    this.episodes = new ArrayList<Episode>();
    while (episodes.hasNext()) {
      Episode item = episodes.next();
      if (item == null) {
        throw new NullPointerException("episodes: null item");
      }
      this.episodes.add(item);
    }
    return this;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public final SeasonBuilder episodes(Episode... episodes) {
    if (episodes == null) {
      throw new NullPointerException("episodes");
    }
    return episodes(Arrays.asList(episodes));
  }

  public SeasonBuilder addEpisode(Episode episode) {
    if (episode == null) {
      throw new NullPointerException("episode");
    }
    if (this.episodes == null) {
      this.episodes = new ArrayList<Episode>();
    }
    episodes.add(episode);
    return this;
  }

  public Season build() {
    List<Episode> _episodes = (episodes != null) ? Collections.unmodifiableList(new ArrayList<Episode>(episodes)) : Collections.<Episode>emptyList();
    return new Value(_episodes);
  }

  public static SeasonBuilder from(Season v) {
    return new SeasonBuilder(v);
  }

  public static SeasonBuilder from(SeasonBuilder v) {
    return new SeasonBuilder(v);
  }

  private static final class Value implements Season {
    private final List<Episode> episodes;

    private Value(@AutoMatter.Field("episodes") List<Episode> episodes) {
      this.episodes = (episodes != null) ? episodes : Collections.<Episode>emptyList();
    }

    @AutoMatter.Field
    @Override
    public List<Episode> episodes() {
      return episodes;
    }

    public SeasonBuilder builder() {
      return new SeasonBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Season)) {
        return false;
      }
      final Season that = (Season) o;
      if (episodes != null ? !episodes.equals(that.episodes()) : that.episodes() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.episodes != null ? this.episodes.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Season{" +
      "episodes=" + episodes +
      '}';
    }
  }
}
