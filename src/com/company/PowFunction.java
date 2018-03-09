package com.company;

/**
 * Created by khan on 8/13/17.
 */
public class PowFunction {
  static int calModOfPow(int x, int n, int d) {
    int powResult = (int) Math.pow(x,n);
    int result =(powResult % d);
    if(result<0){
      return result =result+d;
    }
    else
    {
      return result;
    }
  }
  public static void main(String[] args) {
    int x =-1;
    int n= 1;
    int d= 20;
    System.out.println(calModOfPow(x,n,d));
  }
}
