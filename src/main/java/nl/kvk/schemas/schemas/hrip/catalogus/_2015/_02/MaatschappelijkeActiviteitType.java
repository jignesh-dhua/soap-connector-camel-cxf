
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaatschappelijkeActiviteitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaatschappelijkeActiviteitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="kvkNummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KvKNummerType"/>
 *         &lt;element name="nonMailing" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="pensioenvennootschap" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="sbiActiviteit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SBIActiviteitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="incidenteelUitlenenArbeidskrachten" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="bezoekLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="postLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="communicatiegegevens" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommunicatiegegevensType" minOccurs="0"/>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notitie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manifesteertZichAls" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OndernemingRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="wordtUitgeoefendIn" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietCommercieleVestigingRelatieRegistratieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wordtGeleidVanuit" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VestigingRelatieType" minOccurs="0"/>
 *         &lt;element name="heeftAlsEigenaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="hadAlsEigenaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieRegistratieType" minOccurs="0"/>
 *         &lt;element name="berichtenbox" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BerichtenboxType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaatschappelijkeActiviteitType", propOrder = {
    "kvkNummer",
    "nonMailing",
    "pensioenvennootschap",
    "sbiActiviteit",
    "incidenteelUitlenenArbeidskrachten",
    "bezoekLocatie",
    "postLocatie",
    "communicatiegegevens",
    "naam",
    "notitie",
    "manifesteertZichAls",
    "wordtUitgeoefendIn",
    "wordtGeleidVanuit",
    "heeftAlsEigenaar",
    "hadAlsEigenaar",
    "berichtenbox"
})
public class MaatschappelijkeActiviteitType
    extends BasisType
{

    @XmlElement(required = true)
    protected String kvkNummer;
    protected EnumeratieType nonMailing;
    protected EnumeratieType pensioenvennootschap;
    protected List<SBIActiviteitType> sbiActiviteit;
    protected EnumeratieType incidenteelUitlenenArbeidskrachten;
    protected LocatieType bezoekLocatie;
    protected LocatieType postLocatie;
    protected CommunicatiegegevensType communicatiegegevens;
    protected String naam;
    protected String notitie;
    protected OndernemingRelatieRegistratieType manifesteertZichAls;
    protected List<NietCommercieleVestigingRelatieRegistratieType> wordtUitgeoefendIn;
    protected VestigingRelatieType wordtGeleidVanuit;
    protected PersoonRelatieRegistratieType heeftAlsEigenaar;
    protected PersoonRelatieRegistratieType hadAlsEigenaar;
    protected BerichtenboxType berichtenbox;

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
     * Gets the value of the nonMailing property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getNonMailing() {
        return nonMailing;
    }

    /**
     * Sets the value of the nonMailing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setNonMailing(EnumeratieType value) {
        this.nonMailing = value;
    }

    /**
     * Gets the value of the pensioenvennootschap property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getPensioenvennootschap() {
        return pensioenvennootschap;
    }

    /**
     * Sets the value of the pensioenvennootschap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setPensioenvennootschap(EnumeratieType value) {
        this.pensioenvennootschap = value;
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
     * Gets the value of the incidenteelUitlenenArbeidskrachten property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getIncidenteelUitlenenArbeidskrachten() {
        return incidenteelUitlenenArbeidskrachten;
    }

    /**
     * Sets the value of the incidenteelUitlenenArbeidskrachten property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setIncidenteelUitlenenArbeidskrachten(EnumeratieType value) {
        this.incidenteelUitlenenArbeidskrachten = value;
    }

    /**
     * Gets the value of the bezoekLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getBezoekLocatie() {
        return bezoekLocatie;
    }

    /**
     * Sets the value of the bezoekLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setBezoekLocatie(LocatieType value) {
        this.bezoekLocatie = value;
    }

    /**
     * Gets the value of the postLocatie property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getPostLocatie() {
        return postLocatie;
    }

    /**
     * Sets the value of the postLocatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setPostLocatie(LocatieType value) {
        this.postLocatie = value;
    }

    /**
     * Gets the value of the communicatiegegevens property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicatiegegevensType }
     *     
     */
    public CommunicatiegegevensType getCommunicatiegegevens() {
        return communicatiegegevens;
    }

    /**
     * Sets the value of the communicatiegegevens property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicatiegegevensType }
     *     
     */
    public void setCommunicatiegegevens(CommunicatiegegevensType value) {
        this.communicatiegegevens = value;
    }

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the notitie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotitie() {
        return notitie;
    }

    /**
     * Sets the value of the notitie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotitie(String value) {
        this.notitie = value;
    }

    /**
     * Gets the value of the manifesteertZichAls property.
     * 
     * @return
     *     possible object is
     *     {@link OndernemingRelatieRegistratieType }
     *     
     */
    public OndernemingRelatieRegistratieType getManifesteertZichAls() {
        return manifesteertZichAls;
    }

    /**
     * Sets the value of the manifesteertZichAls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OndernemingRelatieRegistratieType }
     *     
     */
    public void setManifesteertZichAls(OndernemingRelatieRegistratieType value) {
        this.manifesteertZichAls = value;
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
     * {@link NietCommercieleVestigingRelatieRegistratieType }
     * 
     * 
     */
    public List<NietCommercieleVestigingRelatieRegistratieType> getWordtUitgeoefendIn() {
        if (wordtUitgeoefendIn == null) {
            wordtUitgeoefendIn = new ArrayList<NietCommercieleVestigingRelatieRegistratieType>();
        }
        return this.wordtUitgeoefendIn;
    }

    /**
     * Gets the value of the wordtGeleidVanuit property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingRelatieType }
     *     
     */
    public VestigingRelatieType getWordtGeleidVanuit() {
        return wordtGeleidVanuit;
    }

    /**
     * Sets the value of the wordtGeleidVanuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingRelatieType }
     *     
     */
    public void setWordtGeleidVanuit(VestigingRelatieType value) {
        this.wordtGeleidVanuit = value;
    }

    /**
     * Gets the value of the heeftAlsEigenaar property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieRegistratieType }
     *     
     */
    public PersoonRelatieRegistratieType getHeeftAlsEigenaar() {
        return heeftAlsEigenaar;
    }

    /**
     * Sets the value of the heeftAlsEigenaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieRegistratieType }
     *     
     */
    public void setHeeftAlsEigenaar(PersoonRelatieRegistratieType value) {
        this.heeftAlsEigenaar = value;
    }

    /**
     * Gets the value of the hadAlsEigenaar property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieRegistratieType }
     *     
     */
    public PersoonRelatieRegistratieType getHadAlsEigenaar() {
        return hadAlsEigenaar;
    }

    /**
     * Sets the value of the hadAlsEigenaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieRegistratieType }
     *     
     */
    public void setHadAlsEigenaar(PersoonRelatieRegistratieType value) {
        this.hadAlsEigenaar = value;
    }

    /**
     * Gets the value of the berichtenbox property.
     * 
     * @return
     *     possible object is
     *     {@link BerichtenboxType }
     *     
     */
    public BerichtenboxType getBerichtenbox() {
        return berichtenbox;
    }

    /**
     * Sets the value of the berichtenbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link BerichtenboxType }
     *     
     */
    public void setBerichtenbox(BerichtenboxType value) {
        this.berichtenbox = value;
    }

}
