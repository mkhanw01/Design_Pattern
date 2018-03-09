package com.company;

/**
 * Created by khan on 10/27/17.
 */
public class StringMatching {
  public static void main(String[] args) {
    String str = "12345634437834";
    String find ="34";
    for (int i = -1; (i = str.indexOf(find, i + 1)) != -1; i++) {
      System.out.println(i);
    }
  }
}
