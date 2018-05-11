package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/10/18.
 */
public class Vaheed {

  static void decToHexa(int n) {

    char[] hexaDeciNum = new char[99999];

    int i = 0;
    while (n != 0) {
      int temp = 0;

      temp = n % 16;

      if (temp < 10) {
        hexaDeciNum[i] = (char) (temp + 48);
        i++;
      } else {
        hexaDeciNum[i] = (char) (temp + 55);
        i++;
      }

      n = n / 16;
    }

    for (int j = i - 1; j >= 0; j--)
      System.out.print(hexaDeciNum[j]);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    decToHexa(num);
  }
}
