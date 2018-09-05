
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HandelsnaamRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandelsnaamRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="handelsnaam" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandelsnaamType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandelsnaamRelatieRegistratieType", propOrder = {
    "handelsnaam"
})
public class HandelsnaamRelatieRegistratieType
    extends RelatieRegistratieType
{

    @XmlElement(required = true)
    protected HandelsnaamType handelsnaam;

    /**
     * Gets the value of the handelsnaam property.
     * 
     * @return
     *     possible object is
     *     {@link HandelsnaamType }
     *     
     */
    public HandelsnaamType getHandelsnaam() {
        return handelsnaam;
    }

    /**
     * Sets the value of the handelsnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandelsnaamType }
     *     
     */
    public void setHandelsnaam(HandelsnaamType value) {
        this.handelsnaam = value;
    }

}
