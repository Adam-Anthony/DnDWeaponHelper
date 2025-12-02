package weapons;
import weaponforger.*;

public class Whip extends WeaponTemplate{
  public Whip() {
    setWeaponType("Whip");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d4";
    properties = new String[] {"Finesse","Reach"};
    weaponRating = WeaponRating.Martial;
  }
}
