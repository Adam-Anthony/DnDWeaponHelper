package weapons;
import weaponforger.*;

public class Mace extends WeaponTemplate{
  public Mace() {
    setWeaponType("Mace");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d6";
    weaponRating = WeaponRating.Simple;
  }
}
