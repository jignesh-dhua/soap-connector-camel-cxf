
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringJaarstukType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringJaarstukType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringType">
 *       &lt;sequence>
 *         &lt;element name="boekjaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}JaarType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringJaarstukType", propOrder = {
    "boekjaar"
})
@XmlSeeAlso({
    DeponeringOverigJaarstukType.class,
    DeponeringJaarstukJaarrekeningType.class,
    DeponeringJaarstukHalfjaarKwartaalcijfersType.class,
    DeponeringJaarstukJaarrekeningOngewijzigdVastgesteldType.class,
    DeponeringJaarstukOntheffingType.class,
    DeponeringJaarstukInstemmingType.class
})
public abstract class DeponeringJaarstukType
    extends DeponeringType
{

    protected String boekjaar;

    /**
     * Gets the value of the boekjaar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoekjaar() {
        return boekjaar;
    }

    /**
     * Sets the value of the boekjaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoekjaar(String value) {
        this.boekjaar = value;
    }

}
