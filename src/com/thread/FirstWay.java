package com.thread;

/**
 * Created by khan on 9/6/17.
 */
public class FirstWay {
  public static void main(String[] args) {
    System.out.println("Thread start here ... ");
    new FirstThread();
    Thread thread = new FirstThread();
    System.out.println("Thread end here ...");
  }
}
