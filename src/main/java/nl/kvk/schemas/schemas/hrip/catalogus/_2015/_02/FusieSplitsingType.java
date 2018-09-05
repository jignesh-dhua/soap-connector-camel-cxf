
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FusieSplitsingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FusieSplitsingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="uitspraak" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechterlijkeUitspraakType" minOccurs="0"/>
 *         &lt;element name="datumAkte" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="rol" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="opTeRichtenVerkrijgendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OpTeRichtenRechtspersoonType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="toekennendeRechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FusieSplitsingType", propOrder = {
    "uitspraak",
    "datumAkte",
    "status",
    "rol",
    "opTeRichtenVerkrijgendeRechtspersoon",
    "toekennendeRechtspersoon"
})
@XmlSeeAlso({
    FusieType.class,
    SplitsingType.class
})
public abstract class FusieSplitsingType
    extends BasisType
{

    protected RechterlijkeUitspraakType uitspraak;
    protected String datumAkte;
    protected EnumeratieType status;
    protected EnumeratieType rol;
    protected List<OpTeRichtenRechtspersoonType> opTeRichtenVerkrijgendeRechtspersoon;
    protected List<NietNatuurlijkPersoonRelatieType> toekennendeRechtspersoon;

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
     * Gets the value of the datumAkte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumAkte() {
        return datumAkte;
    }

    /**
     * Sets the value of the datumAkte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumAkte(String value) {
        this.datumAkte = value;
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
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRol(EnumeratieType value) {
        this.rol = value;
    }

    /**
     * Gets the value of the opTeRichtenVerkrijgendeRechtspersoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opTeRichtenVerkrijgendeRechtspersoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpTeRichtenVerkrijgendeRechtspersoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpTeRichtenRechtspersoonType }
     * 
     * 
     */
    public List<OpTeRichtenRechtspersoonType> getOpTeRichtenVerkrijgendeRechtspersoon() {
        if (opTeRichtenVerkrijgendeRechtspersoon == null) {
            opTeRichtenVerkrijgendeRechtspersoon = new ArrayList<OpTeRichtenRechtspersoonType>();
        }
        return this.opTeRichtenVerkrijgendeRechtspersoon;
    }

    /**
     * Gets the value of the toekennendeRechtspersoon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toekennendeRechtspersoon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToekennendeRechtspersoon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NietNatuurlijkPersoonRelatieType }
     * 
     * 
     */
    public List<NietNatuurlijkPersoonRelatieType> getToekennendeRechtspersoon() {
        if (toekennendeRechtspersoon == null) {
            toekennendeRechtspersoon = new ArrayList<NietNatuurlijkPersoonRelatieType>();
        }
        return this.toekennendeRechtspersoon;
    }

}
