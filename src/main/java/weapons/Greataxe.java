package weapons;

public class Greataxe extends WeaponTemplate{
  public Greataxe() {
    weaponName = "Greataxe";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d12";
    properties = new String[] {"Heavy","Two-Handed"};
    weaponRating = WeaponRating.Martial;
  }
}
