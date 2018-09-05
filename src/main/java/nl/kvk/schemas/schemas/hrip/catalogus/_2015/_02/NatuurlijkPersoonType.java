
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NatuurlijkPersoonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NatuurlijkPersoonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonType">
 *       &lt;sequence>
 *         &lt;element name="bsn" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BSNummerType" minOccurs="0"/>
 *         &lt;element name="geslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voorvoegselGeslachtsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voornamen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geslachtsaanduiding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="geboorteplaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geboorteland" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="adellijkeTitel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="aanduidingNaamgebruik" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="geslachtsnaamPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voorvoegselGeslachtsnaamPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="handlichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandlichtingType" minOccurs="0"/>
 *         &lt;element name="geboortedatum" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="overlijdensdatum" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumEersteHuwelijk" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumGeemigreerd" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="woonLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NatuurlijkPersoonType", propOrder = {
    "bsn",
    "geslachtsnaam",
    "voorvoegselGeslachtsnaam",
    "voornamen",
    "geslachtsaanduiding",
    "geboorteplaats",
    "geboorteland",
    "adellijkeTitel",
    "aanduidingNaamgebruik",
    "geslachtsnaamPartner",
    "voorvoegselGeslachtsnaamPartner",
    "handlichting",
    "geboortedatum",
    "overlijdensdatum",
    "datumEersteHuwelijk",
    "datumGeemigreerd",
    "woonLocatie"
})
public class NatuurlijkPersoonType
    extends PersoonType
{

    protected String bsn;
    protected String geslachtsnaam;
    protected String voorvoegselGeslachtsnaam;
    protected String voornamen;
    protected EnumeratieType geslachtsaanduiding;
    protected String geboorteplaats;
    protected EnumeratieType geboorteland;
    protected EnumeratieType adellijkeTitel;
    protected EnumeratieType aanduidingNaamgebruik;
    protected String geslachtsnaamPartner;
    protected String voorvoegselGeslachtsnaamPartner;
    protected HandlichtingType handlichting;
    protected String geboortedatum;
    protected String overlijdensdatum;
    protected String datumEersteHuwelijk;
    protected String datumGeemigreerd;
    protected LocatieType woonLocatie;

    /**
     * Gets the value of the bsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsn() {
        return bsn;
    }

    /**
     * Sets the value of the bsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsn(String value) {
        this.bsn = value;
    }

    /**
     * Gets the value of the geslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslachtsnaam() {
        return geslachtsnaam;
    }

    /**
     * Sets the value of the geslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslachtsnaam(String value) {
        this.geslachtsnaam = value;
    }

    /**
     * Gets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegselGeslachtsnaam() {
        return voorvoegselGeslachtsnaam;
    }

    /**
     * Sets the value of the voorvoegselGeslachtsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegselGeslachtsnaam(String value) {
        this.voorvoegselGeslachtsnaam = value;
    }

    /**
     * Gets the value of the voornamen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoornamen() {
        return voornamen;
    }

    /**
     * Sets the value of the voornamen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoornamen(String value) {
        this.voornamen = value;
    }

    /**
     * Gets the value of the geslachtsaanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getGeslachtsaanduiding() {
        return geslachtsaanduiding;
    }

    /**
     * Sets the value of the geslachtsaanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setGeslachtsaanduiding(EnumeratieType value) {
        this.geslachtsaanduiding = value;
    }

    /**
     * Gets the value of the geboorteplaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboorteplaats() {
        return geboorteplaats;
    }

    /**
     * Sets the value of the geboorteplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboorteplaats(String value) {
        this.geboorteplaats = value;
    }

    /**
     * Gets the value of the geboorteland property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getGeboorteland() {
        return geboorteland;
    }

    /**
     * Sets the value of the geboorteland property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setGeboorteland(EnumeratieType value) {
        this.geboorteland = value;
    }

    /**
     * Gets the value of the adellijkeTitel property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAdellijkeTitel() {
        return adellijkeTitel;
    }

    /**
     * Sets the value of the adellijkeTitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAdellijkeTitel(EnumeratieType value) {
        this.adellijkeTitel = value;
    }

    /**
     * Gets the value of the aanduidingNaamgebruik property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAanduidingNaamgebruik() {
        return aanduidingNaamgebruik;
    }

    /**
     * Sets the value of the aanduidingNaamgebruik property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAanduidingNaamgebruik(EnumeratieType value) {
        this.aanduidingNaamgebruik = value;
    }

    /**
     * Gets the value of the geslachtsnaamPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeslachtsnaamPartner() {
        return geslachtsnaamPartner;
    }

    /**
     * Sets the value of the geslachtsnaamPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeslachtsnaamPartner(String value) {
        this.geslachtsnaamPartner = value;
    }

    /**
     * Gets the value of the voorvoegselGeslachtsnaamPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorvoegselGeslachtsnaamPartner() {
        return voorvoegselGeslachtsnaamPartner;
    }

    /**
     * Sets the value of the voorvoegselGeslachtsnaamPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorvoegselGeslachtsnaamPartner(String value) {
        this.voorvoegselGeslachtsnaamPartner = value;
    }

    /**
     * Gets the value of the handlichting property.
     * 
     * @return
     *     possible object is
     *     {@link HandlichtingType }
     *     
     */
    public HandlichtingType getHandlichting() {
        return handlichting;
    }

    /**
     * Sets the value of the handlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlichtingType }
     *     
     */
    public void setHandlichting(HandlichtingType value) {
        this.handlichting = value;
    }

    /**
     * Gets the value of the geboortedatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeboortedatum() {
        return geboortedatum;
    }

    /**
     * Sets the value of the geboortedatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeboortedatum(String value) {
        this.geboortedatum = value;
    }

    /**
     * Gets the value of the overlijdensdatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlijdensdatum() {
        return overlijdensdatum;
    }

    /**
     * Sets the value of the overlijdensdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlijdensdatum(String value) {
        this.overlijdensdatum = value;
    }

    /**
     * Gets the value of the datumEersteHuwelijk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumEersteHuwelijk() {
        return datumEersteHuwelijk;
    }

    /**
     * Sets the value of the datumEersteHuwelijk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumEersteHuwelijk(String value) {
        this.datumEersteHuwelijk = value;
    }

    /**
     * Gets the value of the datumGeemigreerd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumGeemigreerd() {
        return datumGeemigreerd;
    }

    /**
     * Sets the value of the datumGeemigreerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumGeemigreerd(String value) {
        this.datumGeemigreerd = value;
    }

    /**
     * Gets the value of the woonLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getWoonLocatie() {
        return woonLocatie;
    }

    /**
     * Sets the value of the woonLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setWoonLocatie(LocatieType value) {
        this.woonLocatie = value;
    }

}
