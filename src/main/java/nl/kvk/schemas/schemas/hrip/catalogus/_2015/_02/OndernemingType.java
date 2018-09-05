
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OndernemingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OndernemingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="kvkNummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KvKNummerType" minOccurs="0"/>
 *         &lt;element name="sbiActiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SBIActiviteitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voltijdWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="deeltijdWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="totaalWerkzamePersonen" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="handeltOnder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}HandelsnaamRelatieRegistratieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wordtUitgeoefendIn" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommercieleVestigingRelatieRegistratieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isEenManifestatieVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitRelatieType" minOccurs="0"/>
 *         &lt;element name="isOvergenomenVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VoortzettingRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="isOvergedragenNaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VoortzettingRelatieRegistratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OndernemingType", propOrder = {
    "kvkNummer",
    "sbiActiviteit",
    "voltijdWerkzamePersonen",
    "deeltijdWerkzamePersonen",
    "totaalWerkzamePersonen",
    "handeltOnder",
    "wordtUitgeoefendIn",
    "isEenManifestatieVan",
    "isOvergenomenVan",
    "isOvergedragenNaar"
})
public class OndernemingType
    extends BasisType
{

    protected String kvkNummer;
    protected List<SBIActiviteitType> sbiActiviteit;
    protected BigInteger voltijdWerkzamePersonen;
    protected BigInteger deeltijdWerkzamePersonen;
    protected BigInteger totaalWerkzamePersonen;
    protected List<HandelsnaamRelatieRegistratieType> handeltOnder;
    protected List<CommercieleVestigingRelatieRegistratieType> wordtUitgeoefendIn;
    protected MaatschappelijkeActiviteitRelatieType isEenManifestatieVan;
    protected VoortzettingRelatieRegistratieType isOvergenomenVan;
    protected VoortzettingRelatieRegistratieType isOvergedragenNaar;

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
     * Gets the value of the wordtUitgeoefendIn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wordtUitgeoefendIn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWordtUitgeoefendIn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercieleVestigingRelatieRegistratieType }
     * 
     * 
     */
    public List<CommercieleVestigingRelatieRegistratieType> getWordtUitgeoefendIn() {
        if (wordtUitgeoefendIn == null) {
            wordtUitgeoefendIn = new ArrayList<CommercieleVestigingRelatieRegistratieType>();
        }
        return this.wordtUitgeoefendIn;
    }

    /**
     * Gets the value of the isEenManifestatieVan property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public MaatschappelijkeActiviteitRelatieType getIsEenManifestatieVan() {
        return isEenManifestatieVan;
    }

    /**
     * Sets the value of the isEenManifestatieVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public void setIsEenManifestatieVan(MaatschappelijkeActiviteitRelatieType value) {
        this.isEenManifestatieVan = value;
    }

    /**
     * Gets the value of the isOvergenomenVan property.
     * 
     * @return
     *     possible object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public VoortzettingRelatieRegistratieType getIsOvergenomenVan() {
        return isOvergenomenVan;
    }

    /**
     * Sets the value of the isOvergenomenVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public void setIsOvergenomenVan(VoortzettingRelatieRegistratieType value) {
        this.isOvergenomenVan = value;
    }

    /**
     * Gets the value of the isOvergedragenNaar property.
     * 
     * @return
     *     possible object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public VoortzettingRelatieRegistratieType getIsOvergedragenNaar() {
        return isOvergedragenNaar;
    }

    /**
     * Sets the value of the isOvergedragenNaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoortzettingRelatieRegistratieType }
     *     
     */
    public void setIsOvergedragenNaar(VoortzettingRelatieRegistratieType value) {
        this.isOvergedragenNaar = value;
    }

}
