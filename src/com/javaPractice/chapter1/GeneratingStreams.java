package com.javaPractice.chapter1;

import java.util.stream.Stream;

/**
 * Created by khan on 4/12/18.
 */
public class GeneratingStreams {
  public static void main(String[] args) {
    iterate();
    generate();
  }

  private static void generate() {
    Stream.generate(() -> "My Name is Khan ").limit(3).forEach(System.out::println);
  }

  private static void iterate() {
    Stream.iterate(0, x -> x + 1).limit(10).forEach(System.out::println);
  }
}
