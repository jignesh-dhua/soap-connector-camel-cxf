
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringenType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="deponering" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringenType", propOrder = {
    "deponering"
})
public class DeponeringenType
    extends MetExtraElementenMogenlijkheidType
{

    protected List<DeponeringRelatieType> deponering;

    /**
     * Gets the value of the deponering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deponering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeponering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeponeringRelatieType }
     * 
     * 
     */
    public List<DeponeringRelatieType> getDeponering() {
        if (deponering == null) {
            deponering = new ArrayList<DeponeringRelatieType>();
        }
        return this.deponering;
    }

}
