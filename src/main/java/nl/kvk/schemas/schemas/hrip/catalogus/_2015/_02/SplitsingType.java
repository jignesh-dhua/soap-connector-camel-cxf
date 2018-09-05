
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SplitsingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitsingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FusieSplitsingType">
 *       &lt;sequence>
 *         &lt;element name="opTeRichtenSplitsendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OpTeRichtenRechtspersoonType" minOccurs="0"/>
 *         &lt;element name="splitsendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" minOccurs="0"/>
 *         &lt;element name="verkrijgendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zuivereSplitsing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitsingType", propOrder = {
    "opTeRichtenSplitsendeRechtspersoon",
    "splitsendeRechtspersoon",
    "verkrijgendeRechtspersoon",
    "zuivereSplitsing"
})
public class SplitsingType
    extends FusieSplitsingType
{

    protected OpTeRichtenRechtspersoonType opTeRichtenSplitsendeRechtspersoon;
    protected NietNatuurlijkPersoonRelatieType splitsendeRechtspersoon;
    protected List<NietNatuurlijkPersoonRelatieType> verkrijgendeRechtspersoon;
    protected EnumeratieType zuivereSplitsing;

    /**
     * Gets the value of the opTeRichtenSplitsendeRechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link OpTeRichtenRechtspersoonType }
     *     
     */
    public OpTeRichtenRechtspersoonType getOpTeRichtenSplitsendeRechtspersoon() {
        return opTeRichtenSplitsendeRechtspersoon;
    }

    /**
     * Sets the value of the opTeRichtenSplitsendeRechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpTeRichtenRechtspersoonType }
     *     
     */
    public void setOpTeRichtenSplitsendeRechtspersoon(OpTeRichtenRechtspersoonType value) {
        this.opTeRichtenSplitsendeRechtspersoon = value;
    }

    /**
     * Gets the value of the splitsendeRechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public NietNatuurlijkPersoonRelatieType getSplitsendeRechtspersoon() {
        return splitsendeRechtspersoon;
    }

    /**
     * Sets the value of the splitsendeRechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setSplitsendeRechtspersoon(NietNatuurlijkPersoonRelatieType value) {
        this.splitsendeRechtspersoon = value;
    }

    /**
     * Gets the value of the verkrijgendeRechtspersoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verkrijgendeRechtspersoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerkrijgendeRechtspersoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NietNatuurlijkPersoonRelatieType }
     * 
     * 
     */
    public List<NietNatuurlijkPersoonRelatieType> getVerkrijgendeRechtspersoon() {
        if (verkrijgendeRechtspersoon == null) {
            verkrijgendeRechtspersoon = new ArrayList<NietNatuurlijkPersoonRelatieType>();
        }
        return this.verkrijgendeRechtspersoon;
    }

    /**
     * Gets the value of the zuivereSplitsing property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getZuivereSplitsing() {
        return zuivereSplitsing;
    }

    /**
     * Sets the value of the zuivereSplitsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setZuivereSplitsing(EnumeratieType value) {
        this.zuivereSplitsing = value;
    }

}
