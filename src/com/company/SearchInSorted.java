package com.company;

/**
 * Created by khan on 9/25/17.
 */
public class SearchInSorted {
  public static void main(String[] args) {
    int[] arr = {20, 30, 40, 50, 60, 4, 7, 12, 15};
    int[] arr1 = {20, 30, -4, 7, 12, 15, 18, 19};
    int[] arr2 = {5, 6, 7, 8, 9, 1, 2, 4};
    int key = 7;
    int index = findIndex(arr2, 0, arr2.length - 1, key);
    if (index != -1) {
      System.out.println("found at index =" + index);
    }
    else {
      System.out.println("Item not found");
    }
  }

  private static int findIndex(int[] arr, int start, int end, int key) {
    if (start > end)
      return -1;
    int pivot = (start + end) / 2;
    if (arr[pivot] == key) {
      return pivot;
    }
    if (arr[start] <= arr[pivot]) {
      if (key >= arr[start] && key <= arr[pivot]) {
        return findIndex(arr, start, pivot - 1, key);
      }
      return findIndex(arr, pivot + 1, end, key);
    }
    if (key <= arr[start] && key >= arr[pivot])
      return findIndex(arr, pivot + 1, end, key);
    return findIndex(arr, start, pivot - 1, key);
  }
}
