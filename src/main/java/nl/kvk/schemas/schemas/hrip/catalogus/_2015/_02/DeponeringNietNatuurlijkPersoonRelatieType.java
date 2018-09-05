
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringNietNatuurlijkPersoonRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringNietNatuurlijkPersoonRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;sequence>
 *         &lt;element name="rsin" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RSINummerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringNietNatuurlijkPersoonRelatieType", propOrder = {
    "rsin"
})
public class DeponeringNietNatuurlijkPersoonRelatieType
    extends RelatieType
{

    protected String rsin;

    /**
     * Gets the value of the rsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsin() {
        return rsin;
    }

    /**
     * Sets the value of the rsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsin(String value) {
        this.rsin = value;
    }

}
