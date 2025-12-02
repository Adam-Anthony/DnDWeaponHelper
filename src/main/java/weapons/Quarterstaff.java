package weapons;
import weaponforger.*;

public class Quarterstaff extends WeaponTemplate{
  public Quarterstaff() {
    setWeaponType("Quarterstaff");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d6";
    versatileDamageDice = "1d8";
    properties = new String[] {"Versatile (1d8)"};
    weaponRating = WeaponRating.Simple;
  }
}
