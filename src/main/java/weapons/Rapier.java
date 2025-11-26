package weapons;

public class Rapier extends WeaponTemplate{
  public Rapier() {
    weaponName = "Rapier";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    properties = new String[] {"Finesse"};
    weaponRating = WeaponRating.Martial;
  }
}
