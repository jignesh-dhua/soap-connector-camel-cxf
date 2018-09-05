
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificatieNummeraanduiding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Tekst16"/>
 *         &lt;element name="identificatieAdresseerbaarObject" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Tekst16"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagIdType", propOrder = {
    "identificatieNummeraanduiding",
    "identificatieAdresseerbaarObject"
})
public class BagIdType {

    @XmlElement(required = true)
    protected String identificatieNummeraanduiding;
    @XmlElement(required = true)
    protected String identificatieAdresseerbaarObject;

    /**
     * Gets the value of the identificatieNummeraanduiding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificatieNummeraanduiding() {
        return identificatieNummeraanduiding;
    }

    /**
     * Sets the value of the identificatieNummeraanduiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificatieNummeraanduiding(String value) {
        this.identificatieNummeraanduiding = value;
    }

    /**
     * Gets the value of the identificatieAdresseerbaarObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificatieAdresseerbaarObject() {
        return identificatieAdresseerbaarObject;
    }

    /**
     * Sets the value of the identificatieAdresseerbaarObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificatieAdresseerbaarObject(String value) {
        this.identificatieAdresseerbaarObject = value;
    }

}
