package weapons;

public class Flail extends WeaponTemplate{
  public Flail() {
    weaponName = "Flail";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    weaponRating = WeaponRating.Martial;
  }
}
