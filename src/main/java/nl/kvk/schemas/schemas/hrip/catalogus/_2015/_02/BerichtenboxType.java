
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BerichtenboxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BerichtenboxType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="berichtenboxnaam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BerichtenboxType", propOrder = {
    "berichtenboxnaam"
})
public class BerichtenboxType
    extends MetExtraElementenMogenlijkheidType
{

    @XmlElement(required = true)
    protected String berichtenboxnaam;

    /**
     * Gets the value of the berichtenboxnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerichtenboxnaam() {
        return berichtenboxnaam;
    }

    /**
     * Sets the value of the berichtenboxnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerichtenboxnaam(String value) {
        this.berichtenboxnaam = value;
    }

}
