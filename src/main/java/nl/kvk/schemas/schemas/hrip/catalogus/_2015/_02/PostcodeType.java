
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostcodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cijfercombinatie">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lettercombinatie" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostcodeType", propOrder = {
    "cijfercombinatie",
    "lettercombinatie"
})
public class PostcodeType {

    @XmlElement(required = true)
    protected String cijfercombinatie;
    protected String lettercombinatie;

    /**
     * Gets the value of the cijfercombinatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCijfercombinatie() {
        return cijfercombinatie;
    }

    /**
     * Sets the value of the cijfercombinatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCijfercombinatie(String value) {
        this.cijfercombinatie = value;
    }

    /**
     * Gets the value of the lettercombinatie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLettercombinatie() {
        return lettercombinatie;
    }

    /**
     * Sets the value of the lettercombinatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLettercombinatie(String value) {
        this.lettercombinatie = value;
    }

}
