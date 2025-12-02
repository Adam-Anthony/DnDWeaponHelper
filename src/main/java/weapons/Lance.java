package weapons;
import weaponforger.*;

public class Lance extends WeaponTemplate{
  public Lance() {
    setWeaponType("Lance");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d10";
    properties = new String[] {"Heavy","Reach","Two-Handed (unless mounted)"};
    weaponRating = WeaponRating.Martial;
  }
}
