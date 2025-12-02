package weapons;
import weaponforger.*;

public class Flail extends WeaponTemplate{
  public Flail() {
    setWeaponType("Flail");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    weaponRating = WeaponRating.Martial;
  }
}
