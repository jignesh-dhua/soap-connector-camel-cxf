
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctionarisBijzondereRechtstoestandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionarisBijzondereRechtstoestandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingType">
 *       &lt;sequence>
 *         &lt;element name="functie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="bevoegdheid" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BevoegdheidBewindvoerderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionarisBijzondereRechtstoestandType", propOrder = {
    "functie",
    "bevoegdheid"
})
public class FunctionarisBijzondereRechtstoestandType
    extends FunctievervullingType
{

    @XmlElement(required = true)
    protected EnumeratieType functie;
    protected BevoegdheidBewindvoerderType bevoegdheid;

    /**
     * Gets the value of the functie property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getFunctie() {
        return functie;
    }

    /**
     * Sets the value of the functie property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setFunctie(EnumeratieType value) {
        this.functie = value;
    }

    /**
     * Gets the value of the bevoegdheid property.
     * 
     * @return
     *     possible object is
     *     {@link BevoegdheidBewindvoerderType }
     *     
     */
    public BevoegdheidBewindvoerderType getBevoegdheid() {
        return bevoegdheid;
    }

    /**
     * Sets the value of the bevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BevoegdheidBewindvoerderType }
     *     
     */
    public void setBevoegdheid(BevoegdheidBewindvoerderType value) {
        this.bevoegdheid = value;
    }

}
