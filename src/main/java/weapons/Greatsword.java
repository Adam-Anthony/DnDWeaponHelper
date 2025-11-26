package weapons;

public class Greatsword extends WeaponTemplate{
  public Greatsword() {
    weaponName = "Greatsword";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "2d6";
    properties = new String[] {"Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
