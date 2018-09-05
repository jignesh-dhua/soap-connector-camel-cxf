
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeperkingInHandelingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeperkingInHandelingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="beperkingInGeld" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType" minOccurs="0"/>
 *         &lt;element name="soortHandeling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeperkingInHandelingType", propOrder = {
    "beperkingInGeld",
    "soortHandeling"
})
public class BeperkingInHandelingType
    extends MetExtraElementenMogenlijkheidType
{

    protected GeldType beperkingInGeld;
    protected EnumeratieType soortHandeling;

    /**
     * Gets the value of the beperkingInGeld property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getBeperkingInGeld() {
        return beperkingInGeld;
    }

    /**
     * Sets the value of the beperkingInGeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setBeperkingInGeld(GeldType value) {
        this.beperkingInGeld = value;
    }

    /**
     * Gets the value of the soortHandeling property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSoortHandeling() {
        return soortHandeling;
    }

    /**
     * Sets the value of the soortHandeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSoortHandeling(EnumeratieType value) {
        this.soortHandeling = value;
    }

}
