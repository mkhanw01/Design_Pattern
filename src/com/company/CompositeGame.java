package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by khan on 3/25/18.
 */
public class CompositeGame {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCase = scan.nextInt();
    List<String> strings = new ArrayList<>();
    for(int i =0; i<testCase; i++) {
      strings.add(scan.next());
    }
    System.out.println(getGems(strings));

  }

   static int getGems(List<String> stringList) {
    if (stringList == null || stringList.isEmpty()) {
      throw new IllegalArgumentException("No Input");
    }

    int gemsCount = 0;
    int n = stringList.size();

    char[] charArray = stringList.get(0).toCharArray();
    for (char c : charArray) {
      int appearances = 0;
      for (String rock : stringList) {
        if (rock.indexOf(c) >= 0) {
          appearances++;
        } else {
          break;
        }
      }
      if (appearances == n) {
        gemsCount++;
      }
    }
    return gemsCount;
  }

}
