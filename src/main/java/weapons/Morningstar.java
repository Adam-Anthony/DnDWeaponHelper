package weapons;

public class Morningstar extends WeaponTemplate{
  public Morningstar() {
    weaponName = "Morningstar";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    weaponRating = WeaponRating.Martial;
  }
}
