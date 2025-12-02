package weapons;
import weaponforger.*;

public class Spear extends WeaponTemplate{
  public Spear() {
    setWeaponType("Spear");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    versatileDamageDice = "1d8";
    properties = new String[] {"Thrown (Range 20/60)","Versatile (1d8)"};
    weaponRating = WeaponRating.Simple;
  }
}
