
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VestigingenRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingenRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="commercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommercieleVestigingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nietCommercieleVestiging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietCommercieleVestigingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VestigingenRelatieRegistratieType", propOrder = {
    "commercieleVestiging",
    "nietCommercieleVestiging"
})
public class VestigingenRelatieRegistratieType
    extends RelatieRegistratieType
{

    protected List<CommercieleVestigingType> commercieleVestiging;
    protected List<NietCommercieleVestigingType> nietCommercieleVestiging;

    /**
     * Gets the value of the commercieleVestiging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercieleVestiging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercieleVestiging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercieleVestigingType }
     * 
     * 
     */
    public List<CommercieleVestigingType> getCommercieleVestiging() {
        if (commercieleVestiging == null) {
            commercieleVestiging = new ArrayList<CommercieleVestigingType>();
        }
        return this.commercieleVestiging;
    }

    /**
     * Gets the value of the nietCommercieleVestiging property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nietCommercieleVestiging property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNietCommercieleVestiging().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NietCommercieleVestigingType }
     * 
     * 
     */
    public List<NietCommercieleVestigingType> getNietCommercieleVestiging() {
        if (nietCommercieleVestiging == null) {
            nietCommercieleVestiging = new ArrayList<NietCommercieleVestigingType>();
        }
        return this.nietCommercieleVestiging;
    }

}
