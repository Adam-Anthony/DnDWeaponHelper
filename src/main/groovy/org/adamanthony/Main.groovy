package org.adamanthony
import weapons.*

static void main(String[] args) {
  boolean random = true
  boolean martial = true
  boolean simple = true
  Weapon weaponCrafter = new Weapon()
  println "Hello world!"

  if (random) {
    if (martial) {
      println "Random Martial Weapon Rolls"
      println "* Random Melee *"
      def w1 = weaponCrafter.getRandomMartialMeleeWeapon()
      if (checkElementChance()) addRandomElement(w1)
      println w1
      println "** Random Ranged **"
      def w2 = weaponCrafter.getRandomMartialRangedWeapon()
      if (checkElementChance()) addRandomElement(w2)
      println w2
      println "*** True Random ***"
      def w3 = weaponCrafter.getRandomMartialWeapon()
      if (checkElementChance()) addRandomElement(w3)
      println w3
    }
    if (simple) {
      println "Random Simple Weapon Rolls"
      println "* Random Melee *"
      def w1 = weaponCrafter.getRandomSimpleMeleeWeapon()
      if (checkElementChance()) addRandomElement(w1)
      println w1
      println "** Random Ranged **"
      def w2 = weaponCrafter.getRandomSimpleRangedWeapon()
      if (checkElementChance()) addRandomElement(w2)
      println w2
      println "*** True Random ***"
      def w3 = weaponCrafter.getRandomSimpleWeapon()
      if (checkElementChance()) addRandomElement(w3)
      println w3
    }
  } else {
    if (martial) {

      for (int i = 0; i < 24; i++) {
        System.out.println("i = " + i)
        def abc = weaponCrafter.getSpecificMartialWeaponById(i)
        if (abc != null)
          println abc
        else
          System.out.println("Undefined!")
      }
    }
    if (simple){
      for (int i = 0; i < 14; i++) {
        System.out.println("i = " + i)
        def abc = weaponCrafter.getSpecificSimpleWeaponById(i)
        if (abc != null)
          println abc
        else
          System.out.println("Undefined!")
      }
    }
  }
}