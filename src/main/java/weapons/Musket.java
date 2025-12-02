package weapons;
import weaponforger.*;

public class Musket extends WeaponTemplate{
  public Musket() {
    setWeaponType("Musket");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d12";
    properties = new String[] {"Ammunition (Range 40/120; Bullet)","Loading","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
