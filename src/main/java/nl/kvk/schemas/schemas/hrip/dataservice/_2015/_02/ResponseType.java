
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meldingen">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fout" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="waarschuwing" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="informatie" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="peilmoment" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}TijdstipType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "meldingen"
})
@XmlSeeAlso({
    VestigingResponseType.class,
    MaatschappelijkeActiviteitResponseType.class
})
public class ResponseType {

    @XmlElement(required = true)
    protected ResponseType.Meldingen meldingen;
    @XmlAttribute(name = "peilmoment")
    protected String peilmoment;

    /**
     * Gets the value of the meldingen property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType.Meldingen }
     *     
     */
    public ResponseType.Meldingen getMeldingen() {
        return meldingen;
    }

    /**
     * Sets the value of the meldingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.Meldingen }
     *     
     */
    public void setMeldingen(ResponseType.Meldingen value) {
        this.meldingen = value;
    }

    /**
     * Gets the value of the peilmoment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeilmoment() {
        return peilmoment;
    }

    /**
     * Sets the value of the peilmoment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeilmoment(String value) {
        this.peilmoment = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fout" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="waarschuwing" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="informatie" type="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}MeldingType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fout",
        "waarschuwing",
        "informatie"
    })
    public static class Meldingen {

        protected List<MeldingType> fout;
        protected List<MeldingType> waarschuwing;
        protected List<MeldingType> informatie;

        /**
         * Gets the value of the fout property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fout property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFout().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getFout() {
            if (fout == null) {
                fout = new ArrayList<MeldingType>();
            }
            return this.fout;
        }

        /**
         * Gets the value of the waarschuwing property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the waarschuwing property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWaarschuwing().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getWaarschuwing() {
            if (waarschuwing == null) {
                waarschuwing = new ArrayList<MeldingType>();
            }
            return this.waarschuwing;
        }

        /**
         * Gets the value of the informatie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the informatie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInformatie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MeldingType }
         * 
         * 
         */
        public List<MeldingType> getInformatie() {
            if (informatie == null) {
                informatie = new ArrayList<MeldingType>();
            }
            return this.informatie;
        }

    }

}
