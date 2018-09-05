
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaatschappelijkeActiviteitRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaatschappelijkeActiviteitRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;sequence>
 *         &lt;element name="maatschappelijkeActiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaatschappelijkeActiviteitRelatieType", propOrder = {
    "maatschappelijkeActiviteit"
})
public class MaatschappelijkeActiviteitRelatieType
    extends RelatieType
{

    @XmlElement(required = true)
    protected MaatschappelijkeActiviteitType maatschappelijkeActiviteit;

    /**
     * Gets the value of the maatschappelijkeActiviteit property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitType }
     *     
     */
    public MaatschappelijkeActiviteitType getMaatschappelijkeActiviteit() {
        return maatschappelijkeActiviteit;
    }

    /**
     * Sets the value of the maatschappelijkeActiviteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitType }
     *     
     */
    public void setMaatschappelijkeActiviteit(MaatschappelijkeActiviteitType value) {
        this.maatschappelijkeActiviteit = value;
    }

}
