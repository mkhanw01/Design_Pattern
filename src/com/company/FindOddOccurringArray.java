package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/21/18.
 */
public class FindOddOccurringArray {
  /**
   * using the concept of xor operation we will get the result.
   * number of odd time occurring it will give result.
   * @param arrIntegers
   * @return result
   */
  static int show(Integer[] arrIntegers) {
    int result = 0;
    for (int i = 0; i < arrIntegers.length; i++) {
      result = result ^ arrIntegers[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    Integer[] integers = new Integer[x];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = sc.nextInt();
    }
    System.out.println(show(integers));
  }
}
