
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringJaarstukOntheffingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringJaarstukOntheffingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukType">
 *       &lt;sequence>
 *         &lt;element name="reden" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="groepsjaarrekeninghouder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringNietNatuurlijkPersoonRelatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringJaarstukOntheffingType", propOrder = {
    "reden",
    "groepsjaarrekeninghouder"
})
public class DeponeringJaarstukOntheffingType
    extends DeponeringJaarstukType
{

    protected EnumeratieType reden;
    protected DeponeringNietNatuurlijkPersoonRelatieType groepsjaarrekeninghouder;

    /**
     * Gets the value of the reden property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getReden() {
        return reden;
    }

    /**
     * Sets the value of the reden property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setReden(EnumeratieType value) {
        this.reden = value;
    }

    /**
     * Gets the value of the groepsjaarrekeninghouder property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public DeponeringNietNatuurlijkPersoonRelatieType getGroepsjaarrekeninghouder() {
        return groepsjaarrekeninghouder;
    }

    /**
     * Sets the value of the groepsjaarrekeninghouder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setGroepsjaarrekeninghouder(DeponeringNietNatuurlijkPersoonRelatieType value) {
        this.groepsjaarrekeninghouder = value;
    }

}
