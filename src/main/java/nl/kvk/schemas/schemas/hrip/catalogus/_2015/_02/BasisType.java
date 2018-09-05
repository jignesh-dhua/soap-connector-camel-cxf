
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="registratie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RegistratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasisType", propOrder = {
    "registratie"
})
@XmlSeeAlso({
    OndernemingType.class,
    MaatschappelijkeActiviteitType.class,
    CommanditairKapitaalType.class,
    BevoegdheidBewindvoerderType.class,
    BeperkingInRechtshandelingType.class,
    LiquidatieType.class,
    SBIActiviteitType.class,
    LocatieType.class,
    BevoegdheidAansprakelijkeType.class,
    BuitenlandseVennootschapGegevensType.class,
    VestigingType.class,
    NaamgevingType.class,
    OpTeRichtenRechtspersoonType.class,
    BuitenlandseRechtstoestandType.class,
    BevoegdheidOverigeFunctionarisType.class,
    KapitaalType.class,
    HandlichtingType.class,
    RechtspersoonGegevensBuitenlandType.class,
    VolmachtType.class,
    DuurType.class,
    BevoegdheidPubliekrechtelijkeFunctionarisType.class,
    BijzondereRechtstoestandType.class,
    PersoonType.class,
    FusieSplitsingType.class,
    BuitenlandseRegistratieGegevensType.class,
    HandelsnaamType.class,
    FunctietitelType.class,
    AandeelSamenstellingType.class,
    BevoegdheidBestuurderType.class,
    SchorsingType.class,
    OntbindingType.class,
    CommunicatiegegevensType.class,
    FunctievervullingType.class,
    VoornemenTotOntbindingType.class,
    AandeelType.class
})
public abstract class BasisType
    extends MetExtraElementenMogenlijkheidType
{

    protected RegistratieType registratie;

    /**
     * Gets the value of the registratie property.
     * 
     * @return
     *     possible object is
     *     {@link RegistratieType }
     *     
     */
    public RegistratieType getRegistratie() {
        return registratie;
    }

    /**
     * Sets the value of the registratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistratieType }
     *     
     */
    public void setRegistratie(RegistratieType value) {
        this.registratie = value;
    }

}
