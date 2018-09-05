
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="toevoegingAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="afgeschermd" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="adres" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AdresBinnenOfBuitenlandsType" minOccurs="0"/>
 *         &lt;element name="volledigAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocatieType", propOrder = {
    "toevoegingAdres",
    "afgeschermd",
    "adres",
    "volledigAdres"
})
public class LocatieType
    extends BasisType
{

    protected String toevoegingAdres;
    protected EnumeratieType afgeschermd;
    protected AdresBinnenOfBuitenlandsType adres;
    protected String volledigAdres;

    /**
     * Gets the value of the toevoegingAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToevoegingAdres() {
        return toevoegingAdres;
    }

    /**
     * Sets the value of the toevoegingAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToevoegingAdres(String value) {
        this.toevoegingAdres = value;
    }

    /**
     * Gets the value of the afgeschermd property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAfgeschermd() {
        return afgeschermd;
    }

    /**
     * Sets the value of the afgeschermd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAfgeschermd(EnumeratieType value) {
        this.afgeschermd = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresBinnenOfBuitenlandsType }
     *     
     */
    public AdresBinnenOfBuitenlandsType getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresBinnenOfBuitenlandsType }
     *     
     */
    public void setAdres(AdresBinnenOfBuitenlandsType value) {
        this.adres = value;
    }

    /**
     * Gets the value of the volledigAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolledigAdres() {
        return volledigAdres;
    }

    /**
     * Sets the value of the volledigAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolledigAdres(String value) {
        this.volledigAdres = value;
    }

}
