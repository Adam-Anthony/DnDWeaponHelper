package weapons;

public class Dart extends WeaponTemplate{
  public Dart() {
    weaponName = "Dart";
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d4";
    properties = new String[] {"Finesse","Thrown (Range 20/60)"};
    weaponRating = WeaponRating.Simple;
  }
}
