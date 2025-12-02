package weapons;
import weaponforger.*;

public class Club extends WeaponTemplate{
  public Club() {
    setWeaponType("Club");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d4";
    properties = new String[] {"Light"};
    weaponRating = WeaponRating.Simple;
  }
}