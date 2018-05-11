package com.company;

/**
 * Created by khan on 3/28/18.
 */


import java.util.Scanner;

/**
 * to find the number in array which left most side element is bigger
 * idea to traverse from last and if last bigger number is smaller thn next right element , then
 * that is the next number
 *  array {16, 17, 4, 3, 5, 2} numbers will be 17, 5 and 2
 */
public class Ladder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int arr[] = new int[size];
    for(int i=0; i<size; i++) {
      arr[i] = scanner.nextInt();
    }
    getLadder(arr);
  }

  private static void getLadder(int[] arr) {
    int ladder = arr[arr.length-1];
    System.out.println(ladder);
    for(int i=arr.length-2;i>=0;i--){
      if(ladder<arr[i]) {
        ladder = arr[i];
        System.out.println(arr[i]);
      }
    }
  }
}
