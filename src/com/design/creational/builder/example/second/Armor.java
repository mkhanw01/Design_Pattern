package com.design.creational.builder.example.second;

/**
 * Created by khan on 3/15/18.
 */
public enum Armor {
  CLOTHES("clothes"), LEATHER("leather"), CHAINMAIL("chain mail");
  private String title;

  Armor(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Armor{");
    sb.append("title='").append(title).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
