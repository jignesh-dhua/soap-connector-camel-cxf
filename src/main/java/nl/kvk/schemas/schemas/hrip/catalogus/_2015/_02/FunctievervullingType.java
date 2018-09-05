
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctievervullingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctievervullingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="functietitel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctietitelType" minOccurs="0"/>
 *         &lt;element name="schorsing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SchorsingType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="door" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType"/>
 *           &lt;element name="voor" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctievervullingType", propOrder = {
    "functietitel",
    "schorsing",
    "door",
    "voor"
})
@XmlSeeAlso({
    GemachtigdeType.class,
    PubliekrechtelijkeFunctionarisType.class,
    AansprakelijkeType.class,
    OverigeFunctionarisType.class,
    BestuursfunctieType.class,
    FunctionarisBijzondereRechtstoestandType.class
})
public abstract class FunctievervullingType
    extends BasisType
{

    protected FunctietitelType functietitel;
    protected SchorsingType schorsing;
    protected PersoonRelatieType door;
    protected PersoonRelatieType voor;

    /**
     * Gets the value of the functietitel property.
     * 
     * @return
     *     possible object is
     *     {@link FunctietitelType }
     *     
     */
    public FunctietitelType getFunctietitel() {
        return functietitel;
    }

    /**
     * Sets the value of the functietitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctietitelType }
     *     
     */
    public void setFunctietitel(FunctietitelType value) {
        this.functietitel = value;
    }

    /**
     * Gets the value of the schorsing property.
     * 
     * @return
     *     possible object is
     *     {@link SchorsingType }
     *     
     */
    public SchorsingType getSchorsing() {
        return schorsing;
    }

    /**
     * Sets the value of the schorsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchorsingType }
     *     
     */
    public void setSchorsing(SchorsingType value) {
        this.schorsing = value;
    }

    /**
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieType }
     *     
     */
    public PersoonRelatieType getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieType }
     *     
     */
    public void setDoor(PersoonRelatieType value) {
        this.door = value;
    }

    /**
     * Gets the value of the voor property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieType }
     *     
     */
    public PersoonRelatieType getVoor() {
        return voor;
    }

    /**
     * Sets the value of the voor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieType }
     *     
     */
    public void setVoor(PersoonRelatieType value) {
        this.voor = value;
    }

}
