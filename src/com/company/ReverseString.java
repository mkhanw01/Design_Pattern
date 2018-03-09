package com.company;

import java.util.Scanner;

/**
 * Created by khan on 8/29/17.
 */
public class ReverseString {
  public static void main(String[] args) {
    String string = "waseemkhan123khan7";
    char[]chars = string.toCharArray();
    Scanner scanner = new Scanner(System.in);
    int count=scanner.nextInt();
    printfive(chars,count);
  }

  private static void printfive(char[] chars, int count) {
    int charcount =1;
    for(int i=0;i<chars.length;i++){
      if(charcount%count ==0){
        System.out.println(chars[i]);
        charcount ++;
      }
      else {
        System.out.print(chars[i]);
        charcount ++;
      }
    }
  }
}
