package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/28/18.
 */
public class FindRepetativeElelment1_NByIndex {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int [] array = new int[size];
    for(int i =0; i<array.length;i++) {
      array[i] = scanner.nextInt();
    }
    System.out.println(findMissingNumber(array));
  }

  private static int findMissingNumber(int[] array) {
    int missingElement = 0;
    for(int i =0; i<array.length; i++){
      int element = array[Math.abs(array[i])];
      if(element<0) {
        missingElement = array[i];
        break;
      }
      array[Math.abs(array[i])] = - array[Math.abs(array[i])];
    }
    return Math.abs(missingElement);
  }
}
