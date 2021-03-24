package edu.cooper.ece366.auth;

import io.norberg.automatter.AutoMatter;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class AuthBuilder {
  private String username;

  private String password;

  public AuthBuilder() {
  }

  private AuthBuilder(Auth v) {
    this.username = v.username();
    this.password = v.password();
  }

  private AuthBuilder(AuthBuilder v) {
    this.username = v.username;
    this.password = v.password;
  }

  public String username() {
    return username;
  }

  public AuthBuilder username(String username) {
    if (username == null) {
      throw new NullPointerException("username");
    }
    this.username = username;
    return this;
  }

  public String password() {
    return password;
  }

  public AuthBuilder password(String password) {
    if (password == null) {
      throw new NullPointerException("password");
    }
    this.password = password;
    return this;
  }

  public Auth build() {
    return new Value(username, password);
  }

  public static AuthBuilder from(Auth v) {
    return new AuthBuilder(v);
  }

  public static AuthBuilder from(AuthBuilder v) {
    return new AuthBuilder(v);
  }

  private static final class Value implements Auth {
    private final String username;

    private final String password;

    private Value(@AutoMatter.Field("username") String username,
        @AutoMatter.Field("password") String password) {
      if (username == null) {
        throw new NullPointerException("username");
      }
      if (password == null) {
        throw new NullPointerException("password");
      }
      this.username = username;
      this.password = password;
    }

    @AutoMatter.Field
    @Override
    public String username() {
      return username;
    }

    @AutoMatter.Field
    @Override
    public String password() {
      return password;
    }

    public AuthBuilder builder() {
      return new AuthBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Auth)) {
        return false;
      }
      final Auth that = (Auth) o;
      if (username != null ? !username.equals(that.username()) : that.username() != null) {
        return false;
      }
      if (password != null ? !password.equals(that.password()) : that.password() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.username != null ? this.username.hashCode() : 0);
      result = 31 * result + (this.password != null ? this.password.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Auth{" +
      "username=" + username +
      ", password=" + password +
      '}';
    }
  }
}
