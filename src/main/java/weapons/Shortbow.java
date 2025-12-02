package weapons;
import weaponforger.*;

public class Shortbow extends WeaponTemplate{
  public Shortbow() {
    setWeaponType("Shortbow");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Ammunition (Range 80/320; Arrow), Two-Handed"};
    weaponRating = WeaponRating.Simple;
  }
}
