package weapons;

public class Mace extends WeaponTemplate{
  public Mace() {
    weaponName = "Mace";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d6";
    weaponRating = WeaponRating.Simple;
  }
}
