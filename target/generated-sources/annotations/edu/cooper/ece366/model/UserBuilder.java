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
public final class UserBuilder {
  private String id;

  private String name;

  private Optional<User.Subscription> subscription;

  private List<Content.Genre> preferredGenres;

  public UserBuilder() {
    this.subscription = Optional.empty();
  }

  private UserBuilder(User v) {
    this.id = v.id();
    this.name = v.name();
    this.subscription = v.subscription();
    List<Content.Genre> _preferredGenres = v.preferredGenres();
    this.preferredGenres = (_preferredGenres == null) ? null : new ArrayList<Content.Genre>(_preferredGenres);
  }

  private UserBuilder(UserBuilder v) {
    this.id = v.id;
    this.name = v.name;
    this.subscription = v.subscription;
    this.preferredGenres = (v.preferredGenres == null) ? null : new ArrayList<Content.Genre>(v.preferredGenres);
  }

  public String id() {
    return id;
  }

  public UserBuilder id(String id) {
    if (id == null) {
      throw new NullPointerException("id");
    }
    this.id = id;
    return this;
  }

  public String name() {
    return name;
  }

  public UserBuilder name(String name) {
    if (name == null) {
      throw new NullPointerException("name");
    }
    this.name = name;
    return this;
  }

  public Optional<User.Subscription> subscription() {
    return subscription;
  }

  public UserBuilder subscription(User.Subscription subscription) {
    return subscription(Optional.ofNullable(subscription));
  }

  @SuppressWarnings("unchecked")
  public UserBuilder subscription(Optional<? extends User.Subscription> subscription) {
    if (subscription == null) {
      throw new NullPointerException("subscription");
    }
    this.subscription = (Optional<User.Subscription>)subscription;
    return this;
  }

  public List<Content.Genre> preferredGenres() {
    if (this.preferredGenres == null) {
      this.preferredGenres = new ArrayList<Content.Genre>();
    }
    return preferredGenres;
  }

  public UserBuilder preferredGenres(List<? extends Content.Genre> preferredGenres) {
    return preferredGenres((Collection<? extends Content.Genre>) preferredGenres);
  }

  public UserBuilder preferredGenres(Collection<? extends Content.Genre> preferredGenres) {
    if (preferredGenres == null) {
      throw new NullPointerException("preferredGenres");
    }
    for (Content.Genre item : preferredGenres) {
      if (item == null) {
        throw new NullPointerException("preferredGenres: null item");
      }
    }
    this.preferredGenres = new ArrayList<Content.Genre>(preferredGenres);
    return this;
  }

  public UserBuilder preferredGenres(Iterable<? extends Content.Genre> preferredGenres) {
    if (preferredGenres == null) {
      throw new NullPointerException("preferredGenres");
    }
    if (preferredGenres instanceof Collection) {
      return preferredGenres((Collection<? extends Content.Genre>) preferredGenres);
    }
    return preferredGenres(preferredGenres.iterator());
  }

  public UserBuilder preferredGenres(Iterator<? extends Content.Genre> preferredGenres) {
    if (preferredGenres == null) {
      throw new NullPointerException("preferredGenres");
    }
    this.preferredGenres = new ArrayList<Content.Genre>();
    while (preferredGenres.hasNext()) {
      Content.Genre item = preferredGenres.next();
      if (item == null) {
        throw new NullPointerException("preferredGenres: null item");
      }
      this.preferredGenres.add(item);
    }
    return this;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public final UserBuilder preferredGenres(Content.Genre... preferredGenres) {
    if (preferredGenres == null) {
      throw new NullPointerException("preferredGenres");
    }
    return preferredGenres(Arrays.asList(preferredGenres));
  }

  public UserBuilder addPreferredGenre(Content.Genre preferredGenre) {
    if (preferredGenre == null) {
      throw new NullPointerException("preferredGenre");
    }
    if (this.preferredGenres == null) {
      this.preferredGenres = new ArrayList<Content.Genre>();
    }
    preferredGenres.add(preferredGenre);
    return this;
  }

  public User build() {
    List<Content.Genre> _preferredGenres = (preferredGenres != null) ? Collections.unmodifiableList(new ArrayList<Content.Genre>(preferredGenres)) : Collections.<Content.Genre>emptyList();
    return new Value(id, name, subscription, _preferredGenres);
  }

  public static UserBuilder from(User v) {
    return new UserBuilder(v);
  }

  public static UserBuilder from(UserBuilder v) {
    return new UserBuilder(v);
  }

  private static final class Value implements User {
    private final String id;

    private final String name;

    private final Optional<User.Subscription> subscription;

    private final List<Content.Genre> preferredGenres;

    private Value(@AutoMatter.Field("id") String id, @AutoMatter.Field("name") String name,
        @AutoMatter.Field("subscription") Optional<User.Subscription> subscription,
        @AutoMatter.Field("preferredGenres") List<Content.Genre> preferredGenres) {
      if (id == null) {
        throw new NullPointerException("id");
      }
      if (name == null) {
        throw new NullPointerException("name");
      }
      if (subscription == null) {
        throw new NullPointerException("subscription");
      }
      this.id = id;
      this.name = name;
      this.subscription = subscription;
      this.preferredGenres = (preferredGenres != null) ? preferredGenres : Collections.<Content.Genre>emptyList();
    }

    @AutoMatter.Field
    @Override
    public String id() {
      return id;
    }

    @AutoMatter.Field
    @Override
    public String name() {
      return name;
    }

    @AutoMatter.Field
    @Override
    public Optional<User.Subscription> subscription() {
      return subscription;
    }

    @AutoMatter.Field
    @Override
    public List<Content.Genre> preferredGenres() {
      return preferredGenres;
    }

    public UserBuilder builder() {
      return new UserBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof User)) {
        return false;
      }
      final User that = (User) o;
      if (id != null ? !id.equals(that.id()) : that.id() != null) {
        return false;
      }
      if (name != null ? !name.equals(that.name()) : that.name() != null) {
        return false;
      }
      if (subscription != null ? !subscription.equals(that.subscription()) : that.subscription() != null) {
        return false;
      }
      if (preferredGenres != null ? !preferredGenres.equals(that.preferredGenres()) : that.preferredGenres() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
      result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
      result = 31 * result + (this.subscription != null ? this.subscription.hashCode() : 0);
      result = 31 * result + (this.preferredGenres != null ? this.preferredGenres.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "User{" +
      "id=" + id +
      ", name=" + name +
      ", subscription=" + subscription +
      ", preferredGenres=" + preferredGenres +
      '}';
    }
  }
}
