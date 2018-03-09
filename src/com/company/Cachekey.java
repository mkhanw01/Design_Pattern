package com.company;

/**
 * Created by khan on 5/28/17.
 */
public class Cachekey {
  public static final String WASEEM = "waseem";
  public static final String KHAN = "khan";
  public static final String MOHAMMAD = "mohammad";
  public static String firstName = "smartboy";
  public static void main(String[] args) {
  StringBuilder stringBuilder = new StringBuilder(10);
  stringBuilder.append(WASEEM);
  stringBuilder.append(KHAN);
  stringBuilder.append(MOHAMMAD);
    System.out.println(stringBuilder.toString());
  stringBuilder.insert(10,firstName);
    System.out.println(stringBuilder.toString());
  }
}
