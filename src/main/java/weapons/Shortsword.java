package weapons;
import weaponforger.*;

public class Shortsword extends WeaponTemplate{
  public Shortsword() {
    setWeaponType("Shortsword");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Finesse","Light"};
    weaponRating = WeaponRating.Martial;
  }
}
