
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VestigingRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;choice>
 *         &lt;element name="commercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommercieleVestigingType"/>
 *         &lt;element name="nietCommercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietCommercieleVestigingType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingRelatieType", propOrder = {
    "commercieleVestiging",
    "nietCommercieleVestiging"
})
public class VestigingRelatieType
    extends RelatieType
{

    protected CommercieleVestigingType commercieleVestiging;
    protected NietCommercieleVestigingType nietCommercieleVestiging;

    /**
     * Gets the value of the commercieleVestiging property.
     * 
     * @return
     *     possible object is
     *     {@link CommercieleVestigingType }
     *     
     */
    public CommercieleVestigingType getCommercieleVestiging() {
        return commercieleVestiging;
    }

    /**
     * Sets the value of the commercieleVestiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercieleVestigingType }
     *     
     */
    public void setCommercieleVestiging(CommercieleVestigingType value) {
        this.commercieleVestiging = value;
    }

    /**
     * Gets the value of the nietCommercieleVestiging property.
     * 
     * @return
     *     possible object is
     *     {@link NietCommercieleVestigingType }
     *     
     */
    public NietCommercieleVestigingType getNietCommercieleVestiging() {
        return nietCommercieleVestiging;
    }

    /**
     * Sets the value of the nietCommercieleVestiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietCommercieleVestigingType }
     *     
     */
    public void setNietCommercieleVestiging(NietCommercieleVestigingType value) {
        this.nietCommercieleVestiging = value;
    }

}
