
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuitenlandsAdresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuitenlandsAdresType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="straatHuisnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcodeWoonplaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="land" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuitenlandsAdresType", propOrder = {
    "straatHuisnummer",
    "postcodeWoonplaats",
    "regio",
    "land"
})
public class BuitenlandsAdresType
    extends MetExtraElementenMogenlijkheidType
{

    protected String straatHuisnummer;
    protected String postcodeWoonplaats;
    protected String regio;
    protected EnumeratieType land;

    /**
     * Gets the value of the straatHuisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatHuisnummer() {
        return straatHuisnummer;
    }

    /**
     * Sets the value of the straatHuisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatHuisnummer(String value) {
        this.straatHuisnummer = value;
    }

    /**
     * Gets the value of the postcodeWoonplaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcodeWoonplaats() {
        return postcodeWoonplaats;
    }

    /**
     * Sets the value of the postcodeWoonplaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcodeWoonplaats(String value) {
        this.postcodeWoonplaats = value;
    }

    /**
     * Gets the value of the regio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegio() {
        return regio;
    }

    /**
     * Sets the value of the regio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegio(String value) {
        this.regio = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setLand(EnumeratieType value) {
        this.land = value;
    }

}
