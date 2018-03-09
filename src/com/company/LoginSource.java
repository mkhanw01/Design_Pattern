package com.company;

/**
 * Created by khan on 3/30/17.
 */
public enum LoginSource {
  GOOGLE ("Google"),
  FACEBOOK ("Facebook"),
  REGULAR ("Regular");

  private final String name;

  LoginSource(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
