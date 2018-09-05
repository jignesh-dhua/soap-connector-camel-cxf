
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RechtspersoonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RechtspersoonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonType">
 *       &lt;sequence>
 *         &lt;element name="rechtsvorm" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="publiekrechtelijkeRechtsvorm" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="overigePrivaatrechtelijkeRechtsvorm" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="nieuwGemeldeRechtsvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zetelGegevensBuitenland" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechtspersoonGegevensBuitenlandType" minOccurs="0"/>
 *         &lt;element name="statutaireZetel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aanvangStatutaireZetel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumAkteOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="bedragKostenOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType" minOccurs="0"/>
 *         &lt;element name="datumEersteInschrijvingHandelsregister" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumAkteStatutenwijziging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumLaatsteStatutenwijziging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="rechtsbevoegdheidVereniging" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="ingangStatuten" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="beleggingsMijMetVeranderlijkKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="koninklijkErkend" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="stelselInrichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="structuur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="maatschappelijkKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/>
 *         &lt;element name="geplaatstKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/>
 *         &lt;element name="gestortKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}KapitaalType" minOccurs="0"/>
 *         &lt;element name="bezoekLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="postLocatie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="activiteiten" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ActiviteitenType" minOccurs="0"/>
 *         &lt;element name="communicatiegegevens" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommunicatiegegevensType" minOccurs="0"/>
 *         &lt;element name="voornemenTotOntbinding" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}VoornemenTotOntbindingType" minOccurs="0"/>
 *         &lt;element name="activiteitenGestaaktPer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechtspersoonType", propOrder = {
    "rechtsvorm",
    "publiekrechtelijkeRechtsvorm",
    "overigePrivaatrechtelijkeRechtsvorm",
    "nieuwGemeldeRechtsvorm",
    "zetelGegevensBuitenland",
    "statutaireZetel",
    "aanvangStatutaireZetel",
    "datumAkteOprichting",
    "datumOprichting",
    "bedragKostenOprichting",
    "datumEersteInschrijvingHandelsregister",
    "datumAkteStatutenwijziging",
    "datumLaatsteStatutenwijziging",
    "rechtsbevoegdheidVereniging",
    "ingangStatuten",
    "beleggingsMijMetVeranderlijkKapitaal",
    "koninklijkErkend",
    "stelselInrichting",
    "structuur",
    "maatschappelijkKapitaal",
    "geplaatstKapitaal",
    "gestortKapitaal",
    "bezoekLocatie",
    "postLocatie",
    "activiteiten",
    "communicatiegegevens",
    "voornemenTotOntbinding",
    "activiteitenGestaaktPer"
})
public class RechtspersoonType
    extends NietNatuurlijkPersoonType
{

    protected EnumeratieType rechtsvorm;
    protected EnumeratieType publiekrechtelijkeRechtsvorm;
    protected EnumeratieType overigePrivaatrechtelijkeRechtsvorm;
    protected String nieuwGemeldeRechtsvorm;
    protected RechtspersoonGegevensBuitenlandType zetelGegevensBuitenland;
    protected String statutaireZetel;
    protected String aanvangStatutaireZetel;
    protected String datumAkteOprichting;
    protected String datumOprichting;
    protected GeldType bedragKostenOprichting;
    protected String datumEersteInschrijvingHandelsregister;
    protected String datumAkteStatutenwijziging;
    protected String datumLaatsteStatutenwijziging;
    protected EnumeratieType rechtsbevoegdheidVereniging;
    protected String ingangStatuten;
    protected EnumeratieType beleggingsMijMetVeranderlijkKapitaal;
    protected EnumeratieType koninklijkErkend;
    protected EnumeratieType stelselInrichting;
    protected EnumeratieType structuur;
    protected KapitaalType maatschappelijkKapitaal;
    protected KapitaalType geplaatstKapitaal;
    protected KapitaalType gestortKapitaal;
    protected LocatieType bezoekLocatie;
    protected LocatieType postLocatie;
    protected ActiviteitenType activiteiten;
    protected CommunicatiegegevensType communicatiegegevens;
    protected VoornemenTotOntbindingType voornemenTotOntbinding;
    protected String activiteitenGestaaktPer;

    /**
     * Gets the value of the rechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRechtsvorm() {
        return rechtsvorm;
    }

    /**
     * Sets the value of the rechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRechtsvorm(EnumeratieType value) {
        this.rechtsvorm = value;
    }

    /**
     * Gets the value of the publiekrechtelijkeRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getPubliekrechtelijkeRechtsvorm() {
        return publiekrechtelijkeRechtsvorm;
    }

    /**
     * Sets the value of the publiekrechtelijkeRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setPubliekrechtelijkeRechtsvorm(EnumeratieType value) {
        this.publiekrechtelijkeRechtsvorm = value;
    }

    /**
     * Gets the value of the overigePrivaatrechtelijkeRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getOverigePrivaatrechtelijkeRechtsvorm() {
        return overigePrivaatrechtelijkeRechtsvorm;
    }

    /**
     * Sets the value of the overigePrivaatrechtelijkeRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setOverigePrivaatrechtelijkeRechtsvorm(EnumeratieType value) {
        this.overigePrivaatrechtelijkeRechtsvorm = value;
    }

    /**
     * Gets the value of the nieuwGemeldeRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNieuwGemeldeRechtsvorm() {
        return nieuwGemeldeRechtsvorm;
    }

    /**
     * Sets the value of the nieuwGemeldeRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNieuwGemeldeRechtsvorm(String value) {
        this.nieuwGemeldeRechtsvorm = value;
    }

    /**
     * Gets the value of the zetelGegevensBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link RechtspersoonGegevensBuitenlandType }
     *     
     */
    public RechtspersoonGegevensBuitenlandType getZetelGegevensBuitenland() {
        return zetelGegevensBuitenland;
    }

    /**
     * Sets the value of the zetelGegevensBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtspersoonGegevensBuitenlandType }
     *     
     */
    public void setZetelGegevensBuitenland(RechtspersoonGegevensBuitenlandType value) {
        this.zetelGegevensBuitenland = value;
    }

    /**
     * Gets the value of the statutaireZetel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatutaireZetel() {
        return statutaireZetel;
    }

    /**
     * Sets the value of the statutaireZetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatutaireZetel(String value) {
        this.statutaireZetel = value;
    }

    /**
     * Gets the value of the aanvangStatutaireZetel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAanvangStatutaireZetel() {
        return aanvangStatutaireZetel;
    }

    /**
     * Sets the value of the aanvangStatutaireZetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAanvangStatutaireZetel(String value) {
        this.aanvangStatutaireZetel = value;
    }

    /**
     * Gets the value of the datumAkteOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAkteOprichting() {
        return datumAkteOprichting;
    }

    /**
     * Sets the value of the datumAkteOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAkteOprichting(String value) {
        this.datumAkteOprichting = value;
    }

    /**
     * Gets the value of the datumOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumOprichting() {
        return datumOprichting;
    }

    /**
     * Sets the value of the datumOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumOprichting(String value) {
        this.datumOprichting = value;
    }

    /**
     * Gets the value of the bedragKostenOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getBedragKostenOprichting() {
        return bedragKostenOprichting;
    }

    /**
     * Sets the value of the bedragKostenOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setBedragKostenOprichting(GeldType value) {
        this.bedragKostenOprichting = value;
    }

    /**
     * Gets the value of the datumEersteInschrijvingHandelsregister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumEersteInschrijvingHandelsregister() {
        return datumEersteInschrijvingHandelsregister;
    }

    /**
     * Sets the value of the datumEersteInschrijvingHandelsregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumEersteInschrijvingHandelsregister(String value) {
        this.datumEersteInschrijvingHandelsregister = value;
    }

    /**
     * Gets the value of the datumAkteStatutenwijziging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAkteStatutenwijziging() {
        return datumAkteStatutenwijziging;
    }

    /**
     * Sets the value of the datumAkteStatutenwijziging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAkteStatutenwijziging(String value) {
        this.datumAkteStatutenwijziging = value;
    }

    /**
     * Gets the value of the datumLaatsteStatutenwijziging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumLaatsteStatutenwijziging() {
        return datumLaatsteStatutenwijziging;
    }

    /**
     * Sets the value of the datumLaatsteStatutenwijziging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumLaatsteStatutenwijziging(String value) {
        this.datumLaatsteStatutenwijziging = value;
    }

    /**
     * Gets the value of the rechtsbevoegdheidVereniging property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRechtsbevoegdheidVereniging() {
        return rechtsbevoegdheidVereniging;
    }

    /**
     * Sets the value of the rechtsbevoegdheidVereniging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRechtsbevoegdheidVereniging(EnumeratieType value) {
        this.rechtsbevoegdheidVereniging = value;
    }

    /**
     * Gets the value of the ingangStatuten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngangStatuten() {
        return ingangStatuten;
    }

    /**
     * Sets the value of the ingangStatuten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngangStatuten(String value) {
        this.ingangStatuten = value;
    }

    /**
     * Gets the value of the beleggingsMijMetVeranderlijkKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getBeleggingsMijMetVeranderlijkKapitaal() {
        return beleggingsMijMetVeranderlijkKapitaal;
    }

    /**
     * Sets the value of the beleggingsMijMetVeranderlijkKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setBeleggingsMijMetVeranderlijkKapitaal(EnumeratieType value) {
        this.beleggingsMijMetVeranderlijkKapitaal = value;
    }

    /**
     * Gets the value of the koninklijkErkend property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getKoninklijkErkend() {
        return koninklijkErkend;
    }

    /**
     * Sets the value of the koninklijkErkend property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setKoninklijkErkend(EnumeratieType value) {
        this.koninklijkErkend = value;
    }

    /**
     * Gets the value of the stelselInrichting property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getStelselInrichting() {
        return stelselInrichting;
    }

    /**
     * Sets the value of the stelselInrichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setStelselInrichting(EnumeratieType value) {
        this.stelselInrichting = value;
    }

    /**
     * Gets the value of the structuur property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getStructuur() {
        return structuur;
    }

    /**
     * Sets the value of the structuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setStructuur(EnumeratieType value) {
        this.structuur = value;
    }

    /**
     * Gets the value of the maatschappelijkKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getMaatschappelijkKapitaal() {
        return maatschappelijkKapitaal;
    }

    /**
     * Sets the value of the maatschappelijkKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setMaatschappelijkKapitaal(KapitaalType value) {
        this.maatschappelijkKapitaal = value;
    }

    /**
     * Gets the value of the geplaatstKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getGeplaatstKapitaal() {
        return geplaatstKapitaal;
    }

    /**
     * Sets the value of the geplaatstKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setGeplaatstKapitaal(KapitaalType value) {
        this.geplaatstKapitaal = value;
    }

    /**
     * Gets the value of the gestortKapitaal property.
     * 
     * @return
     *     possible object is
     *     {@link KapitaalType }
     *     
     */
    public KapitaalType getGestortKapitaal() {
        return gestortKapitaal;
    }

    /**
     * Sets the value of the gestortKapitaal property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapitaalType }
     *     
     */
    public void setGestortKapitaal(KapitaalType value) {
        this.gestortKapitaal = value;
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
     * Gets the value of the activiteiten property.
     * 
     * @return
     *     possible object is
     *     {@link ActiviteitenType }
     *     
     */
    public ActiviteitenType getActiviteiten() {
        return activiteiten;
    }

    /**
     * Sets the value of the activiteiten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiviteitenType }
     *     
     */
    public void setActiviteiten(ActiviteitenType value) {
        this.activiteiten = value;
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
     * Gets the value of the voornemenTotOntbinding property.
     * 
     * @return
     *     possible object is
     *     {@link VoornemenTotOntbindingType }
     *     
     */
    public VoornemenTotOntbindingType getVoornemenTotOntbinding() {
        return voornemenTotOntbinding;
    }

    /**
     * Sets the value of the voornemenTotOntbinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoornemenTotOntbindingType }
     *     
     */
    public void setVoornemenTotOntbinding(VoornemenTotOntbindingType value) {
        this.voornemenTotOntbinding = value;
    }

    /**
     * Gets the value of the activiteitenGestaaktPer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiviteitenGestaaktPer() {
        return activiteitenGestaaktPer;
    }

    /**
     * Sets the value of the activiteitenGestaaktPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiviteitenGestaaktPer(String value) {
        this.activiteitenGestaaktPer = value;
    }

}
