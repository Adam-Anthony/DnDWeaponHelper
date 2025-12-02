package weapons;
import weaponforger.*;

public class Longbow extends WeaponTemplate{
  public Longbow() {
    setWeaponType("Longbow");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    properties = new String[] {"Ammunition (Range 150/600; Arrow)","Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
