package weapons;

public class HandCrossbow extends WeaponTemplate{
  public HandCrossbow() {
    weaponName = "Hand Crossbow";
    weaponCategory = WeaponCategory.Ranged;
    damageType = DamageTypes.Piercing;
    damageDice = "1d6";
    properties = new String[] {"Ammunition (Range 30/120; Bolt)","Light","Loading"};
    weaponRating = WeaponRating.Martial;
  }
}
