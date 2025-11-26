package weapons;

public class Shortsword extends WeaponTemplate{
  public Shortsword() {
    weaponName = "Shortsword";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Finesse","Light"};
    weaponRating = WeaponRating.Martial;
  }
}
