
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuitenlandseRegistratieGegevensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuitenlandseRegistratieGegevensType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="land" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="inschrijfnummer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buitenlandseRegistratie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuitenlandseRegistratieGegevensType", propOrder = {
    "naam",
    "plaats",
    "land",
    "inschrijfnummer",
    "buitenlandseRegistratie"
})
public class BuitenlandseRegistratieGegevensType
    extends BasisType
{

    protected String naam;
    protected String plaats;
    protected EnumeratieType land;
    protected String inschrijfnummer;
    protected String buitenlandseRegistratie;

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
     * Gets the value of the plaats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaats() {
        return plaats;
    }

    /**
     * Sets the value of the plaats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaats(String value) {
        this.plaats = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setLand(EnumeratieType value) {
        this.land = value;
    }

    /**
     * Gets the value of the inschrijfnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInschrijfnummer() {
        return inschrijfnummer;
    }

    /**
     * Sets the value of the inschrijfnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInschrijfnummer(String value) {
        this.inschrijfnummer = value;
    }

    /**
     * Gets the value of the buitenlandseRegistratie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuitenlandseRegistratie() {
        return buitenlandseRegistratie;
    }

    /**
     * Sets the value of the buitenlandseRegistratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuitenlandseRegistratie(String value) {
        this.buitenlandseRegistratie = value;
    }

}
