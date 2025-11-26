package weapons;

public class Pike extends WeaponTemplate{
  public Pike() {
    weaponName = "Pike";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d10";
    properties = new String[] {"Heavy","Reach","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
