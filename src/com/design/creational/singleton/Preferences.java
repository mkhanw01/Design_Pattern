package com.design.creational.singleton;

import lombok.Data;

/**
 * Created by khan on 3/9/18.
 */
@Data
public class Preferences {
  public static Preferences globalPreferences = new Preferences("First gloable  preferences");
  private String preference;
  public Preferences(String preference) {
    this.preference = preference;
  }

  public String getPreference() {
    return preference;
  }
}
