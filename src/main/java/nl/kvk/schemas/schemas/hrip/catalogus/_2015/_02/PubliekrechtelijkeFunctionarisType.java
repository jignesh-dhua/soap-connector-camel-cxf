
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PubliekrechtelijkeFunctionarisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PubliekrechtelijkeFunctionarisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingType">
 *       &lt;sequence>
 *         &lt;element name="functie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="bevoegdheid" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BevoegdheidPubliekrechtelijkeFunctionarisType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubliekrechtelijkeFunctionarisType", propOrder = {
    "functie",
    "bevoegdheid"
})
public class PubliekrechtelijkeFunctionarisType
    extends FunctievervullingType
{

    @XmlElement(required = true)
    protected EnumeratieType functie;
    protected BevoegdheidPubliekrechtelijkeFunctionarisType bevoegdheid;

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
     *     {@link BevoegdheidPubliekrechtelijkeFunctionarisType }
     *     
     */
    public BevoegdheidPubliekrechtelijkeFunctionarisType getBevoegdheid() {
        return bevoegdheid;
    }

    /**
     * Sets the value of the bevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BevoegdheidPubliekrechtelijkeFunctionarisType }
     *     
     */
    public void setBevoegdheid(BevoegdheidPubliekrechtelijkeFunctionarisType value) {
        this.bevoegdheid = value;
    }

}
