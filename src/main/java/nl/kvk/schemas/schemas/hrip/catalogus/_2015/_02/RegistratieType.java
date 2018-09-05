
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Generiek registratie type met voor elke type geledende registratie gegevens
 *             
 * 
 * <p>Java class for RegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistratieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datumAanvang" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumEinde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="soortMutatie" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registratieTijdstip" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}TijdstipType" />
 *       &lt;attribute name="registratieTijdstipNoValue" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NoValue" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistratieType", propOrder = {
    "datumAanvang",
    "datumEinde"
})
public class RegistratieType {

    protected String datumAanvang;
    protected String datumEinde;
    @XmlAttribute(name = "soortMutatie")
    protected String soortMutatie;
    @XmlAttribute(name = "registratieTijdstip")
    protected String registratieTijdstip;
    @XmlAttribute(name = "registratieTijdstipNoValue")
    protected NoValue registratieTijdstipNoValue;

    /**
     * Gets the value of the datumAanvang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAanvang() {
        return datumAanvang;
    }

    /**
     * Sets the value of the datumAanvang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAanvang(String value) {
        this.datumAanvang = value;
    }

    /**
     * Gets the value of the datumEinde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumEinde() {
        return datumEinde;
    }

    /**
     * Sets the value of the datumEinde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumEinde(String value) {
        this.datumEinde = value;
    }

    /**
     * Gets the value of the soortMutatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoortMutatie() {
        return soortMutatie;
    }

    /**
     * Sets the value of the soortMutatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoortMutatie(String value) {
        this.soortMutatie = value;
    }

    /**
     * Gets the value of the registratieTijdstip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistratieTijdstip() {
        return registratieTijdstip;
    }

    /**
     * Sets the value of the registratieTijdstip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistratieTijdstip(String value) {
        this.registratieTijdstip = value;
    }

    /**
     * Gets the value of the registratieTijdstipNoValue property.
     * 
     * @return
     *     possible object is
     *     {@link NoValue }
     *     
     */
    public NoValue getRegistratieTijdstipNoValue() {
        return registratieTijdstipNoValue;
    }

    /**
     * Sets the value of the registratieTijdstipNoValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoValue }
     *     
     */
    public void setRegistratieTijdstipNoValue(NoValue value) {
        this.registratieTijdstipNoValue = value;
    }

}
