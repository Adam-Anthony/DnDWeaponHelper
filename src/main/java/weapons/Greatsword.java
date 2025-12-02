package weapons;
import weaponforger.*;

public class Greatsword extends WeaponTemplate{
  public Greatsword() {
    setWeaponType("Greatsword");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "2d6";
    properties = new String[] {"Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
