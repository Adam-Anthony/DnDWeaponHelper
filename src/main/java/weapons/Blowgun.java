package weapons;
import weaponforger.*;

public class Blowgun extends WeaponTemplate{
  public Blowgun() {
    setWeaponType("Blowgun");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1";
    properties = new String[] {"Ammunition (Range 25/100; Needle)","Loading"};
    weaponRating = WeaponRating.Martial;
  }
}
