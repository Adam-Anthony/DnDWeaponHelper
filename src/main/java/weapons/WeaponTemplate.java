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
  public String getWeaponName() { return weaponName;}
  public WeaponCategory getWeaponCategory() { return weaponCategory;}
  public String getDamageDice() { return damageDice; }
  public String getSecondaryDamageDice() { return secondaryDamageDice; }
  public String getVersatileDamageDice() { return versatileDamageDice; }
  public String[] getProperties() { return properties; }
  public String writeProperties() { return Arrays.toString(properties); }
  public WeaponRating getWeaponRating() { return weaponRating;}
  public DamageTypes getDamageType() { return damageType;}
  public DamageTypes getSecondaryDamageType() { return secondaryDamageType;}

  public void setColour(String colour) { this.colour = colour; }
  public String getColour() { return colour; }

  @Override
  public String toString() {
    String returnString = "[" + (colour!=null ? colour+" " : "")  + weaponName + "] | Damage: " + damageDice;
    if (versatileDamageDice != null)
      returnString += " (" + versatileDamageDice + ")";
    returnString += " ["+ damageType+"]";
    if (secondaryDamageDice != null)
      returnString += ",  " + secondaryDamageDice+" ["+secondaryDamageType+"]";
      returnString += " + " + secondaryDamageDice+" ["+secondaryDamageType+"]";
    if (properties != null)
      returnString += "\n Properties: " + writeProperties();
    return  returnString;
  }
}
