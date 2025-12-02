package weaponforger;

import weapons.*;

public class WeaponForge {
  Object weapon  = null;

  public WeaponForge() {
  }
  Object getWeaponObject() {
    return weapon;
  }
  public Object getRandomSimpleWeapon() {
    getSimpleWeapon((int)(Math.random() * 14));
    return weapon;
  }
  public Object getRandomSimpleMeleeWeapon() {
    getSimpleWeapon((int)(Math.random() * 10));
    return weapon;
  }
  public Object getRandomSimpleRangedWeapon() {
    getSimpleWeapon((int)(Math.random() * 5) + 10);
    return weapon;
  }
  public Object getSpecificSimpleWeaponById(int id) {
    getSimpleWeapon(id);
    return getWeaponObject();
  }

  private void getSimpleWeapon(int id) {
    switch (id) {
      // Melee Weapons
      case 0: weapon = new Club();break;
      case 1: weapon = new Dagger();break;
      case 2: weapon = new Greatclub(); break;
      case 3: weapon = new Handaxe(); break;
      case 4: weapon = new Javelin(); break;
      case 5: weapon = new LightHammer(); break;
      case 6: weapon = new Mace(); break;
      case 7: weapon = new Quarterstaff(); break;
      case 8: weapon = new Sickle(); break;
      case 9: weapon = new Spear(); break;
      // Ranged Weapons
      case 10: weapon = new Dart(); break;
      case 11: weapon = new LightCrossbow(); break;
      case 12: weapon = new Shortbow(); break;
      case 13: weapon = new Sling(); break;
    }
  }

  public Object getRandomMartialWeapon() {
    getMartialWeapon((int)(Math.random() * 18));
    return weapon;
  }
  public Object getRandomMartialMeleeWeapon() {
    getMartialWeapon((int)(Math.random() * 18));
    return weapon;
  }
  public Object getRandomMartialRangedWeapon() {
    getMartialWeapon((int)(Math.random() * 18) + 7);
    return weapon;
  }
  public Object getSpecificMartialWeaponById(int id) {
    getMartialWeapon(id);
    return getWeaponObject();
  }
  private void getMartialWeapon(int id) {
    switch (id) {
      // Melee Weapons
      case 0: weapon = new Battleaxe();break;
      case 1: weapon = new Flail();break;
      case 2: weapon = new Glaive();break;
      case 3: weapon = new Greataxe();break;
      case 4: weapon = new Greatsword();break;
      case 5: weapon = new Halberd();break;
      case 6: weapon = new Lance();break;
      case 7: weapon = new Longsword();break;
      case 8: weapon = new Maul();break;
      case 9: weapon = new Morningstar();break;
      case 10: weapon = new Pike();break;
      case 11: weapon = new Rapier();break;
      case 12: weapon = new Scimitar();break;
      case 13: weapon = new Shortsword();break;
      case 14: weapon = new Trident();break;
      case 15: weapon = new Warhammer();break;
      case 16: weapon = new WarPick();break;
      case 17: weapon = new Whip();break;
      // Ranged Weapons
      case 18: weapon = new Blowgun();break;
      case 19: weapon = new HandCrossbow();break;
      case 20: weapon = new HeavyCrossbow();break;
      case 21: weapon = new Longbow();break;
      case 22: weapon = new Musket();break;
      case 23: weapon = new Pistol();break;
    }
  }
}
