
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OntbindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OntbindingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="aanleiding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="liquidatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LiquidatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntbindingType", propOrder = {
    "aanleiding",
    "liquidatie"
})
public class OntbindingType
    extends BasisType
{

    protected EnumeratieType aanleiding;
    protected LiquidatieType liquidatie;

    /**
     * Gets the value of the aanleiding property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAanleiding() {
        return aanleiding;
    }

    /**
     * Sets the value of the aanleiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAanleiding(EnumeratieType value) {
        this.aanleiding = value;
    }

    /**
     * Gets the value of the liquidatie property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidatieType }
     *     
     */
    public LiquidatieType getLiquidatie() {
        return liquidatie;
    }

    /**
     * Sets the value of the liquidatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidatieType }
     *     
     */
    public void setLiquidatie(LiquidatieType value) {
        this.liquidatie = value;
    }

}
