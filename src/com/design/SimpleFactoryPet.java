package com.design;

/**
 * Created by khan on 7/10/17.
 */
public class SimpleFactoryPet {
  public static void main(String[] args) {
    FactoryPet factoryPet = new FactoryPet();
    System.out.println(factoryPet.getPet("Bork bork").toString());
    System.out.println(factoryPet.getPet("hello"));
  }
}
