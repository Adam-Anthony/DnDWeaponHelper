package weapons;

public class Sling extends WeaponTemplate{
  public Sling() {
    weaponName = "Sling";
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d4";
    properties = new String[] {"Ammunition (Range 30/120; Bullet)"};
    weaponRating = WeaponRating.Simple;
  }
}
