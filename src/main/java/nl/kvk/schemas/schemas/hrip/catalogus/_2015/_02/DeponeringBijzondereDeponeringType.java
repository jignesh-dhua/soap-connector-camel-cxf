
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeponeringBijzondereDeponeringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeponeringBijzondereDeponeringType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DeponeringType">
 *       &lt;sequence>
 *         &lt;element name="soort" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="fusieSplitsingVoorstel" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FusieSplitsingVoorstelType" minOccurs="0"/>
 *         &lt;element name="omschrijving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeponeringBijzondereDeponeringType", propOrder = {
    "soort",
    "fusieSplitsingVoorstel",
    "omschrijving"
})
public class DeponeringBijzondereDeponeringType
    extends DeponeringType
{

    protected EnumeratieType soort;
    protected FusieSplitsingVoorstelType fusieSplitsingVoorstel;
    protected String omschrijving;

    /**
     * Gets the value of the soort property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getSoort() {
        return soort;
    }

    /**
     * Sets the value of the soort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setSoort(EnumeratieType value) {
        this.soort = value;
    }

    /**
     * Gets the value of the fusieSplitsingVoorstel property.
     * 
     * @return
     *     possible object is
     *     {@link FusieSplitsingVoorstelType }
     *     
     */
    public FusieSplitsingVoorstelType getFusieSplitsingVoorstel() {
        return fusieSplitsingVoorstel;
    }

    /**
     * Sets the value of the fusieSplitsingVoorstel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FusieSplitsingVoorstelType }
     *     
     */
    public void setFusieSplitsingVoorstel(FusieSplitsingVoorstelType value) {
        this.fusieSplitsingVoorstel = value;
    }

    /**
     * Gets the value of the omschrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Sets the value of the omschrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijving(String value) {
        this.omschrijving = value;
    }

}
