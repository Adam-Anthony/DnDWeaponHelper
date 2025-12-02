package weapons;
import weaponforger.*;

public class Battleaxe extends WeaponTemplate{
  public Battleaxe() {
    setWeaponType("Battleaxe");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d8";
    versatileDamageDice = "1d10";
    properties = new String[] {"Versatile (1d10)"};
    weaponRating = WeaponRating.Martial;
  }
}
