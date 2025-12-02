package weapons;
import weaponforger.*;

public class Pike extends WeaponTemplate{
  public Pike() {
    setWeaponType("Pike");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d10";
    properties = new String[] {"Heavy","Reach","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
