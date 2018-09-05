
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AandeelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AandeelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="soort" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="waarde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AandeelType", propOrder = {
    "soort",
    "waarde"
})
public class AandeelType
    extends BasisType
{

    @XmlElement(required = true)
    protected String soort;
    @XmlElement(required = true)
    protected GeldType waarde;

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoort(String value) {
        this.soort = value;
    }

    /**
     * Gets the value of the waarde property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getWaarde() {
        return waarde;
    }

    /**
     * Sets the value of the waarde property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setWaarde(GeldType value) {
        this.waarde = value;
    }

}
