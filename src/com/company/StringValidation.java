package com.company;

/**
 * Created by khan on 3/21/18.
 */


/**
 * to handle 4 digit number only
 */
public class StringValidation {
  public static void main(String[] args) {
    String s = "jfbak.af";
    String a = "2019";
    String m = "2an1";
    String c = "";
    if(c.length() == 4 && c.matches("[0-9]+")) {
      System.out.println("valid input");
    } else {
      System.out.println("invalid input");
    }
  }
}
