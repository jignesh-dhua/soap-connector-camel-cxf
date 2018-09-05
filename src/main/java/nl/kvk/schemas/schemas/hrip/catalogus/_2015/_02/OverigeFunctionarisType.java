
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverigeFunctionarisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverigeFunctionarisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingType">
 *       &lt;sequence>
 *         &lt;element name="functie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="geplaatstKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/>
 *         &lt;element name="gestortKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/>
 *         &lt;element name="bevoegdheid" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BevoegdheidOverigeFunctionarisType" minOccurs="0"/>
 *         &lt;element name="heeftAfwijkendAansprakelijkheidsbeding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverigeFunctionarisType", propOrder = {
    "functie",
    "geplaatstKapitaal",
    "gestortKapitaal",
    "bevoegdheid",
    "heeftAfwijkendAansprakelijkheidsbeding"
})
public class OverigeFunctionarisType
    extends FunctievervullingType
{

    @XmlElement(required = true)
    protected EnumeratieType functie;
    protected KapitaalType geplaatstKapitaal;
    protected KapitaalType gestortKapitaal;
    protected BevoegdheidOverigeFunctionarisType bevoegdheid;
    protected EnumeratieType heeftAfwijkendAansprakelijkheidsbeding;

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
     * Gets the value of the geplaatstKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getGeplaatstKapitaal() {
        return geplaatstKapitaal;
    }

    /**
     * Sets the value of the geplaatstKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setGeplaatstKapitaal(KapitaalType value) {
        this.geplaatstKapitaal = value;
    }

    /**
     * Gets the value of the gestortKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getGestortKapitaal() {
        return gestortKapitaal;
    }

    /**
     * Sets the value of the gestortKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setGestortKapitaal(KapitaalType value) {
        this.gestortKapitaal = value;
    }

    /**
     * Gets the value of the bevoegdheid property.
     * 
     * @return
     *     possible object is
     *     {@link BevoegdheidOverigeFunctionarisType }
     *     
     */
    public BevoegdheidOverigeFunctionarisType getBevoegdheid() {
        return bevoegdheid;
    }

    /**
     * Sets the value of the bevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BevoegdheidOverigeFunctionarisType }
     *     
     */
    public void setBevoegdheid(BevoegdheidOverigeFunctionarisType value) {
        this.bevoegdheid = value;
    }

    /**
     * Gets the value of the heeftAfwijkendAansprakelijkheidsbeding property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getHeeftAfwijkendAansprakelijkheidsbeding() {
        return heeftAfwijkendAansprakelijkheidsbeding;
    }

    /**
     * Sets the value of the heeftAfwijkendAansprakelijkheidsbeding property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setHeeftAfwijkendAansprakelijkheidsbeding(EnumeratieType value) {
        this.heeftAfwijkendAansprakelijkheidsbeding = value;
    }

}
