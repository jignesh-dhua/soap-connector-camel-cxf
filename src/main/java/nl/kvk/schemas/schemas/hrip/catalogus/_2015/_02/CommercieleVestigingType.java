
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercieleVestigingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercieleVestigingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingType">
 *       &lt;sequence>
 *         &lt;element name="voltijdWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deeltijdWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totaalWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="activiteiten" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ActiviteitenCommercieleVestigingType" minOccurs="0"/>
 *         &lt;element name="handeltOnder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandelsnaamRelatieRegistratieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isEenUitoefeningVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OndernemingRelatieRegistratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercieleVestigingType", propOrder = {
    "voltijdWerkzamePersonen",
    "deeltijdWerkzamePersonen",
    "totaalWerkzamePersonen",
    "activiteiten",
    "handeltOnder",
    "isEenUitoefeningVan"
})
public class CommercieleVestigingType
    extends VestigingType
{

    protected BigInteger voltijdWerkzamePersonen;
    protected BigInteger deeltijdWerkzamePersonen;
    protected BigInteger totaalWerkzamePersonen;
    protected ActiviteitenCommercieleVestigingType activiteiten;
    protected List<HandelsnaamRelatieRegistratieType> handeltOnder;
    protected OndernemingRelatieRegistratieType isEenUitoefeningVan;

    /**
     * Gets the value of the voltijdWerkzamePersonen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVoltijdWerkzamePersonen() {
        return voltijdWerkzamePersonen;
    }

    /**
     * Sets the value of the voltijdWerkzamePersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVoltijdWerkzamePersonen(BigInteger value) {
        this.voltijdWerkzamePersonen = value;
    }

    /**
     * Gets the value of the deeltijdWerkzamePersonen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeeltijdWerkzamePersonen() {
        return deeltijdWerkzamePersonen;
    }

    /**
     * Sets the value of the deeltijdWerkzamePersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeeltijdWerkzamePersonen(BigInteger value) {
        this.deeltijdWerkzamePersonen = value;
    }

    /**
     * Gets the value of the totaalWerkzamePersonen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotaalWerkzamePersonen() {
        return totaalWerkzamePersonen;
    }

    /**
     * Sets the value of the totaalWerkzamePersonen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotaalWerkzamePersonen(BigInteger value) {
        this.totaalWerkzamePersonen = value;
    }

    /**
     * Gets the value of the activiteiten property.
     * 
     * @return
     *     possible object is
     *     {@link ActiviteitenCommercieleVestigingType }
     *     
     */
    public ActiviteitenCommercieleVestigingType getActiviteiten() {
        return activiteiten;
    }

    /**
     * Sets the value of the activiteiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiviteitenCommercieleVestigingType }
     *     
     */
    public void setActiviteiten(ActiviteitenCommercieleVestigingType value) {
        this.activiteiten = value;
    }

    /**
     * Gets the value of the handeltOnder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handeltOnder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandeltOnder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandelsnaamRelatieRegistratieType }
     * 
     * 
     */
    public List<HandelsnaamRelatieRegistratieType> getHandeltOnder() {
        if (handeltOnder == null) {
            handeltOnder = new ArrayList<HandelsnaamRelatieRegistratieType>();
        }
        return this.handeltOnder;
    }

    /**
     * Gets the value of the isEenUitoefeningVan property.
     * 
     * @return
     *     possible object is
     *     {@link OndernemingRelatieRegistratieType }
     *     
     */
    public OndernemingRelatieRegistratieType getIsEenUitoefeningVan() {
        return isEenUitoefeningVan;
    }

    /**
     * Sets the value of the isEenUitoefeningVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link OndernemingRelatieRegistratieType }
     *     
     */
    public void setIsEenUitoefeningVan(OndernemingRelatieRegistratieType value) {
        this.isEenUitoefeningVan = value;
    }

}
