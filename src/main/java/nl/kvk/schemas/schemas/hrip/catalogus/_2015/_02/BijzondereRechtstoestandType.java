
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BijzondereRechtstoestandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BijzondereRechtstoestandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="uitspraakAanvang" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/>
 *           &lt;element name="uitspraakEinde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/>
 *         &lt;/choice>
 *         &lt;element name="redenEindeInsolventie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="duur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isVerlengd" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BijzondereRechtstoestandType", propOrder = {
    "soort",
    "uitspraakAanvang",
    "uitspraakEinde",
    "redenEindeInsolventie",
    "status",
    "duur",
    "isVerlengd"
})
public class BijzondereRechtstoestandType
    extends BasisType
{

    protected EnumeratieType soort;
    protected RechterlijkeUitspraakType uitspraakAanvang;
    protected RechterlijkeUitspraakType uitspraakEinde;
    protected EnumeratieType redenEindeInsolventie;
    protected EnumeratieType status;
    protected String duur;
    protected EnumeratieType isVerlengd;

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSoort(EnumeratieType value) {
        this.soort = value;
    }

    /**
     * Gets the value of the uitspraakAanvang property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakAanvang() {
        return uitspraakAanvang;
    }

    /**
     * Sets the value of the uitspraakAanvang property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakAanvang(RechterlijkeUitspraakType value) {
        this.uitspraakAanvang = value;
    }

    /**
     * Gets the value of the uitspraakEinde property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakEinde() {
        return uitspraakEinde;
    }

    /**
     * Sets the value of the uitspraakEinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakEinde(RechterlijkeUitspraakType value) {
        this.uitspraakEinde = value;
    }

    /**
     * Gets the value of the redenEindeInsolventie property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRedenEindeInsolventie() {
        return redenEindeInsolventie;
    }

    /**
     * Sets the value of the redenEindeInsolventie property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRedenEindeInsolventie(EnumeratieType value) {
        this.redenEindeInsolventie = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setStatus(EnumeratieType value) {
        this.status = value;
    }

    /**
     * Gets the value of the duur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuur() {
        return duur;
    }

    /**
     * Sets the value of the duur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuur(String value) {
        this.duur = value;
    }

    /**
     * Gets the value of the isVerlengd property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIsVerlengd() {
        return isVerlengd;
    }

    /**
     * Sets the value of the isVerlengd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIsVerlengd(EnumeratieType value) {
        this.isVerlengd = value;
    }

}
