
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VestigingOfRsinOfKvKNummerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingOfRsinOfKvKNummerRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ProductRequestType">
 *       &lt;choice>
 *         &lt;element name="vestigingsnummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingsnummerType"/>
 *         &lt;element name="kvkNummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KvKNummerType"/>
 *         &lt;element name="rsin" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RSINummerType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingOfRsinOfKvKNummerRequestType", propOrder = {
    "vestigingsnummer",
    "kvkNummer",
    "rsin"
})
@XmlSeeAlso({
    VestigingRequestType.class
})
public class VestigingOfRsinOfKvKNummerRequestType
    extends ProductRequestType
{

    protected String vestigingsnummer;
    protected String kvkNummer;
    protected String rsin;

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
     * Gets the value of the kvkNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvkNummer() {
        return kvkNummer;
    }

    /**
     * Sets the value of the kvkNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvkNummer(String value) {
        this.kvkNummer = value;
    }

    /**
     * Gets the value of the rsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsin() {
        return rsin;
    }

    /**
     * Sets the value of the rsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsin(String value) {
        this.rsin = value;
    }

}
