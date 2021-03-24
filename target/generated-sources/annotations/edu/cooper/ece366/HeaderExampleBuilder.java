package edu.cooper.ece366;

import io.norberg.automatter.AutoMatter;
import java.util.Optional;
import javax.annotation.processing.Generated;

@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
final class HeaderExampleBuilder {
  private Optional<String> request;

  private Optional<String> response;

  public HeaderExampleBuilder() {
    this.request = Optional.empty();
    this.response = Optional.empty();
  }

  private HeaderExampleBuilder(App.HeaderExample v) {
    this.request = v.request();
    this.response = v.response();
  }

  private HeaderExampleBuilder(HeaderExampleBuilder v) {
    this.request = v.request;
    this.response = v.response;
  }

  public Optional<String> request() {
    return request;
  }

  public HeaderExampleBuilder request(String request) {
    return request(Optional.ofNullable(request));
  }

  @SuppressWarnings("unchecked")
  public HeaderExampleBuilder request(Optional<? extends String> request) {
    if (request == null) {
      throw new NullPointerException("request");
    }
    this.request = (Optional<String>)request;
    return this;
  }

  public Optional<String> response() {
    return response;
  }

  public HeaderExampleBuilder response(String response) {
    return response(Optional.ofNullable(response));
  }

  @SuppressWarnings("unchecked")
  public HeaderExampleBuilder response(Optional<? extends String> response) {
    if (response == null) {
      throw new NullPointerException("response");
    }
    this.response = (Optional<String>)response;
    return this;
  }

  public App.HeaderExample build() {
    return new Value(request, response);
  }

  public static HeaderExampleBuilder from(App.HeaderExample v) {
    return new HeaderExampleBuilder(v);
  }

  public static HeaderExampleBuilder from(HeaderExampleBuilder v) {
    return new HeaderExampleBuilder(v);
  }

  private static final class Value implements App.HeaderExample {
    private final Optional<String> request;

    private final Optional<String> response;

    private Value(@AutoMatter.Field("request") Optional<String> request,
        @AutoMatter.Field("response") Optional<String> response) {
      if (request == null) {
        throw new NullPointerException("request");
      }
      if (response == null) {
        throw new NullPointerException("response");
      }
      this.request = request;
      this.response = response;
    }

    @AutoMatter.Field
    @Override
    public Optional<String> request() {
      return request;
    }

    @AutoMatter.Field
    @Override
    public Optional<String> response() {
      return response;
    }

    public HeaderExampleBuilder builder() {
      return new HeaderExampleBuilder(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof App.HeaderExample)) {
        return false;
      }
      final App.HeaderExample that = (App.HeaderExample) o;
      if (request != null ? !request.equals(that.request()) : that.request() != null) {
        return false;
      }
      if (response != null ? !response.equals(that.response()) : that.response() != null) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (this.request != null ? this.request.hashCode() : 0);
      result = 31 * result + (this.response != null ? this.response.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "App.HeaderExample{" +
      "request=" + request +
      ", response=" + response +
      '}';
    }
  }
}
