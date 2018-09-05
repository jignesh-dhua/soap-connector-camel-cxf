
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KapitaalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KapitaalType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="bedrag" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType" minOccurs="0"/>
 *         &lt;element name="aandeelSamenstelling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AandeelSamenstellingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KapitaalType", propOrder = {
    "bedrag",
    "aandeelSamenstelling"
})
public class KapitaalType
    extends BasisType
{

    protected GeldType bedrag;
    protected List<AandeelSamenstellingType> aandeelSamenstelling;

    /**
     * Gets the value of the bedrag property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getBedrag() {
        return bedrag;
    }

    /**
     * Sets the value of the bedrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setBedrag(GeldType value) {
        this.bedrag = value;
    }

    /**
     * Gets the value of the aandeelSamenstelling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aandeelSamenstelling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAandeelSamenstelling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AandeelSamenstellingType }
     * 
     * 
     */
    public List<AandeelSamenstellingType> getAandeelSamenstelling() {
        if (aandeelSamenstelling == null) {
            aandeelSamenstelling = new ArrayList<AandeelSamenstellingType>();
        }
        return this.aandeelSamenstelling;
    }

}
