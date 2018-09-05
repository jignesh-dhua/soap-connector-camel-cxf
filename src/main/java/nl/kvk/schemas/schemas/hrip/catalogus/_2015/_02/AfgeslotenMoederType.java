
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AfgeslotenMoederType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AfgeslotenMoederType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonType">
 *       &lt;sequence>
 *         &lt;element name="kvkNummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KvKNummerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AfgeslotenMoederType", propOrder = {
    "kvkNummer"
})
public class AfgeslotenMoederType
    extends NietNatuurlijkPersoonType
{

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
