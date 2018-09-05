
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AansprakelijkheidRelatieRegistratieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AansprakelijkheidRelatieRegistratieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieRegistratieType">
 *       &lt;sequence>
 *         &lt;element name="moeder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" minOccurs="0"/>
 *         &lt;element name="datumIntrekking" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="verklaring" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" minOccurs="0"/>
 *         &lt;element name="intrekking" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" minOccurs="0"/>
 *         &lt;element name="overblijvende" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringRelatieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AansprakelijkheidRelatieRegistratieType", propOrder = {
    "moeder",
    "datumIntrekking",
    "verklaring",
    "intrekking",
    "overblijvende"
})
public class AansprakelijkheidRelatieRegistratieType
    extends RelatieRegistratieType
{

    protected NietNatuurlijkPersoonRelatieType moeder;
    protected String datumIntrekking;
    protected DeponeringRelatieType verklaring;
    protected DeponeringRelatieType intrekking;
    protected DeponeringRelatieType overblijvende;

    /**
     * Gets the value of the moeder property.
     * 
     * @return
     *     possible object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public NietNatuurlijkPersoonRelatieType getMoeder() {
        return moeder;
    }

    /**
     * Sets the value of the moeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link NietNatuurlijkPersoonRelatieType }
     *     
     */
    public void setMoeder(NietNatuurlijkPersoonRelatieType value) {
        this.moeder = value;
    }

    /**
     * Gets the value of the datumIntrekking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumIntrekking() {
        return datumIntrekking;
    }

    /**
     * Sets the value of the datumIntrekking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumIntrekking(String value) {
        this.datumIntrekking = value;
    }

    /**
     * Gets the value of the verklaring property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public DeponeringRelatieType getVerklaring() {
        return verklaring;
    }

    /**
     * Sets the value of the verklaring property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public void setVerklaring(DeponeringRelatieType value) {
        this.verklaring = value;
    }

    /**
     * Gets the value of the intrekking property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public DeponeringRelatieType getIntrekking() {
        return intrekking;
    }

    /**
     * Sets the value of the intrekking property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public void setIntrekking(DeponeringRelatieType value) {
        this.intrekking = value;
    }

    /**
     * Gets the value of the overblijvende property.
     * 
     * @return
     *     possible object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public DeponeringRelatieType getOverblijvende() {
        return overblijvende;
    }

    /**
     * Sets the value of the overblijvende property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeponeringRelatieType }
     *     
     */
    public void setOverblijvende(DeponeringRelatieType value) {
        this.overblijvende = value;
    }

}
