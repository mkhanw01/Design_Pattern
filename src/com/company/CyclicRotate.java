package com.company;

/**
 * Created by khan on 9/23/17.
 */
public class CyclicRotate {
  public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    cycleRotate(arr,1);
    for (int start =0;start<arr.length;start++) {
      System.out.print(arr[start]+",");
    }
  }

  private static void cycleRotate(int[] arr, final int i) {
    rotateCycle(arr,0,arr.length-2);
    rotateCycle(arr,0,arr.length-1);
  }

  private static void rotateCycle(int[] arr, int start, int end) {
    while (end>start) {
      arr[start]^=arr[end];
      arr[end]^=arr[start];
      arr[start]^=arr[end];
      start++;
      end--;
    }
  }


}
