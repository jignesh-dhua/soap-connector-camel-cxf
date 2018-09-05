
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersoonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersoonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;sequence>
 *         &lt;element name="bijzondereRechtstoestand" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BijzondereRechtstoestandType" minOccurs="0"/>
 *         &lt;element name="beperkingInRechtshandeling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BeperkingInRechtshandelingType" minOccurs="0"/>
 *         &lt;element name="persoonRechtsvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="volledigeNaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uitgebreideRechtsvorm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bezoekLocatiePersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="postLocatiePersoon" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}LocatieType" minOccurs="0"/>
 *         &lt;element name="heeft" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="is" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctievervullingRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isEigenaarVan" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MaatschappelijkeActiviteitRelatieType" minOccurs="0"/>
 *         &lt;element name="isVerenigdNaar" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType" minOccurs="0"/>
 *         &lt;element name="isVerenigdMet" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PersoonRelatieType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersoonType", propOrder = {
    "bijzondereRechtstoestand",
    "beperkingInRechtshandeling",
    "persoonRechtsvorm",
    "volledigeNaam",
    "uitgebreideRechtsvorm",
    "bezoekLocatiePersoon",
    "postLocatiePersoon",
    "heeft",
    "is",
    "isEigenaarVan",
    "isVerenigdNaar",
    "isVerenigdMet"
})
@XmlSeeAlso({
    NatuurlijkPersoonType.class,
    NaamPersoonType.class,
    NietNatuurlijkPersoonType.class
})
public abstract class PersoonType
    extends BasisType
{

    protected BijzondereRechtstoestandType bijzondereRechtstoestand;
    protected BeperkingInRechtshandelingType beperkingInRechtshandeling;
    protected String persoonRechtsvorm;
    protected String volledigeNaam;
    protected String uitgebreideRechtsvorm;
    protected LocatieType bezoekLocatiePersoon;
    protected LocatieType postLocatiePersoon;
    protected List<FunctievervullingRelatieType> heeft;
    protected List<FunctievervullingRelatieType> is;
    protected MaatschappelijkeActiviteitRelatieType isEigenaarVan;
    protected PersoonRelatieType isVerenigdNaar;
    protected List<PersoonRelatieType> isVerenigdMet;

    /**
     * Gets the value of the bijzondereRechtstoestand property.
     * 
     * @return
     *     possible object is
     *     {@link BijzondereRechtstoestandType }
     *     
     */
    public BijzondereRechtstoestandType getBijzondereRechtstoestand() {
        return bijzondereRechtstoestand;
    }

    /**
     * Sets the value of the bijzondereRechtstoestand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BijzondereRechtstoestandType }
     *     
     */
    public void setBijzondereRechtstoestand(BijzondereRechtstoestandType value) {
        this.bijzondereRechtstoestand = value;
    }

    /**
     * Gets the value of the beperkingInRechtshandeling property.
     * 
     * @return
     *     possible object is
     *     {@link BeperkingInRechtshandelingType }
     *     
     */
    public BeperkingInRechtshandelingType getBeperkingInRechtshandeling() {
        return beperkingInRechtshandeling;
    }

    /**
     * Sets the value of the beperkingInRechtshandeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeperkingInRechtshandelingType }
     *     
     */
    public void setBeperkingInRechtshandeling(BeperkingInRechtshandelingType value) {
        this.beperkingInRechtshandeling = value;
    }

    /**
     * Gets the value of the persoonRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersoonRechtsvorm() {
        return persoonRechtsvorm;
    }

    /**
     * Sets the value of the persoonRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersoonRechtsvorm(String value) {
        this.persoonRechtsvorm = value;
    }

    /**
     * Gets the value of the volledigeNaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolledigeNaam() {
        return volledigeNaam;
    }

    /**
     * Sets the value of the volledigeNaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolledigeNaam(String value) {
        this.volledigeNaam = value;
    }

    /**
     * Gets the value of the uitgebreideRechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUitgebreideRechtsvorm() {
        return uitgebreideRechtsvorm;
    }

    /**
     * Sets the value of the uitgebreideRechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUitgebreideRechtsvorm(String value) {
        this.uitgebreideRechtsvorm = value;
    }

    /**
     * Gets the value of the bezoekLocatiePersoon property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getBezoekLocatiePersoon() {
        return bezoekLocatiePersoon;
    }

    /**
     * Sets the value of the bezoekLocatiePersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setBezoekLocatiePersoon(LocatieType value) {
        this.bezoekLocatiePersoon = value;
    }

    /**
     * Gets the value of the postLocatiePersoon property.
     * 
     * @return
     *     possible object is
     *     {@link LocatieType }
     *     
     */
    public LocatieType getPostLocatiePersoon() {
        return postLocatiePersoon;
    }

    /**
     * Sets the value of the postLocatiePersoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatieType }
     *     
     */
    public void setPostLocatiePersoon(LocatieType value) {
        this.postLocatiePersoon = value;
    }

    /**
     * Gets the value of the heeft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heeft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeeft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctievervullingRelatieType }
     * 
     * 
     */
    public List<FunctievervullingRelatieType> getHeeft() {
        if (heeft == null) {
            heeft = new ArrayList<FunctievervullingRelatieType>();
        }
        return this.heeft;
    }

    /**
     * Gets the value of the is property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the is property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctievervullingRelatieType }
     * 
     * 
     */
    public List<FunctievervullingRelatieType> getIs() {
        if (is == null) {
            is = new ArrayList<FunctievervullingRelatieType>();
        }
        return this.is;
    }

    /**
     * Gets the value of the isEigenaarVan property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public MaatschappelijkeActiviteitRelatieType getIsEigenaarVan() {
        return isEigenaarVan;
    }

    /**
     * Sets the value of the isEigenaarVan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitRelatieType }
     *     
     */
    public void setIsEigenaarVan(MaatschappelijkeActiviteitRelatieType value) {
        this.isEigenaarVan = value;
    }

    /**
     * Gets the value of the isVerenigdNaar property.
     * 
     * @return
     *     possible object is
     *     {@link PersoonRelatieType }
     *     
     */
    public PersoonRelatieType getIsVerenigdNaar() {
        return isVerenigdNaar;
    }

    /**
     * Sets the value of the isVerenigdNaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersoonRelatieType }
     *     
     */
    public void setIsVerenigdNaar(PersoonRelatieType value) {
        this.isVerenigdNaar = value;
    }

    /**
     * Gets the value of the isVerenigdMet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVerenigdMet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVerenigdMet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersoonRelatieType }
     * 
     * 
     */
    public List<PersoonRelatieType> getIsVerenigdMet() {
        if (isVerenigdMet == null) {
            isVerenigdMet = new ArrayList<PersoonRelatieType>();
        }
        return this.isVerenigdMet;
    }

}
