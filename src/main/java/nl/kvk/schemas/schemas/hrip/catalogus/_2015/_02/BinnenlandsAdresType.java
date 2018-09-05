
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinnenlandsAdresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinnenlandsAdresType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="straatnaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aanduidingBijHuisnummer" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="huisnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="huisnummerToevoeging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huisletter" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}Letter" minOccurs="0"/>
 *         &lt;element name="postbusnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PostcodeType" minOccurs="0"/>
 *         &lt;element name="plaats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagId" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BagIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinnenlandsAdresType", propOrder = {
    "straatnaam",
    "aanduidingBijHuisnummer",
    "huisnummer",
    "huisnummerToevoeging",
    "huisletter",
    "postbusnummer",
    "postcode",
    "plaats",
    "bagId"
})
public class BinnenlandsAdresType
    extends MetExtraElementenMogenlijkheidType
{

    protected String straatnaam;
    protected EnumeratieType aanduidingBijHuisnummer;
    protected BigInteger huisnummer;
    protected String huisnummerToevoeging;
    protected String huisletter;
    protected BigInteger postbusnummer;
    protected PostcodeType postcode;
    protected String plaats;
    protected BagIdType bagId;

    /**
     * Gets the value of the straatnaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStraatnaam() {
        return straatnaam;
    }

    /**
     * Sets the value of the straatnaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStraatnaam(String value) {
        this.straatnaam = value;
    }

    /**
     * Gets the value of the aanduidingBijHuisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getAanduidingBijHuisnummer() {
        return aanduidingBijHuisnummer;
    }

    /**
     * Sets the value of the aanduidingBijHuisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setAanduidingBijHuisnummer(EnumeratieType value) {
        this.aanduidingBijHuisnummer = value;
    }

    /**
     * Gets the value of the huisnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHuisnummer() {
        return huisnummer;
    }

    /**
     * Sets the value of the huisnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHuisnummer(BigInteger value) {
        this.huisnummer = value;
    }

    /**
     * Gets the value of the huisnummerToevoeging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisnummerToevoeging() {
        return huisnummerToevoeging;
    }

    /**
     * Sets the value of the huisnummerToevoeging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisnummerToevoeging(String value) {
        this.huisnummerToevoeging = value;
    }

    /**
     * Gets the value of the huisletter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuisletter() {
        return huisletter;
    }

    /**
     * Sets the value of the huisletter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuisletter(String value) {
        this.huisletter = value;
    }

    /**
     * Gets the value of the postbusnummer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPostbusnummer() {
        return postbusnummer;
    }

    /**
     * Sets the value of the postbusnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPostbusnummer(BigInteger value) {
        this.postbusnummer = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link PostcodeType }
     *     
     */
    public PostcodeType getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostcodeType }
     *     
     */
    public void setPostcode(PostcodeType value) {
        this.postcode = value;
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
     * Gets the value of the bagId property.
     * 
     * @return
     *     possible object is
     *     {@link BagIdType }
     *     
     */
    public BagIdType getBagId() {
        return bagId;
    }

    /**
     * Sets the value of the bagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagIdType }
     *     
     */
    public void setBagId(BagIdType value) {
        this.bagId = value;
    }

}
