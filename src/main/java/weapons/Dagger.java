package weapons;
import weaponforger.*;

public class Dagger extends WeaponTemplate{
  public Dagger() {
    setWeaponType("Dagger");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d4";
    properties = new String[] {"Finesse","Light","Thrown (Range 20/60)"};
    weaponRating = WeaponRating.Simple;
  }
}
