package com.company;

import java.util.ArrayList;

/**
 * Created by khan on 5/16/17.
 */
public class XCart1473 {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add(10);
    arrayList.add(15);
    arrayList.add(-35);
    arrayList.add(95);
    boolean x = arrayList.contains(-15);
    if (x){
      System.out.println("waseem item found");
    }
  }
}
