
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FusieSplitsingVoorstelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FusieSplitsingVoorstelType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="rol" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="zuivereSplitsing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FusieSplitsingVoorstelType", propOrder = {
    "rol",
    "zuivereSplitsing"
})
public class FusieSplitsingVoorstelType
    extends MetExtraElementenMogenlijkheidType
{

    @XmlElement(required = true)
    protected EnumeratieType rol;
    protected EnumeratieType zuivereSplitsing;

    /**
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRol(EnumeratieType value) {
        this.rol = value;
    }

    /**
     * Gets the value of the zuivereSplitsing property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getZuivereSplitsing() {
        return zuivereSplitsing;
    }

    /**
     * Sets the value of the zuivereSplitsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setZuivereSplitsing(EnumeratieType value) {
        this.zuivereSplitsing = value;
    }

}
