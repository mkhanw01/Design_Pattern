package com.design.creational.singleton;

/**
 * Created by khan on 3/9/18.
 */
public class Client {
  public static void main(String[] args) {
    System.out.println(Preferences.globalPreferences.getPreference());
    Preferences secondPreferences = new Preferences("second preference");
    Preferences.globalPreferences = secondPreferences;
    System.out.println(Preferences.globalPreferences.getPreference());
  }
}
