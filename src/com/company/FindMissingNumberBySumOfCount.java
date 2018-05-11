package com.company;

import java.util.Scanner;

/**
 * Created by khan on 3/21/18.
 */
/*
Here time complexity is O(n), but if you have too large number then this approach will not help full
 */
public class FindMissingNumberBySumOfCount {
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
    int total;
    total = ((inputArray.length+1) * ((inputArray.length)+2))/2;
    System.out.println("total count:"+ total);
    for(int i =0; i<inputArray.length ; i++) {
      total = total - inputArray[i];
    }
    return total;
  }
}
