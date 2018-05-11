package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/28/18.
 */


/**
 * by xor we can find out element.
 * arr{9, 8, 2, 6, 1, 8, 5, 3, 4, 7}
 * res is going to store value of
 * 1 ^ 2 ^ 3 .. ^ (n-1) ^ arr[0] ^
 * arr[1] ^ .... arr[n-1]
 */
public class FindRepetiveElement1_N {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int arr[] = {9, 8, 2, 6, 1, 8, 5, 3, 4, 7};
    int n = scanner.nextInt();
    System.out.println(getMissingNumber(arr, n));
  }

  private static int getMissingNumber(int[] array, int n) {
    int result = 0;
    for (int i = 0; i < n - 1; i++) {
      result = result ^ (i + 1) ^ array[i];
    }
    return result ^ (array[n - 1]);
  }
}
