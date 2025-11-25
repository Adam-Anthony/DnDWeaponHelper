package weapons;

public class LightHammer extends WeaponTemplate{
  public LightHammer() {
    weaponName = "Light Hammer";
    weaponCategory = WeaponCategory.Melee;
    damageType = DamageTypes.Bludgeoning;
    damageDice = "1d4";
    properties = new String[] {"Light","Thrown (Range 20/60)"};
    weaponRating = WeaponRating.Simple;
  }
}
