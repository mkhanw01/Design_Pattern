package com.design.creational.singleton.improve;

/**
 * Created by khan on 3/9/18.
 * Singleton pattern
 * Multiple classes require same class object instance
 * There be only one object for the entire application
 * It must be guaranteed there is only one object.
 */
public class Client {
  public static void main(String[] args) {
    for(int i =1; i<=5; i++) {
      Runnable preferenceSingleton = () -> Preferences.getInstance().helloSingleton();
      Runnable myPreferenceSingleton = () -> MyPreference.getInstance().helloSingleton();
      Thread first = new Thread(preferenceSingleton);
      Thread second = new Thread(myPreferenceSingleton);
      first.start();
      second.start();
    }
  }
}
