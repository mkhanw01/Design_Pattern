package com.company;

/**
 * Created by khan on 8/18/17.
 */
public class StringTest {
  private static final String ID_COUNTRY_CODE = "was";
  private static final String REGEX_ID_COUNTRY_CODE = "\\+62";
  private static final String LOCAL_CODE = "1";
  public static void main(String[] args) {
    System.out.println(funString(null));
  }

  private static String funString(String waseem) {
    waseem.substring(0,2);
    if(waseem.startsWith(ID_COUNTRY_CODE)){
      waseem.replaceFirst(REGEX_ID_COUNTRY_CODE,LOCAL_CODE);
    }
    return waseem;
  }
}
