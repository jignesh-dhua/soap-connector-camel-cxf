
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VestigingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="vestigingsnummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingsnummerType" minOccurs="0"/>
 *         &lt;element name="bezoekLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="postLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="communicatiegegevens" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommunicatiegegevensType" minOccurs="0"/>
 *         &lt;element name="eersteHandelsnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isSamengevoegdMet" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingenRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="isOvergenomenVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VoortzettingRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="isOvergedragenNaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VoortzettingRelatieRegistratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingType", propOrder = {
    "vestigingsnummer",
    "bezoekLocatie",
    "postLocatie",
    "communicatiegegevens",
    "eersteHandelsnaam",
    "isSamengevoegdMet",
    "isOvergenomenVan",
    "isOvergedragenNaar"
})
@XmlSeeAlso({
    NietCommercieleVestigingType.class,
    CommercieleVestigingType.class
})
public abstract class VestigingType
    extends BasisType
{

    protected String vestigingsnummer;
    protected LocatieType bezoekLocatie;
    protected LocatieType postLocatie;
    protected CommunicatiegegevensType communicatiegegevens;
    protected String eersteHandelsnaam;
    protected VestigingenRelatieRegistratieType isSamengevoegdMet;
    protected VoortzettingRelatieRegistratieType isOvergenomenVan;
    protected VoortzettingRelatieRegistratieType isOvergedragenNaar;

    /**
     * Gets the value of the vestigingsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVestigingsnummer() {
        return vestigingsnummer;
    }

    /**
     * Sets the value of the vestigingsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVestigingsnummer(String value) {
        this.vestigingsnummer = value;
    }

    /**
     * Gets the value of the bezoekLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getBezoekLocatie() {
        return bezoekLocatie;
    }

    /**
     * Sets the value of the bezoekLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setBezoekLocatie(LocatieType value) {
        this.bezoekLocatie = value;
    }

    /**
     * Gets the value of the postLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getPostLocatie() {
        return postLocatie;
    }

    /**
     * Sets the value of the postLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setPostLocatie(LocatieType value) {
        this.postLocatie = value;
    }

    /**
     * Gets the value of the communicatiegegevens property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicatiegegevensType }
     *     
     */
    public CommunicatiegegevensType getCommunicatiegegevens() {
        return communicatiegegevens;
    }

    /**
     * Sets the value of the communicatiegegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicatiegegevensType }
     *     
     */
    public void setCommunicatiegegevens(CommunicatiegegevensType value) {
        this.communicatiegegevens = value;
    }

    /**
     * Gets the value of the eersteHandelsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEersteHandelsnaam() {
        return eersteHandelsnaam;
    }

    /**
     * Sets the value of the eersteHandelsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEersteHandelsnaam(String value) {
        this.eersteHandelsnaam = value;
    }

    /**
     * Gets the value of the isSamengevoegdMet property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingenRelatieRegistratieType }
     *     
     */
    public VestigingenRelatieRegistratieType getIsSamengevoegdMet() {
        return isSamengevoegdMet;
    }

    /**
     * Sets the value of the isSamengevoegdMet property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingenRelatieRegistratieType }
     *     
     */
    public void setIsSamengevoegdMet(VestigingenRelatieRegistratieType value) {
        this.isSamengevoegdMet = value;
    }

    /**
     * Gets the value of the isOvergenomenVan property.
     * 
     * @return
     *     possible object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public VoortzettingRelatieRegistratieType getIsOvergenomenVan() {
        return isOvergenomenVan;
    }

    /**
     * Sets the value of the isOvergenomenVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public void setIsOvergenomenVan(VoortzettingRelatieRegistratieType value) {
        this.isOvergenomenVan = value;
    }

    /**
     * Gets the value of the isOvergedragenNaar property.
     * 
     * @return
     *     possible object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public VoortzettingRelatieRegistratieType getIsOvergedragenNaar() {
        return isOvergedragenNaar;
    }

    /**
     * Sets the value of the isOvergedragenNaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public void setIsOvergedragenNaar(VoortzettingRelatieRegistratieType value) {
        this.isOvergedragenNaar = value;
    }

}
