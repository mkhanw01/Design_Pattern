package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/22/18.
 */


/**
 * do xor from all array element
 * do xor for all position from 1 to n
 * then do xor again both above result.
 */
public class FindMissingNumberByXor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int [] inputArray = new int[input-1];
    for(int i=0; i<inputArray.length ;i++) {
      inputArray[i] = scanner.nextInt();
    }
    System.out.println(findMissingNum(inputArray));
  }

  private static int findMissingNum(int[] inputArray) {
    int xor1 = inputArray[0];
    int xor2 =1;
    for (int i = 1; i < inputArray.length; i++) {
      xor1 = xor1 ^ inputArray[i];
    }
    System.out.println(xor1);
    for (int i = 2; i < inputArray.length + 1; i++) {
      xor2 = xor2 ^ i;
    }
    System.out.println(xor2);
    return (xor1 ^ xor2);
  }
}
