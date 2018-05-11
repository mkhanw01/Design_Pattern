package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khan on 4/7/18.
 */
public class TangleAssortment {


  public static void main(String[] args) {
    /*
 Input should be like 6 , So it means first row[0] {one element} row[1] {3 element }
 row[2]{element 5} row[3] {5 element} row[4] {3 element} row[5] {1 element}
               1
            2  3  4
          5  6  7  8  9
         11 10 5 3 14
           9 16 5
              4

20
  */

    List<Integer> integers = new ArrayList<>();
    List<List<Integer>> listList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    int temp = input / 2;

    for (int i = 0; i < temp; i++) {
      for (int j = (i * 2) + 1; j > 0; j--) {
        integers.add(scanner.nextInt());
      }
      listList.add(integers);
    }

    for (int i = temp; i > 0; i--) {
      for (int j = (i * 2) - 1; j > 0; j--) {
        integers.add(scanner.nextInt());
      }
      listList.add(integers);
    }

    for (List<Integer> integerList: listList) {

      System.out.println(integerList + " ");
    }
    //System.out.println(minimumTotal(listList));
  }


  /**
   *  find minimum element in each row every time.
   * @param triangle
   * @return
   */
  private static int minimumTotal(List<List<Integer>> triangle) {

    if (triangle.size() == 0)
      return 0;
    int size = triangle.size();

    int[] sum = new int[size];

    sum[0] = triangle.get(0).get(0);

    for(int curr = 1; curr<size-1; curr++) {
      int nextSize = triangle.get(curr).size();

    }

    return 1;
  }

}
