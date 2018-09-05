
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelefoonnummerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelefoonnummerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="toegangscode" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Alfanumeriek5" minOccurs="0"/>
 *         &lt;element name="nummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Alfanumeriek15"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelefoonnummerType", propOrder = {
    "toegangscode",
    "nummer"
})
public class TelefoonnummerType
    extends MetExtraElementenMogenlijkheidType
{

    protected String toegangscode;
    @XmlElement(required = true)
    protected String nummer;

    /**
     * Gets the value of the toegangscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToegangscode() {
        return toegangscode;
    }

    /**
     * Sets the value of the toegangscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToegangscode(String value) {
        this.toegangscode = value;
    }

    /**
     * Gets the value of the nummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Sets the value of the nummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

}
