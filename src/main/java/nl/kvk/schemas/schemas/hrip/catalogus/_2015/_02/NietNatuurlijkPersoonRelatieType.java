
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NietNatuurlijkPersoonRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NietNatuurlijkPersoonRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;choice>
 *         &lt;element name="buitenlandseVennootschap" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandseVennootschapType"/>
 *         &lt;element name="eenmanszaakMetMeerdereEigenaren" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EenmanszaakMetMeerdereEigenarenType"/>
 *         &lt;element name="rechtspersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechtspersoonType"/>
 *         &lt;element name="rechtspersoonInOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RechtspersoonInOprichtingType"/>
 *         &lt;element name="samenwerkingsverband" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}SamenwerkingsverbandType"/>
 *         &lt;element name="afgeslotenMoeder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AfgeslotenMoederType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NietNatuurlijkPersoonRelatieType", propOrder = {
    "buitenlandseVennootschap",
    "eenmanszaakMetMeerdereEigenaren",
    "rechtspersoon",
    "rechtspersoonInOprichting",
    "samenwerkingsverband",
    "afgeslotenMoeder"
})
public class NietNatuurlijkPersoonRelatieType
    extends RelatieType
{

    protected BuitenlandseVennootschapType buitenlandseVennootschap;
    protected EenmanszaakMetMeerdereEigenarenType eenmanszaakMetMeerdereEigenaren;
    protected RechtspersoonType rechtspersoon;
    protected RechtspersoonInOprichtingType rechtspersoonInOprichting;
    protected SamenwerkingsverbandType samenwerkingsverband;
    protected AfgeslotenMoederType afgeslotenMoeder;

    /**
     * Gets the value of the buitenlandseVennootschap property.
     * 
     * @return
     *     possible object is
     *     {@link BuitenlandseVennootschapType }
     *     
     */
    public BuitenlandseVennootschapType getBuitenlandseVennootschap() {
        return buitenlandseVennootschap;
    }

    /**
     * Sets the value of the buitenlandseVennootschap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuitenlandseVennootschapType }
     *     
     */
    public void setBuitenlandseVennootschap(BuitenlandseVennootschapType value) {
        this.buitenlandseVennootschap = value;
    }

    /**
     * Gets the value of the eenmanszaakMetMeerdereEigenaren property.
     * 
     * @return
     *     possible object is
     *     {@link EenmanszaakMetMeerdereEigenarenType }
     *     
     */
    public EenmanszaakMetMeerdereEigenarenType getEenmanszaakMetMeerdereEigenaren() {
        return eenmanszaakMetMeerdereEigenaren;
    }

    /**
     * Sets the value of the eenmanszaakMetMeerdereEigenaren property.
     * 
     * @param value
     *     allowed object is
     *     {@link EenmanszaakMetMeerdereEigenarenType }
     *     
     */
    public void setEenmanszaakMetMeerdereEigenaren(EenmanszaakMetMeerdereEigenarenType value) {
        this.eenmanszaakMetMeerdereEigenaren = value;
    }

    /**
     * Gets the value of the rechtspersoon property.
     * 
     * @return
     *     possible object is
     *     {@link RechtspersoonType }
     *     
     */
    public RechtspersoonType getRechtspersoon() {
        return rechtspersoon;
    }

    /**
     * Sets the value of the rechtspersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtspersoonType }
     *     
     */
    public void setRechtspersoon(RechtspersoonType value) {
        this.rechtspersoon = value;
    }

    /**
     * Gets the value of the rechtspersoonInOprichting property.
     * 
     * @return
     *     possible object is
     *     {@link RechtspersoonInOprichtingType }
     *     
     */
    public RechtspersoonInOprichtingType getRechtspersoonInOprichting() {
        return rechtspersoonInOprichting;
    }

    /**
     * Sets the value of the rechtspersoonInOprichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RechtspersoonInOprichtingType }
     *     
     */
    public void setRechtspersoonInOprichting(RechtspersoonInOprichtingType value) {
        this.rechtspersoonInOprichting = value;
    }

    /**
     * Gets the value of the samenwerkingsverband property.
     * 
     * @return
     *     possible object is
     *     {@link SamenwerkingsverbandType }
     *     
     */
    public SamenwerkingsverbandType getSamenwerkingsverband() {
        return samenwerkingsverband;
    }

    /**
     * Sets the value of the samenwerkingsverband property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamenwerkingsverbandType }
     *     
     */
    public void setSamenwerkingsverband(SamenwerkingsverbandType value) {
        this.samenwerkingsverband = value;
    }

    /**
     * Gets the value of the afgeslotenMoeder property.
     * 
     * @return
     *     possible object is
     *     {@link AfgeslotenMoederType }
     *     
     */
    public AfgeslotenMoederType getAfgeslotenMoeder() {
        return afgeslotenMoeder;
    }

    /**
     * Sets the value of the afgeslotenMoeder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfgeslotenMoederType }
     *     
     */
    public void setAfgeslotenMoeder(AfgeslotenMoederType value) {
        this.afgeslotenMoeder = value;
    }

}
