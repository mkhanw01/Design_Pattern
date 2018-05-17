package com.company;

/**
 * @author waseem.khan since 5/16/18.
 */
public class CheckStaticConcept {
  static {
    System.out.println("first execution");
  }

  public static void main(String[] args) {
    CheckStaticConcept concept = new CheckStaticConcept();
    concept.doPrint();

  }

  private  void doPrint() {
    System.out.println("Second execution ....");
  }

  static {
    System.out.println("third execution ..");
  }
}
