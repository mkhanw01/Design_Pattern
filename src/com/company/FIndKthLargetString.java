package com.company;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by khan on 3/22/18.
 */
public class FIndKthLargetString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int k = sc.nextInt();
    String[] arrayString = new String[input];
    for (int i = 0; i < arrayString.length; i++) {
      arrayString[i] = sc.next();
    }
    findKthElement(arrayString, k);
  }

  private static void findKthElement(String[] arrayString, int k) {
    Map<String, Integer> stringIntegerHashMap = new HashMap<>();
    for (int i = 0; i < arrayString.length; i++) {
      if (stringIntegerHashMap.containsKey(arrayString[i])) {
        stringIntegerHashMap.put(arrayString[i], stringIntegerHashMap.get(arrayString[i]) + 1);
      } else {
        stringIntegerHashMap.put(arrayString[i], 1);
      }
    }

    Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    };
    System.out.println(comparator.toString());
  }
}

