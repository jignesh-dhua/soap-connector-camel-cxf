
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import nl.kvk.schemas.schemas.hrip.catalogus._2015._02.MaatschappelijkeActiviteitType;


/**
 * <p>Java class for MaatschappelijkeActiviteitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaatschappelijkeActiviteitResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ResponseType">
 *       &lt;sequence>
 *         &lt;element name="product" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}maatschappelijkeActiviteit"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaatschappelijkeActiviteitResponseType", propOrder = {
    "product"
})
@XmlSeeAlso({
    InschrijvingResponseType.class
})
public class MaatschappelijkeActiviteitResponseType
    extends ResponseType
{

    protected MaatschappelijkeActiviteitResponseType.Product product;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link MaatschappelijkeActiviteitResponseType.Product }
     *     
     */
    public MaatschappelijkeActiviteitResponseType.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaatschappelijkeActiviteitResponseType.Product }
     *     
     */
    public void setProduct(MaatschappelijkeActiviteitResponseType.Product value) {
        this.product = value;
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
     *         &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}maatschappelijkeActiviteit"/>
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
        "maatschappelijkeActiviteit"
    })
    public static class Product {

        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02", required = true)
        protected MaatschappelijkeActiviteitType maatschappelijkeActiviteit;

        /**
         * Gets the value of the maatschappelijkeActiviteit property.
         * 
         * @return
         *     possible object is
         *     {@link MaatschappelijkeActiviteitType }
         *     
         */
        public MaatschappelijkeActiviteitType getMaatschappelijkeActiviteit() {
            return maatschappelijkeActiviteit;
        }

        /**
         * Sets the value of the maatschappelijkeActiviteit property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaatschappelijkeActiviteitType }
         *     
         */
        public void setMaatschappelijkeActiviteit(MaatschappelijkeActiviteitType value) {
            this.maatschappelijkeActiviteit = value;
        }

    }

}
