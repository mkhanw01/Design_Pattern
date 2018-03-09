package com.design;

/**
 * Created by khan on 7/10/17.
 */
public class FactoryPet {
  Pet getPet(String petType) {
    Pet pet = null;
    if(petType.equals("mew mew")) {
      pet = new Cat();
    }
    else if(petType.equals("Bork bork")){
      pet = new Dog();
    }
    return pet;
  }
}
