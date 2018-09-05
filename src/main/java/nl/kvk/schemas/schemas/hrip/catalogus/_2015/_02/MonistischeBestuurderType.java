
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonistischeBestuurderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonistischeBestuurderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="registratie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RegistratieType" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonistischeBestuurderType", propOrder = {
    "registratie",
    "rol"
})
public class MonistischeBestuurderType
    extends MetExtraElementenMogenlijkheidType
{

    protected RegistratieType registratie;
    protected EnumeratieType rol;

    /**
     * Gets the value of the registratie property.
     * 
     * @return
     *     possible object is
     *     {@link RegistratieType }
     *     
     */
    public RegistratieType getRegistratie() {
        return registratie;
    }

    /**
     * Sets the value of the registratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistratieType }
     *     
     */
    public void setRegistratie(RegistratieType value) {
        this.registratie = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRol(EnumeratieType value) {
        this.rol = value;
    }

}
