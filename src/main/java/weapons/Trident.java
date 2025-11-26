package weapons;

public class Trident extends WeaponTemplate{
  public Trident() {
    weaponName = "Trident";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    versatileDamageDice = "1d10";
    properties = new String[] {"Thrown (Range 20/60)","Versatile (1d10)"};
    weaponRating = WeaponRating.Martial;
  }
}
