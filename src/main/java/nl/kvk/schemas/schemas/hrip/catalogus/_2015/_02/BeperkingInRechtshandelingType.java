
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeperkingInRechtshandelingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeperkingInRechtshandelingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="uitspraakAanvang" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/>
 *           &lt;element name="uitspraakEinde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeperkingInRechtshandelingType", propOrder = {
    "soort",
    "uitspraakAanvang",
    "uitspraakEinde"
})
public class BeperkingInRechtshandelingType
    extends BasisType
{

    protected EnumeratieType soort;
    protected RechterlijkeUitspraakType uitspraakAanvang;
    protected RechterlijkeUitspraakType uitspraakEinde;

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSoort(EnumeratieType value) {
        this.soort = value;
    }

    /**
     * Gets the value of the uitspraakAanvang property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakAanvang() {
        return uitspraakAanvang;
    }

    /**
     * Sets the value of the uitspraakAanvang property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakAanvang(RechterlijkeUitspraakType value) {
        this.uitspraakAanvang = value;
    }

    /**
     * Gets the value of the uitspraakEinde property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraakEinde() {
        return uitspraakEinde;
    }

    /**
     * Sets the value of the uitspraakEinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraakEinde(RechterlijkeUitspraakType value) {
        this.uitspraakEinde = value;
    }

}
