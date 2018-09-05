
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NatuurlijkPersoonRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NatuurlijkPersoonRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;sequence>
 *         &lt;element name="natuurlijkPersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NatuurlijkPersoonType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NatuurlijkPersoonRelatieType", propOrder = {
    "natuurlijkPersoon"
})
public class NatuurlijkPersoonRelatieType
    extends RelatieType
{

    @XmlElement(required = true)
    protected NatuurlijkPersoonType natuurlijkPersoon;

    /**
     * Gets the value of the natuurlijkPersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NatuurlijkPersoonType }
     *     
     */
    public NatuurlijkPersoonType getNatuurlijkPersoon() {
        return natuurlijkPersoon;
    }

    /**
     * Sets the value of the natuurlijkPersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatuurlijkPersoonType }
     *     
     */
    public void setNatuurlijkPersoon(NatuurlijkPersoonType value) {
        this.natuurlijkPersoon = value;
    }

}
