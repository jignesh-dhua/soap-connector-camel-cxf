
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AansprakelijkeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AansprakelijkeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingType">
 *       &lt;sequence>
 *         &lt;element name="functie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="handlichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandlichtingType" minOccurs="0"/>
 *         &lt;element name="bevoegdheid" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BevoegdheidAansprakelijkeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AansprakelijkeType", propOrder = {
    "functie",
    "handlichting",
    "bevoegdheid"
})
public class AansprakelijkeType
    extends FunctievervullingType
{

    @XmlElement(required = true)
    protected EnumeratieType functie;
    protected HandlichtingType handlichting;
    protected BevoegdheidAansprakelijkeType bevoegdheid;

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
     * Gets the value of the handlichting property.
     * 
     * @return
     *     possible object is
     *     {@link HandlichtingType }
     *     
     */
    public HandlichtingType getHandlichting() {
        return handlichting;
    }

    /**
     * Sets the value of the handlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlichtingType }
     *     
     */
    public void setHandlichting(HandlichtingType value) {
        this.handlichting = value;
    }

    /**
     * Gets the value of the bevoegdheid property.
     * 
     * @return
     *     possible object is
     *     {@link BevoegdheidAansprakelijkeType }
     *     
     */
    public BevoegdheidAansprakelijkeType getBevoegdheid() {
        return bevoegdheid;
    }

    /**
     * Sets the value of the bevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BevoegdheidAansprakelijkeType }
     *     
     */
    public void setBevoegdheid(BevoegdheidAansprakelijkeType value) {
        this.bevoegdheid = value;
    }

}
