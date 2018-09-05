
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolmachtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolmachtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="typeVolmacht" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="isStatutair" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="beperkteVolmacht" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BeperkteVolmachtType" minOccurs="0"/>
 *         &lt;element name="heeftBetrekkingOp" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingenRelatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolmachtType", propOrder = {
    "typeVolmacht",
    "isStatutair",
    "beperkteVolmacht",
    "heeftBetrekkingOp"
})
public class VolmachtType
    extends BasisType
{

    @XmlElement(required = true)
    protected EnumeratieType typeVolmacht;
    protected EnumeratieType isStatutair;
    protected BeperkteVolmachtType beperkteVolmacht;
    protected VestigingenRelatieType heeftBetrekkingOp;

    /**
     * Gets the value of the typeVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getTypeVolmacht() {
        return typeVolmacht;
    }

    /**
     * Sets the value of the typeVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setTypeVolmacht(EnumeratieType value) {
        this.typeVolmacht = value;
    }

    /**
     * Gets the value of the isStatutair property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIsStatutair() {
        return isStatutair;
    }

    /**
     * Sets the value of the isStatutair property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIsStatutair(EnumeratieType value) {
        this.isStatutair = value;
    }

    /**
     * Gets the value of the beperkteVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link BeperkteVolmachtType }
     *     
     */
    public BeperkteVolmachtType getBeperkteVolmacht() {
        return beperkteVolmacht;
    }

    /**
     * Sets the value of the beperkteVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeperkteVolmachtType }
     *     
     */
    public void setBeperkteVolmacht(BeperkteVolmachtType value) {
        this.beperkteVolmacht = value;
    }

    /**
     * Gets the value of the heeftBetrekkingOp property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingenRelatieType }
     *     
     */
    public VestigingenRelatieType getHeeftBetrekkingOp() {
        return heeftBetrekkingOp;
    }

    /**
     * Sets the value of the heeftBetrekkingOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingenRelatieType }
     *     
     */
    public void setHeeftBetrekkingOp(VestigingenRelatieType value) {
        this.heeftBetrekkingOp = value;
    }

}
