package com.company;

/**
 * Created by khan on 8/22/17.
 */
public class StringBufferExample {
  private static final String firstName="firstName";
  public static final String SECOND_NAME = "secondName";
  public static final String THIRD_NAME = "thirdName";

  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append(firstName);
    builder.append(SECOND_NAME);
   String s = builder.toString();
    System.out.println(s);
  }
}
