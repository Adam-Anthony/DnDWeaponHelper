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
  protected DamageTypes chromaticType = null;
  protected String colour = null;


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

  public void setChromaticType(DamageTypes chromaticType) { this.chromaticType = chromaticType; }
  public void setColour(String colour) { this.colour = colour; }
  public DamageTypes getChromaticType() { return chromaticType; }
  public String getColour() { return colour; }

  @Override
  public String toString() {
    String returnString = "[" + (colour!=null ? colour+" " : "")  + weaponName + "] | Damage: " + damageDice;
    if (versatileDamageDice != null)
      returnString += " (" + versatileDamageDice + ")";
    returnString += " ["+ damageType+"]";
    if (secondaryDamageDice != null)
      returnString += " + " + secondaryDamageDice+" ["+secondaryDamageType+"]";
    if (chromaticType != null)
      returnString += " + 1d4 ["+ chromaticType+"]";
    if (properties != null)
      returnString += "\n Properties: " + writeProperties();
    return  returnString;
  }
}
