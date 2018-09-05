
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KvKNummerRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KvKNummerRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ProductRequestType">
 *       &lt;sequence>
 *         &lt;element name="kvkNummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KvKNummerType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KvKNummerRequestType", propOrder = {
    "kvkNummer"
})
public class KvKNummerRequestType
    extends ProductRequestType
{

    @XmlElement(required = true)
    protected String kvkNummer;

    /**
     * Gets the value of the kvkNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvkNummer() {
        return kvkNummer;
    }

    /**
     * Sets the value of the kvkNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvkNummer(String value) {
        this.kvkNummer = value;
    }

}
