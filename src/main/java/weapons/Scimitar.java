package weapons;
import weaponforger.*;

public class Scimitar extends WeaponTemplate{
  public Scimitar() {
    setWeaponType("Scimitar");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d6";
    properties = new String[] {"Finesse","Light"};
    weaponRating = WeaponRating.Martial;
  }
}
