package com.company;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by khan on 3/21/18.
 */
/*
Time complexity on this code is O(n) and space complexity is also O(n)
 */
public class FindOddOccurringByHashMap {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int inputArray[] = new int[input];
    for (int i = 0; i < input; i++) {
      inputArray[i] = scanner.nextInt();
    }
    System.out.println(findOddOccurring(inputArray));
  }

  /**
   * first pull all element in map
   * make a condition if element already available in map then make one more count on that element.
   * else just put in map with what value have array with count 1.
   *
   * @param inputArray object reference.
   * @return number oddOccurring.
   */
  private static int findOddOccurring(int[] inputArray) {
    HashMap<Integer, Integer> integerHashMap = new HashMap<>();
    for (int i = 0; i < inputArray.length; i++) {
      if (integerHashMap.containsKey(inputArray[i])) {
        integerHashMap.put(inputArray[i], integerHashMap.get(inputArray[i]) + 1);
      } else {
        integerHashMap.put(inputArray[i], 1);
      }
    }
    for (Integer key : integerHashMap.keySet()) {
      if (integerHashMap.get(key) % 2 != 0) {
        return key;
      }
    }
    return -1;
  }
}
