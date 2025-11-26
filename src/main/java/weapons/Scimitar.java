package weapons;

public class Scimitar extends WeaponTemplate{
  public Scimitar() {
    weaponName = "Scimitar";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Slashing;
    damageDice = "1d6";
    properties = new String[] {"Finesse","Light"};
    weaponRating = WeaponRating.Martial;
  }
}
