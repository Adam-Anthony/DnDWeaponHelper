package weapons;

public class WarPick extends WeaponTemplate{
  public WarPick() {
    weaponName = "War Pick";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    versatileDamageDice = "1d10";
    properties = new String[] {"Versatile (1d10)"};
    weaponRating = WeaponRating.Martial;
  }
}
