
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ExtraElementenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraElementenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extraElement" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="naam" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="hoortBijGroep" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraElementenType", propOrder = {
    "extraElement"
})
public class ExtraElementenType {

    @XmlElement(required = true, nillable = true)
    protected List<ExtraElementenType.ExtraElement> extraElement;

    /**
     * Gets the value of the extraElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraElementenType.ExtraElement }
     * 
     * 
     */
    public List<ExtraElementenType.ExtraElement> getExtraElement() {
        if (extraElement == null) {
            extraElement = new ArrayList<ExtraElementenType.ExtraElement>();
        }
        return this.extraElement;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="naam" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="hoortBijGroep" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ExtraElement {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "naam", required = true)
        protected String naam;
        @XmlAttribute(name = "hoortBijGroep")
        protected String hoortBijGroep;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

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
         * Gets the value of the hoortBijGroep property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoortBijGroep() {
            return hoortBijGroep;
        }

        /**
         * Sets the value of the hoortBijGroep property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoortBijGroep(String value) {
            this.hoortBijGroep = value;
        }

    }

}
