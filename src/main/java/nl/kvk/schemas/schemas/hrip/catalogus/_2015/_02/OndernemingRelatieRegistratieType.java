
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OndernemingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OndernemingRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="onderneming" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OndernemingType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OndernemingRelatieRegistratieType", propOrder = {
    "onderneming"
})
public class OndernemingRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected OndernemingType onderneming;

    /**
     * Gets the value of the onderneming property.
     * 
     * @return
     *     possible object is
     *     {@link OndernemingType }
     *     
     */
    public OndernemingType getOnderneming() {
        return onderneming;
    }

    /**
     * Sets the value of the onderneming property.
     * 
     * @param value
     *     allowed object is
     *     {@link OndernemingType }
     *     
     */
    public void setOnderneming(OndernemingType value) {
        this.onderneming = value;
    }

}
