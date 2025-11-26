package weapons;

public class Longsword extends WeaponTemplate{
  public Longsword() {
    weaponName = "Longsword";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d8";
    versatileDamageDice = "1d10";
    properties = new String[] {"Versatile (1d10)"};
    weaponRating = WeaponRating.Martial;
  }
}
