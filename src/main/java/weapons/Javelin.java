package weapons;

public class Javelin extends WeaponTemplate{
  public Javelin() {
    weaponName = "Javelin";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Thrown (Range 30/120)"};
    weaponRating = WeaponRating.Simple;
  }
}
