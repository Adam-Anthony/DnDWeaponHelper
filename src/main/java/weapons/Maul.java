package weapons;
import weaponforger.*;

public class Maul extends WeaponTemplate{
  public Maul() {
    setWeaponType("Maul");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "2d6";
    properties = new String[] {"Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
