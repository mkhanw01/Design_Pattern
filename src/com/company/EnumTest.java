package com.company;

/**
 * Created by khan on 3/30/17.
 */
public class EnumTest {
  public static void main(String[] args) {
    String facebook = LoginSource.FACEBOOK.getName();
    String google = LoginSource.GOOGLE.getName();
    if(facebook.equals("Facebook")) {
      System.out.println("Facebook enum value");
    }
    if(google.equals("Google")) {
      System.out.println("Google enum value");
    }
  }
}
