package org.adamanthony
import weapons.*;

static void main(String[] args) {
  println "Hello world!"

  for (int i=0; i<14; i++) {
    System.out.println("i = " + i)
    Weapon tempWeapon = new Weapon(i);
    def abc = tempWeapon.getWeaponObject();
    if (abc != null)
      println abc
    else
      System.out.println("def");
  }
}