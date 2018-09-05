
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AandeelSamenstellingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AandeelSamenstellingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="aantal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Numeriek23DecimaalFractie4"/>
 *         &lt;element name="aandeel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AandeelType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AandeelSamenstellingType", propOrder = {
    "aantal",
    "aandeel"
})
public class AandeelSamenstellingType
    extends BasisType
{

    @XmlElement(required = true)
    protected BigDecimal aantal;
    @XmlElement(required = true)
    protected AandeelType aandeel;

    /**
     * Gets the value of the aantal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAantal() {
        return aantal;
    }

    /**
     * Sets the value of the aantal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAantal(BigDecimal value) {
        this.aantal = value;
    }

    /**
     * Gets the value of the aandeel property.
     * 
     * @return
     *     possible object is
     *     {@link AandeelType }
     *     
     */
    public AandeelType getAandeel() {
        return aandeel;
    }

    /**
     * Sets the value of the aandeel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AandeelType }
     *     
     */
    public void setAandeel(AandeelType value) {
        this.aandeel = value;
    }

}
