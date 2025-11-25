package weapons;

public class Greatclub extends WeaponTemplate{
  public Greatclub() {
    weaponName = "Greatclub";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    properties = new String[] {"Two-Handed"};
    weaponRating = WeaponRating.Simple;
  }
}
