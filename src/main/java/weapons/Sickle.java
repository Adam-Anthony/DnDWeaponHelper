package weapons;

public class Sickle extends WeaponTemplate{
  public Sickle() {
    weaponName = "Sickle";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d4";
    properties = new String[] {"Light"};
    weaponRating = WeaponRating.Simple;
  }
}
