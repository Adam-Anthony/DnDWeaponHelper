package weapons;
import weaponforger.*;

public class Javelin extends WeaponTemplate{
  public Javelin() {
    setWeaponType("Javelin");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Thrown (Range 30/120)"};
    weaponRating = WeaponRating.Simple;
  }
}
