
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeperkteVolmachtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeperkteVolmachtType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *       &lt;sequence>
 *         &lt;element name="beperkingInGeld" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GeldType" minOccurs="0"/>
 *         &lt;element name="magOpgaveHandelsregisterDoen" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="heeftOverigeVolmacht" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="omschrijvingOverigeVolmacht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beperkingInHandeling" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BeperkingInHandelingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeperkteVolmachtType", propOrder = {
    "beperkingInGeld",
    "magOpgaveHandelsregisterDoen",
    "heeftOverigeVolmacht",
    "omschrijvingOverigeVolmacht",
    "beperkingInHandeling"
})
public class BeperkteVolmachtType
    extends MetExtraElementenMogenlijkheidType
{

    protected GeldType beperkingInGeld;
    protected EnumeratieType magOpgaveHandelsregisterDoen;
    protected EnumeratieType heeftOverigeVolmacht;
    protected String omschrijvingOverigeVolmacht;
    protected List<BeperkingInHandelingType> beperkingInHandeling;

    /**
     * Gets the value of the beperkingInGeld property.
     * 
     * @return
     *     possible object is
     *     {@link GeldType }
     *     
     */
    public GeldType getBeperkingInGeld() {
        return beperkingInGeld;
    }

    /**
     * Sets the value of the beperkingInGeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeldType }
     *     
     */
    public void setBeperkingInGeld(GeldType value) {
        this.beperkingInGeld = value;
    }

    /**
     * Gets the value of the magOpgaveHandelsregisterDoen property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getMagOpgaveHandelsregisterDoen() {
        return magOpgaveHandelsregisterDoen;
    }

    /**
     * Sets the value of the magOpgaveHandelsregisterDoen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setMagOpgaveHandelsregisterDoen(EnumeratieType value) {
        this.magOpgaveHandelsregisterDoen = value;
    }

    /**
     * Gets the value of the heeftOverigeVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getHeeftOverigeVolmacht() {
        return heeftOverigeVolmacht;
    }

    /**
     * Sets the value of the heeftOverigeVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setHeeftOverigeVolmacht(EnumeratieType value) {
        this.heeftOverigeVolmacht = value;
    }

    /**
     * Gets the value of the omschrijvingOverigeVolmacht property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmschrijvingOverigeVolmacht() {
        return omschrijvingOverigeVolmacht;
    }

    /**
     * Sets the value of the omschrijvingOverigeVolmacht property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmschrijvingOverigeVolmacht(String value) {
        this.omschrijvingOverigeVolmacht = value;
    }

    /**
     * Gets the value of the beperkingInHandeling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beperkingInHandeling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeperkingInHandeling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeperkingInHandelingType }
     * 
     * 
     */
    public List<BeperkingInHandelingType> getBeperkingInHandeling() {
        if (beperkingInHandeling == null) {
            beperkingInHandeling = new ArrayList<BeperkingInHandelingType>();
        }
        return this.beperkingInHandeling;
    }

}
