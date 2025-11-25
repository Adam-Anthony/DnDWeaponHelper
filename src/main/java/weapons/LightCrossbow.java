package weapons;

public class LightCrossbow extends WeaponTemplate{
  public LightCrossbow() {
    weaponName = "Light Crossbow";
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d8";
    properties = new String[] {"Ammunition (Range 80/320; Bolt), Loading, Two-Handed"};
    weaponRating = WeaponRating.Simple;
  }
}
