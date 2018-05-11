package com.design.creational.builder.example.second;

/**
 * Created by khan on 3/15/18.
 */
public enum Weapon {
  DANGER, AXE, BOW;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
