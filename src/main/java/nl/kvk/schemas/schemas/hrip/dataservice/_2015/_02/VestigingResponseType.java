
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.kvk.schemas.schemas.hrip.catalogus._2015._02.CommercieleVestigingType;
import nl.kvk.schemas.schemas.hrip.catalogus._2015._02.NietCommercieleVestigingType;


/**
 * <p>Java class for VestigingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VestigingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02}ResponseType">
 *       &lt;sequence>
 *         &lt;element name="product" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}commercieleVestiging"/>
 *                     &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}nietCommercieleVestiging"/>
 *                   &lt;/choice>
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
@XmlType(name = "VestigingResponseType", propOrder = {
    "product"
})
public class VestigingResponseType
    extends ResponseType
{

    protected VestigingResponseType.Product product;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link VestigingResponseType.Product }
     *     
     */
    public VestigingResponseType.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link VestigingResponseType.Product }
     *     
     */
    public void setProduct(VestigingResponseType.Product value) {
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
     *         &lt;choice>
     *           &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}commercieleVestiging"/>
     *           &lt;element ref="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}nietCommercieleVestiging"/>
     *         &lt;/choice>
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
        "commercieleVestiging",
        "nietCommercieleVestiging"
    })
    public static class Product {

        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02")
        protected CommercieleVestigingType commercieleVestiging;
        @XmlElement(namespace = "http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02")
        protected NietCommercieleVestigingType nietCommercieleVestiging;

        /**
         * Gets the value of the commercieleVestiging property.
         * 
         * @return
         *     possible object is
         *     {@link CommercieleVestigingType }
         *     
         */
        public CommercieleVestigingType getCommercieleVestiging() {
            return commercieleVestiging;
        }

        /**
         * Sets the value of the commercieleVestiging property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommercieleVestigingType }
         *     
         */
        public void setCommercieleVestiging(CommercieleVestigingType value) {
            this.commercieleVestiging = value;
        }

        /**
         * Gets the value of the nietCommercieleVestiging property.
         * 
         * @return
         *     possible object is
         *     {@link NietCommercieleVestigingType }
         *     
         */
        public NietCommercieleVestigingType getNietCommercieleVestiging() {
            return nietCommercieleVestiging;
        }

        /**
         * Sets the value of the nietCommercieleVestiging property.
         * 
         * @param value
         *     allowed object is
         *     {@link NietCommercieleVestigingType }
         *     
         */
        public void setNietCommercieleVestiging(NietCommercieleVestigingType value) {
            this.nietCommercieleVestiging = value;
        }

    }

}
