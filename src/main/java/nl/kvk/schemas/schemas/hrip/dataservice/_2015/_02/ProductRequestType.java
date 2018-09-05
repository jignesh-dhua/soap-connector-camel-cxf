
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="klantreferentie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Tekst50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductRequestType", propOrder = {
    "klantreferentie"
})
@XmlSeeAlso({
    KvKNummerOfRSINummerRequestType.class,
    VestigingOfRsinOfKvKNummerRequestType.class,
    VestigingsnummerRequestType.class,
    KvKNummerRequestType.class
})
public class ProductRequestType {

    @XmlElement(required = true)
    protected String klantreferentie;

    /**
     * Gets the value of the klantreferentie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlantreferentie() {
        return klantreferentie;
    }

    /**
     * Sets the value of the klantreferentie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlantreferentie(String value) {
        this.klantreferentie = value;
    }

}
