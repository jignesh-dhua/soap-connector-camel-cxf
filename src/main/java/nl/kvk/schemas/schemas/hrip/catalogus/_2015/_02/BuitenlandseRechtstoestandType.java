
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuitenlandseRechtstoestandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuitenlandseRechtstoestandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="beschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BuitenlandseRechtstoestandType", propOrder = {
    "beschrijving",
    "uitspraakAanvang",
    "uitspraakEinde"
})
public class BuitenlandseRechtstoestandType
    extends BasisType
{

    protected String beschrijving;
    protected RechterlijkeUitspraakType uitspraakAanvang;
    protected RechterlijkeUitspraakType uitspraakEinde;

    /**
     * Gets the value of the beschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschrijving() {
        return beschrijving;
    }

    /**
     * Sets the value of the beschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschrijving(String value) {
        this.beschrijving = value;
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
