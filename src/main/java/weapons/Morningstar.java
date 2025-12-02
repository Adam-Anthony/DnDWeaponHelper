package weapons;
import weaponforger.*;

public class Morningstar extends WeaponTemplate{
  public Morningstar() {
    setWeaponType("Morningstar");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    weaponRating = WeaponRating.Martial;
  }
}
