package weapons;
import weaponforger.*;

public class Sickle extends WeaponTemplate{
  public Sickle() {
    setWeaponType("Sickle");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d4";
    properties = new String[] {"Light"};
    weaponRating = WeaponRating.Simple;
  }
}
