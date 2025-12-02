package weapons;
import weaponforger.*;

public class Sling extends WeaponTemplate{
  public Sling() {
    setWeaponType("Sling");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d4";
    properties = new String[] {"Ammunition (Range 30/120; Bullet)"};
    weaponRating = WeaponRating.Simple;
  }
}
