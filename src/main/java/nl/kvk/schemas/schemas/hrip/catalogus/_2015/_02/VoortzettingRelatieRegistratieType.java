
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoortzettingRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VoortzettingRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitRelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="datumVoortzetting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoortzettingRelatieRegistratieType", propOrder = {
    "datumVoortzetting"
})
public class VoortzettingRelatieRegistratieType
    extends MaatschappelijkeActiviteitRelatieRegistratieType
{

    protected String datumVoortzetting;

    /**
     * Gets the value of the datumVoortzetting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumVoortzetting() {
        return datumVoortzetting;
    }

    /**
     * Sets the value of the datumVoortzetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumVoortzetting(String value) {
        this.datumVoortzetting = value;
    }

}
