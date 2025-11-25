package weapons;

public class Shortbow extends WeaponTemplate{
  public Shortbow() {
    weaponName = "Shortbow";
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Ammunition (Range 80/320; Arrow), Two-Handed"};
    weaponRating = WeaponRating.Simple;
  }
}
