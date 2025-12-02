package weapons;
import weaponforger.*;

public class Halberd extends WeaponTemplate{
  public Halberd() {
    setWeaponType("Halberd");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d10";
    properties = new String[] {"Heavy","Reach","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
