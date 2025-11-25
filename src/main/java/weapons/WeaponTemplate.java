package weapons;

import java.util.Arrays;

abstract class WeaponTemplate {
  protected String weaponName = null;
  protected WeaponCategory weaponCategory = null;
  protected DamageTypes damageType = null;
  protected DamageTypes secondaryDamageType = DamageTypes.NONE;
  protected String damageDice = null;
  protected String versatileDamageDice = null;
  protected String secondaryDamageDice = null;
  protected String[] properties = null;
  protected WeaponRating weaponRating = null;


  String getWeaponName() { return weaponName;}
  WeaponCategory getWeaponCategory() { return weaponCategory;}
  String getDamageDice() { return damageDice; }
  String getSecondaryDamageDice() { return secondaryDamageDice; }
  String getVersatileDamageDice() { return versatileDamageDice; }
  String[] getProperties() { return properties; }
  String writeProperties() { return Arrays.toString(properties); }
  WeaponRating getWeaponRating() { return weaponRating;}
  DamageTypes getDamageType() { return damageType;}
  DamageTypes getSecondaryDamageType() { return secondaryDamageType;}

  @Override
  public String toString() {
    String returnString = "[" + weaponName + "] | Damage: " + damageDice;
    if (versatileDamageDice != null)
      returnString += " (" + versatileDamageDice + ")";
    returnString += " ["+ damageType+"]";
    if (secondaryDamageDice != null)
      returnString += ",  " + secondaryDamageDice+" ["+secondaryDamageType+"]";
    if (properties != null)
      returnString += "\n Properties: " + writeProperties();
    return  returnString;
  }
}
