package weapons;

public class Weapon {
  Object weapon  = null;

  Weapon() {
  }
  Object getWeaponObject() {
    return weapon;
  }
  public Object getRandomSimpleWeapon() {
    getSimpleWeapon((int)(Math.random() * 14));
    return weapon;
  }
  private void getSimpleWeapon(int number) {
    switch (number) {
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
      case 10: weapon = new Dart(); break;
      case 11: weapon = new LightCrossbow(); break;
      case 12: weapon = new Shortbow(); break;
      case 13: weapon = new Sling(); break;
    }
  }
  private void getMartialWeapon(int number) {
    switch (number) {
      case 0: weapon = new       ;break;
      case 1: weapon = new       ;break;
      case 2: weapon = new       ;break;
      case 3: weapon = new       ;break;
      case 4: weapon = new       ;break;
      case 5: weapon = new       ;break;
      case 6: weapon = new       ;break;
      case 7: weapon = new       ;break;
      case 8: weapon = new       ;break;
      case 9: weapon = new       ;break;
      case 10: weapon = new       ;break;
      case 11: weapon = new       ;break;
      case 12: weapon = new       ;break;
      case 13: weapon = new       ;break;
      case 14: weapon = new       ;break;
      case 15: weapon = new       ;break;
      case 16: weapon = new       ;break;
    }
  }
}
