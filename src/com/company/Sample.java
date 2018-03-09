package com.company;

/**
 * Created by khan on 8/16/17.
 */
public class Sample {
  int fun(int n){
    if(n==1 || n==0)
      return 1;
    return (n-1);
  }

  public static void main(String[] args) {
    Sample sample = new Sample();
    System.out.println("value od fuc = " + sample.fun(100));
  }
}
