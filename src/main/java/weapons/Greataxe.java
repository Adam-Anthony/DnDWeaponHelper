package weapons;
import weaponforger.*;

public class Greataxe extends WeaponTemplate{
  public Greataxe() {
    setWeaponType("Greataxe");
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d12";
    properties = new String[] {"Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
