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
      println w1
      println "** Random Ranged **"
      def w2 = weaponCrafter.getRandomMartialRangedWeapon()
      println w2
      println "*** True Random ***"
      def w3 = weaponCrafter.getRandomMartialWeapon()
      println w3
    }
    if (simple) {
      println "Random Simple Weapon Rolls"
      println "* Random Melee *"
      def w1 = weaponCrafter.getRandomSimpleMeleeWeapon()
      println w1
      println "** Random Ranged **"
      def w2 = weaponCrafter.getRandomSimpleRangedWeapon()
      println w2
      println "*** True Random ***"
      def w3 = weaponCrafter.getRandomSimpleWeapon()
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
static boolean checkElementChance() {
  return (Math.random() >= 0.25)
}
static void addRandomElement(def weapon) {
  addElement((int)(Math.random() * 6), weapon)
}
static void addElement(int id, def weapon) {
  switch (id) {
    case 0: weapon.setChromaticType(DamageTypes.Acid); weapon.setColour("Black"); break
    case 1: weapon.setChromaticType(DamageTypes.Cold); weapon.setColour("White"); break
    case 2: weapon.setChromaticType(DamageTypes.Fire); weapon.setColour("Red"); break
    case 3: weapon.setChromaticType(DamageTypes.Lightning); weapon.setColour("Blue"); break
    case 4: weapon.setChromaticType(DamageTypes.Poison); weapon.setColour("Green"); break
    case 5: weapon.setChromaticType(DamageTypes.Necrotic); weapon.setColour("Purple"); break
  }
}