package weapons;
import weaponforger.*;

public class Handaxe extends WeaponTemplate{
  public Handaxe() {
    setWeaponType("Handaxe");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d6";
    properties = new String[] {"Light","Thrown (Range 20/60)"};
    weaponRating = WeaponRating.Simple;
  }
}
