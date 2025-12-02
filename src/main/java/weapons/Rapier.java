package weapons;
import weaponforger.*;

public class Rapier extends WeaponTemplate{
  public Rapier() {
    setWeaponType("Rapier");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    properties = new String[] {"Finesse"};
    weaponRating = WeaponRating.Martial;
  }
}
