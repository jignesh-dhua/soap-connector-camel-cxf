
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuitenlandseVennootschapGegevensType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuitenlandseVennootschapGegevensType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="heeftHoofdvestigingBuitenNederland" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="omschrijvingRechtsvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datumEersteInschrijvingBuitenland" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="zetel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rechtsvormcategorie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType"/>
 *         &lt;element name="datumFormeelBuitenlandsSinds" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="datumAkteOprichting" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuitenlandseVennootschapGegevensType", propOrder = {
    "heeftHoofdvestigingBuitenNederland",
    "omschrijvingRechtsvorm",
    "datumEersteInschrijvingBuitenland",
    "zetel",
    "rechtsvormcategorie",
    "datumFormeelBuitenlandsSinds",
    "datumAkteOprichting"
})
public class BuitenlandseVennootschapGegevensType
    extends BasisType
{

    protected EnumeratieType heeftHoofdvestigingBuitenNederland;
    protected String omschrijvingRechtsvorm;
    protected String datumEersteInschrijvingBuitenland;
    protected String zetel;
    @XmlElement(required = true)
    protected EnumeratieType rechtsvormcategorie;
    protected String datumFormeelBuitenlandsSinds;
    protected String datumAkteOprichting;

    /**
     * Gets the value of the heeftHoofdvestigingBuitenNederland property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getHeeftHoofdvestigingBuitenNederland() {
        return heeftHoofdvestigingBuitenNederland;
    }

    /**
     * Sets the value of the heeftHoofdvestigingBuitenNederland property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setHeeftHoofdvestigingBuitenNederland(EnumeratieType value) {
        this.heeftHoofdvestigingBuitenNederland = value;
    }

    /**
     * Gets the value of the omschrijvingRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingRechtsvorm() {
        return omschrijvingRechtsvorm;
    }

    /**
     * Sets the value of the omschrijvingRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingRechtsvorm(String value) {
        this.omschrijvingRechtsvorm = value;
    }

    /**
     * Gets the value of the datumEersteInschrijvingBuitenland property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumEersteInschrijvingBuitenland() {
        return datumEersteInschrijvingBuitenland;
    }

    /**
     * Sets the value of the datumEersteInschrijvingBuitenland property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumEersteInschrijvingBuitenland(String value) {
        this.datumEersteInschrijvingBuitenland = value;
    }

    /**
     * Gets the value of the zetel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZetel() {
        return zetel;
    }

    /**
     * Sets the value of the zetel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZetel(String value) {
        this.zetel = value;
    }

    /**
     * Gets the value of the rechtsvormcategorie property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRechtsvormcategorie() {
        return rechtsvormcategorie;
    }

    /**
     * Sets the value of the rechtsvormcategorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRechtsvormcategorie(EnumeratieType value) {
        this.rechtsvormcategorie = value;
    }

    /**
     * Gets the value of the datumFormeelBuitenlandsSinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumFormeelBuitenlandsSinds() {
        return datumFormeelBuitenlandsSinds;
    }

    /**
     * Sets the value of the datumFormeelBuitenlandsSinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumFormeelBuitenlandsSinds(String value) {
        this.datumFormeelBuitenlandsSinds = value;
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

}
