package weapons;

public class Glaive extends WeaponTemplate{
  public Glaive() {
    weaponName = "Glaive";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d10";
    properties = new String[] {"Heavy","Reach","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
