package com.design;

/**
 * Created by khan on 7/10/17.
 */
public class Dog implements Pet {
  @Override
  public String getSound(String sound) {
    return "Bork bork";
  }
}
