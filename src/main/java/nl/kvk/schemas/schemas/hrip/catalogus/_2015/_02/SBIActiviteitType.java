
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SBIActiviteitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBIActiviteitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="sbiCode" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="isHoofdactiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="volgorde" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBIActiviteitType", propOrder = {
    "sbiCode",
    "isHoofdactiviteit",
    "volgorde"
})
public class SBIActiviteitType
    extends BasisType
{

    protected EnumeratieType sbiCode;
    protected EnumeratieType isHoofdactiviteit;
    protected BigInteger volgorde;

    /**
     * Gets the value of the sbiCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSbiCode() {
        return sbiCode;
    }

    /**
     * Sets the value of the sbiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSbiCode(EnumeratieType value) {
        this.sbiCode = value;
    }

    /**
     * Gets the value of the isHoofdactiviteit property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIsHoofdactiviteit() {
        return isHoofdactiviteit;
    }

    /**
     * Sets the value of the isHoofdactiviteit property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIsHoofdactiviteit(EnumeratieType value) {
        this.isHoofdactiviteit = value;
    }

    /**
     * Gets the value of the volgorde property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolgorde() {
        return volgorde;
    }

    /**
     * Sets the value of the volgorde property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolgorde(BigInteger value) {
        this.volgorde = value;
    }

}
