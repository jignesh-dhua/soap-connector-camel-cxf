
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringJaarstukInstemmingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringJaarstukInstemmingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringJaarstukType">
 *       &lt;sequence>
 *         &lt;element name="groepsjaarrekeningHouder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringNietNatuurlijkPersoonRelatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringJaarstukInstemmingType", propOrder = {
    "groepsjaarrekeningHouder"
})
public class DeponeringJaarstukInstemmingType
    extends DeponeringJaarstukType
{

    protected DeponeringNietNatuurlijkPersoonRelatieType groepsjaarrekeningHouder;

    /**
     * Gets the value of the groepsjaarrekeningHouder property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public DeponeringNietNatuurlijkPersoonRelatieType getGroepsjaarrekeningHouder() {
        return groepsjaarrekeningHouder;
    }

    /**
     * Sets the value of the groepsjaarrekeningHouder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setGroepsjaarrekeningHouder(DeponeringNietNatuurlijkPersoonRelatieType value) {
        this.groepsjaarrekeningHouder = value;
    }

}
