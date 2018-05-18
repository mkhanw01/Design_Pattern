package com.tranning;

import java.util.Optional;

/**
 * @author waseem.khan since 5/17/18.
 */
public class Singeltone {

  private String name;
  private static Singeltone singeltone = null;
  private Singeltone() {
  }

  static synchronized Singeltone getObject(){
    return Optional.ofNullable(singeltone).orElse(new Singeltone());
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Singeltone{");
    sb.append("name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
