
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestuursfunctieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BestuursfunctieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingType">
 *       &lt;sequence>
 *         &lt;element name="functie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="bevoegdheid" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BevoegdheidBestuurderType" minOccurs="0"/>
 *         &lt;element name="wordtVertegenwoordigdDoor" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NatuurlijkPersoonRelatieType" minOccurs="0"/>
 *         &lt;element name="monistischeBestuurder" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MonistischeBestuurderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestuursfunctieType", propOrder = {
    "functie",
    "bevoegdheid",
    "wordtVertegenwoordigdDoor",
    "monistischeBestuurder"
})
public class BestuursfunctieType
    extends FunctievervullingType
{

    @XmlElement(required = true)
    protected EnumeratieType functie;
    protected BevoegdheidBestuurderType bevoegdheid;
    protected NatuurlijkPersoonRelatieType wordtVertegenwoordigdDoor;
    protected MonistischeBestuurderType monistischeBestuurder;

    /**
     * Gets the value of the functie property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getFunctie() {
        return functie;
    }

    /**
     * Sets the value of the functie property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setFunctie(EnumeratieType value) {
        this.functie = value;
    }

    /**
     * Gets the value of the bevoegdheid property.
     * 
     * @return
     *     possible object is
     *     {@link BevoegdheidBestuurderType }
     *     
     */
    public BevoegdheidBestuurderType getBevoegdheid() {
        return bevoegdheid;
    }

    /**
     * Sets the value of the bevoegdheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BevoegdheidBestuurderType }
     *     
     */
    public void setBevoegdheid(BevoegdheidBestuurderType value) {
        this.bevoegdheid = value;
    }

    /**
     * Gets the value of the wordtVertegenwoordigdDoor property.
     * 
     * @return
     *     possible object is
     *     {@link NatuurlijkPersoonRelatieType }
     *     
     */
    public NatuurlijkPersoonRelatieType getWordtVertegenwoordigdDoor() {
        return wordtVertegenwoordigdDoor;
    }

    /**
     * Sets the value of the wordtVertegenwoordigdDoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatuurlijkPersoonRelatieType }
     *     
     */
    public void setWordtVertegenwoordigdDoor(NatuurlijkPersoonRelatieType value) {
        this.wordtVertegenwoordigdDoor = value;
    }

    /**
     * Gets the value of the monistischeBestuurder property.
     * 
     * @return
     *     possible object is
     *     {@link MonistischeBestuurderType }
     *     
     */
    public MonistischeBestuurderType getMonistischeBestuurder() {
        return monistischeBestuurder;
    }

    /**
     * Sets the value of the monistischeBestuurder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonistischeBestuurderType }
     *     
     */
    public void setMonistischeBestuurder(MonistischeBestuurderType value) {
        this.monistischeBestuurder = value;
    }

}
