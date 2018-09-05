
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VestigingsnummerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingsnummerRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="vestigingsnummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingsnummerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingsnummerRequestType", propOrder = {
    "vestigingsnummer"
})
public class VestigingsnummerRequestType
    extends ProductRequestType
{

    @XmlElement(required = true)
    protected String vestigingsnummer;

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

}
