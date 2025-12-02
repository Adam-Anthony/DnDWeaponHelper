package weapons;
import weaponforger.*;

public class HeavyCrossbow extends WeaponTemplate{
  public HeavyCrossbow() {
    setWeaponType("Heavy Crossbow");
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d10";
    properties = new String[] {"Ammunition (Range 100/400; Bolt)","Heavy","Loading","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
