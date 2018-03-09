package com.design.creational.singleton.improve;

/**
 * Created by khan on 3/9/18.
 */

public class Preferences {

  /**
   * holder of single instance of singleton class.
   */
  private static Preferences instance = null;

  /**
   * No other call can be create instance.
   */
  protected Preferences() {
    // nothing to do
  }

  /**
   * create a single instance.
   * Use synchronized to allow one instance when using multiple thread.
   */
  private synchronized static void createInstance(){
    if(instance == null) {
      instance = new Preferences();
    }
  }

  /**
   *  access method to get hold of singleton instance.
   * @return singleton instance
   */
  public static Preferences getInstance() {
    if(instance == null) {
      createInstance();
    }
    return instance;
  }
  public void helloSingleton(){
    System.out.println("hello i'm singleton ...");
  }
}
