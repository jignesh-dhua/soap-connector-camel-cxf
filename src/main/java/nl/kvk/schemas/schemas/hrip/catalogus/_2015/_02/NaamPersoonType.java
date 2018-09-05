
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NaamPersoonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NaamPersoonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefoonnummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}TelefoonnummerType" minOccurs="0"/>
 *         &lt;element name="adres" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NaamPersoonType", propOrder = {
    "naam",
    "telefoonnummer",
    "adres"
})
public class NaamPersoonType
    extends PersoonType
{

    protected String naam;
    protected TelefoonnummerType telefoonnummer;
    protected LocatieType adres;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the telefoonnummer property.
     * 
     * @return
     *     possible object is
     *     {@link TelefoonnummerType }
     *     
     */
    public TelefoonnummerType getTelefoonnummer() {
        return telefoonnummer;
    }

    /**
     * Sets the value of the telefoonnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefoonnummerType }
     *     
     */
    public void setTelefoonnummer(TelefoonnummerType value) {
        this.telefoonnummer = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setAdres(LocatieType value) {
        this.adres = value;
    }

}
