
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiviteitenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiviteitenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbiActiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SBIActiviteitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiviteitenType", propOrder = {
    "omschrijving",
    "sbiActiviteit"
})
@XmlSeeAlso({
    ActiviteitenCommercieleVestigingType.class
})
public class ActiviteitenType
    extends MetExtraElementenMogenlijkheidType
{

    protected String omschrijving;
    protected List<SBIActiviteitType> sbiActiviteit;

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

    /**
     * Gets the value of the sbiActiviteit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sbiActiviteit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSbiActiviteit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SBIActiviteitType }
     * 
     * 
     */
    public List<SBIActiviteitType> getSbiActiviteit() {
        if (sbiActiviteit == null) {
            sbiActiviteit = new ArrayList<SBIActiviteitType>();
        }
        return this.sbiActiviteit;
    }

}
