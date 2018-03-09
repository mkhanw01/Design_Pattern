package com.company;

/**
 * Created by khan on 3/2/18.
 */
public class Numerical {

  private static int index;
  public static void main(String[] args) {
    calculate(4, 27);
    System.out.println(index);
  }

  private static int calculate(int a, int b) {
    int c;
    ++index;
    if (b == 3) {
      return (a * a * a);
    } else {
      c = calculate(a, b/3);
      return (c * c * c);
    }
  }
}
