
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NietCommercieleVestigingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NietCommercieleVestigingRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="nietCommercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietCommercieleVestigingType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NietCommercieleVestigingRelatieRegistratieType", propOrder = {
    "nietCommercieleVestiging"
})
public class NietCommercieleVestigingRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected NietCommercieleVestigingType nietCommercieleVestiging;

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
