
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;sequence>
 *         &lt;element name="relatieRegistratie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RegistratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatieRegistratieType", propOrder = {
    "relatieRegistratie"
})
@XmlSeeAlso({
    VestigingenRelatieRegistratieType.class,
    AansprakelijkheidRelatieRegistratieType.class,
    NietCommercieleVestigingRelatieRegistratieType.class,
    HandelsnaamRelatieRegistratieType.class,
    MaatschappelijkeActiviteitRelatieRegistratieType.class,
    CommercieleVestigingRelatieRegistratieType.class,
    OndernemingRelatieRegistratieType.class,
    PersoonRelatieRegistratieType.class
})
public abstract class RelatieRegistratieType
    extends RelatieType
{

    protected RegistratieType relatieRegistratie;

    /**
     * Gets the value of the relatieRegistratie property.
     * 
     * @return
     *     possible object is
     *     {@link RegistratieType }
     *     
     */
    public RegistratieType getRelatieRegistratie() {
        return relatieRegistratie;
    }

    /**
     * Sets the value of the relatieRegistratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistratieType }
     *     
     */
    public void setRelatieRegistratie(RegistratieType value) {
        this.relatieRegistratie = value;
    }

}
