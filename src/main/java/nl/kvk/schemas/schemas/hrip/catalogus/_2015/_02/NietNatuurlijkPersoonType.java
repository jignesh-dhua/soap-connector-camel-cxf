
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NietNatuurlijkPersoonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NietNatuurlijkPersoonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonType">
 *       &lt;sequence>
 *         &lt;element name="rsin" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RSINummerType" minOccurs="0"/>
 *         &lt;element name="naamgeving" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NaamgevingType" minOccurs="0"/>
 *         &lt;element name="datumUitschrijving" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="buitenlandseRechtstoestand" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandseRechtstoestandType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ontbinding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OntbindingType" minOccurs="0"/>
 *         &lt;element name="fusie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FusieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="splitsing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SplitsingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="heeftGedeponeerd" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDochterVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AansprakelijkheidRelatieRegistratieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deponeringen" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NietNatuurlijkPersoonType", propOrder = {
    "rsin",
    "naamgeving",
    "datumUitschrijving",
    "buitenlandseRechtstoestand",
    "ontbinding",
    "fusie",
    "splitsing",
    "heeftGedeponeerd",
    "isDochterVan",
    "deponeringen"
})
@XmlSeeAlso({
    BuitenlandseVennootschapType.class,
    EenmanszaakMetMeerdereEigenarenType.class,
    RechtspersoonType.class,
    RechtspersoonInOprichtingType.class,
    SamenwerkingsverbandType.class,
    AfgeslotenMoederType.class
})
public abstract class NietNatuurlijkPersoonType
    extends PersoonType
{

    protected String rsin;
    protected NaamgevingType naamgeving;
    protected String datumUitschrijving;
    protected List<BuitenlandseRechtstoestandType> buitenlandseRechtstoestand;
    protected OntbindingType ontbinding;
    protected List<FusieType> fusie;
    protected List<SplitsingType> splitsing;
    protected List<DeponeringRelatieType> heeftGedeponeerd;
    protected List<AansprakelijkheidRelatieRegistratieType> isDochterVan;
    protected DeponeringenType deponeringen;

    /**
     * Gets the value of the rsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsin() {
        return rsin;
    }

    /**
     * Sets the value of the rsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsin(String value) {
        this.rsin = value;
    }

    /**
     * Gets the value of the naamgeving property.
     * 
     * @return
     *     possible object is
     *     {@link NaamgevingType }
     *     
     */
    public NaamgevingType getNaamgeving() {
        return naamgeving;
    }

    /**
     * Sets the value of the naamgeving property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaamgevingType }
     *     
     */
    public void setNaamgeving(NaamgevingType value) {
        this.naamgeving = value;
    }

    /**
     * Gets the value of the datumUitschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumUitschrijving() {
        return datumUitschrijving;
    }

    /**
     * Sets the value of the datumUitschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumUitschrijving(String value) {
        this.datumUitschrijving = value;
    }

    /**
     * Gets the value of the buitenlandseRechtstoestand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buitenlandseRechtstoestand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuitenlandseRechtstoestand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuitenlandseRechtstoestandType }
     * 
     * 
     */
    public List<BuitenlandseRechtstoestandType> getBuitenlandseRechtstoestand() {
        if (buitenlandseRechtstoestand == null) {
            buitenlandseRechtstoestand = new ArrayList<BuitenlandseRechtstoestandType>();
        }
        return this.buitenlandseRechtstoestand;
    }

    /**
     * Gets the value of the ontbinding property.
     * 
     * @return
     *     possible object is
     *     {@link OntbindingType }
     *     
     */
    public OntbindingType getOntbinding() {
        return ontbinding;
    }

    /**
     * Sets the value of the ontbinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link OntbindingType }
     *     
     */
    public void setOntbinding(OntbindingType value) {
        this.ontbinding = value;
    }

    /**
     * Gets the value of the fusie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fusie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFusie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FusieType }
     * 
     * 
     */
    public List<FusieType> getFusie() {
        if (fusie == null) {
            fusie = new ArrayList<FusieType>();
        }
        return this.fusie;
    }

    /**
     * Gets the value of the splitsing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitsing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitsing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitsingType }
     * 
     * 
     */
    public List<SplitsingType> getSplitsing() {
        if (splitsing == null) {
            splitsing = new ArrayList<SplitsingType>();
        }
        return this.splitsing;
    }

    /**
     * Gets the value of the heeftGedeponeerd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heeftGedeponeerd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeeftGedeponeerd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeponeringRelatieType }
     * 
     * 
     */
    public List<DeponeringRelatieType> getHeeftGedeponeerd() {
        if (heeftGedeponeerd == null) {
            heeftGedeponeerd = new ArrayList<DeponeringRelatieType>();
        }
        return this.heeftGedeponeerd;
    }

    /**
     * Gets the value of the isDochterVan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDochterVan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDochterVan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AansprakelijkheidRelatieRegistratieType }
     * 
     * 
     */
    public List<AansprakelijkheidRelatieRegistratieType> getIsDochterVan() {
        if (isDochterVan == null) {
            isDochterVan = new ArrayList<AansprakelijkheidRelatieRegistratieType>();
        }
        return this.isDochterVan;
    }

    /**
     * Gets the value of the deponeringen property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringenType }
     *     
     */
    public DeponeringenType getDeponeringen() {
        return deponeringen;
    }

    /**
     * Sets the value of the deponeringen property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringenType }
     *     
     */
    public void setDeponeringen(DeponeringenType value) {
        this.deponeringen = value;
    }

}
