
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercieleVestigingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercieleVestigingRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="commercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommercieleVestigingType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercieleVestigingRelatieRegistratieType", propOrder = {
    "commercieleVestiging"
})
public class CommercieleVestigingRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected CommercieleVestigingType commercieleVestiging;

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

}
