
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicatiegegevensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicatiegegevensType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="communicatienummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommunicatienummerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailAdres" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="domeinNaam" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicatiegegevensType", propOrder = {
    "communicatienummer",
    "emailAdres",
    "domeinNaam"
})
public class CommunicatiegegevensType
    extends BasisType
{

    protected List<CommunicatienummerType> communicatienummer;
    protected List<String> emailAdres;
    protected List<String> domeinNaam;

    /**
     * Gets the value of the communicatienummer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicatienummer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicatienummer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicatienummerType }
     * 
     * 
     */
    public List<CommunicatienummerType> getCommunicatienummer() {
        if (communicatienummer == null) {
            communicatienummer = new ArrayList<CommunicatienummerType>();
        }
        return this.communicatienummer;
    }

    /**
     * Gets the value of the emailAdres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAdres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAdres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmailAdres() {
        if (emailAdres == null) {
            emailAdres = new ArrayList<String>();
        }
        return this.emailAdres;
    }

    /**
     * Gets the value of the domeinNaam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domeinNaam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomeinNaam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomeinNaam() {
        if (domeinNaam == null) {
            domeinNaam = new ArrayList<String>();
        }
        return this.domeinNaam;
    }

}
