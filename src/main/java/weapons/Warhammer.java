package weapons;
import weaponforger.*;

public class Warhammer extends WeaponTemplate{
  public Warhammer() {
    setWeaponType("Warhammer");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d8";
    versatileDamageDice = "1d10";
    properties = new String[] {"Versatile (1d10)"};
    weaponRating = WeaponRating.Martial;
  }
}
