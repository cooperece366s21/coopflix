package edu.cooper.ece366;

import io.norberg.automatter.AutoMatter;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
final class CookieExampleBuilder {
  private String requestCookie;

  private String responseCookie;

  public CookieExampleBuilder() {
  }

  private CookieExampleBuilder(App.CookieExample v) {
    this.requestCookie = v.requestCookie();
    this.responseCookie = v.responseCookie();
  }

  private CookieExampleBuilder(CookieExampleBuilder v) {
    this.requestCookie = v.requestCookie;
    this.responseCookie = v.responseCookie;
  }

  public String requestCookie() {
    return requestCookie;
  }

  public CookieExampleBuilder requestCookie(String requestCookie) {
    if (requestCookie == null) {
      throw new NullPointerException("requestCookie");
    }
    this.requestCookie = requestCookie;
    return this;
  }

  public String responseCookie() {
    return responseCookie;
  }

  public CookieExampleBuilder responseCookie(String responseCookie) {
    if (responseCookie == null) {
      throw new NullPointerException("responseCookie");
    }
    this.responseCookie = responseCookie;
    return this;
  }

  public App.CookieExample build() {
    return new Value(requestCookie, responseCookie);
  }

  public static CookieExampleBuilder from(App.CookieExample v) {
    return new CookieExampleBuilder(v);
  }

  public static CookieExampleBuilder from(CookieExampleBuilder v) {
    return new CookieExampleBuilder(v);
  }

  private static final class Value implements App.CookieExample {
    private final String requestCookie;

    private final String responseCookie;

    private Value(@AutoMatter.Field("requestCookie") String requestCookie,
        @AutoMatter.Field("responseCookie") String responseCookie) {
      if (requestCookie == null) {
        throw new NullPointerException("requestCookie");
      }
      if (responseCookie == null) {
        throw new NullPointerException("responseCookie");
      }
      this.requestCookie = requestCookie;
      this.responseCookie = responseCookie;
    }

    @AutoMatter.Field
    @Override
    public String requestCookie() {
      return requestCookie;
    }

    @AutoMatter.Field
    @Override
    public String responseCookie() {
      return responseCookie;
    }

    public CookieExampleBuilder builder() {
      return new CookieExampleBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof App.CookieExample)) {
        return false;
      }
      final App.CookieExample that = (App.CookieExample) o;
      if (requestCookie != null ? !requestCookie.equals(that.requestCookie()) : that.requestCookie() != null) {
        return false;
      }
      if (responseCookie != null ? !responseCookie.equals(that.responseCookie()) : that.responseCookie() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.requestCookie != null ? this.requestCookie.hashCode() : 0);
      result = 31 * result + (this.responseCookie != null ? this.responseCookie.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "App.CookieExample{" +
      "requestCookie=" + requestCookie +
      ", responseCookie=" + responseCookie +
      '}';
    }
  }
}
