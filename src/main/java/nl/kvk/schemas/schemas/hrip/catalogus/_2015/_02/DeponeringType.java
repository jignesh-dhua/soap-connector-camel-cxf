
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="depotId" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DepotIdType"/>
 *         &lt;element name="soortDeponering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="datumDeponering" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="uitspraak" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType" minOccurs="0"/>
 *         &lt;element name="gaatOver" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" minOccurs="0"/>
 *         &lt;element name="gedeponeerdBij" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringNietNatuurlijkPersoonRelatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringType", propOrder = {
    "depotId",
    "soortDeponering",
    "status",
    "datumDeponering",
    "uitspraak",
    "gaatOver",
    "gedeponeerdBij"
})
@XmlSeeAlso({
    DeponeringAanvullendeMededelingType.class,
    DeponeringAansprakelijkheidOverblijvendType.class,
    DeponeringAansprakelijkheidIntrekkingType.class,
    DeponeringBijzondereDeponeringType.class,
    DeponeringAansprakelijkheidVerklaringType.class,
    DeponeringJaarstukType.class
})
public abstract class DeponeringType
    extends MetExtraElementenMogenlijkheidType
{

    @XmlElement(required = true)
    protected String depotId;
    protected String soortDeponering;
    protected EnumeratieType status;
    protected String datumDeponering;
    protected RechterlijkeUitspraakType uitspraak;
    protected DeponeringRelatieType gaatOver;
    protected DeponeringNietNatuurlijkPersoonRelatieType gedeponeerdBij;

    /**
     * Gets the value of the depotId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepotId() {
        return depotId;
    }

    /**
     * Sets the value of the depotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepotId(String value) {
        this.depotId = value;
    }

    /**
     * Gets the value of the soortDeponering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoortDeponering() {
        return soortDeponering;
    }

    /**
     * Sets the value of the soortDeponering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoortDeponering(String value) {
        this.soortDeponering = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setStatus(EnumeratieType value) {
        this.status = value;
    }

    /**
     * Gets the value of the datumDeponering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumDeponering() {
        return datumDeponering;
    }

    /**
     * Sets the value of the datumDeponering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumDeponering(String value) {
        this.datumDeponering = value;
    }

    /**
     * Gets the value of the uitspraak property.
     * 
     * @return
     *     possible object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public RechterlijkeUitspraakType getUitspraak() {
        return uitspraak;
    }

    /**
     * Sets the value of the uitspraak property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechterlijkeUitspraakType }
     *     
     */
    public void setUitspraak(RechterlijkeUitspraakType value) {
        this.uitspraak = value;
    }

    /**
     * Gets the value of the gaatOver property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public DeponeringRelatieType getGaatOver() {
        return gaatOver;
    }

    /**
     * Sets the value of the gaatOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public void setGaatOver(DeponeringRelatieType value) {
        this.gaatOver = value;
    }

    /**
     * Gets the value of the gedeponeerdBij property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public DeponeringNietNatuurlijkPersoonRelatieType getGedeponeerdBij() {
        return gedeponeerdBij;
    }

    /**
     * Sets the value of the gedeponeerdBij property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringNietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setGedeponeerdBij(DeponeringNietNatuurlijkPersoonRelatieType value) {
        this.gedeponeerdBij = value;
    }

}
