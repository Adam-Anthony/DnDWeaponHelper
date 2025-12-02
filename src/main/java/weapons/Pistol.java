package weapons;
import weaponforger.*;

public class Pistol extends WeaponTemplate{
  public Pistol() {
    setWeaponType("Pistol");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d10";
    properties = new String[] {"Ammunition (Range 30/90; Bullet)","Loading"};
    weaponRating = WeaponRating.Martial;
  }
}
