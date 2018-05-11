package com.design.creational.builder.example.second;

/**
 * Created by khan on 3/15/18.
 */
public enum HairColor {
  WHITE("white"), BLACK("black"), BROWN("brown"), GOLDEN("golden");

  private String color;

  HairColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("HairColor{");
    sb.append("color='").append(color).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
