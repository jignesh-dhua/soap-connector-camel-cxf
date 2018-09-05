
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresBinnenOfBuitenlandsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresBinnenOfBuitenlandsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="binnenlandsAdres" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BinnenlandsAdresType"/>
 *         &lt;element name="buitenlandsAdres" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BuitenlandsAdresType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresBinnenOfBuitenlandsType", propOrder = {
    "binnenlandsAdres",
    "buitenlandsAdres"
})
public class AdresBinnenOfBuitenlandsType {

    protected BinnenlandsAdresType binnenlandsAdres;
    protected BuitenlandsAdresType buitenlandsAdres;

    /**
     * Gets the value of the binnenlandsAdres property.
     * 
     * @return
     *     possible object is
     *     {@link BinnenlandsAdresType }
     *     
     */
    public BinnenlandsAdresType getBinnenlandsAdres() {
        return binnenlandsAdres;
    }

    /**
     * Sets the value of the binnenlandsAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinnenlandsAdresType }
     *     
     */
    public void setBinnenlandsAdres(BinnenlandsAdresType value) {
        this.binnenlandsAdres = value;
    }

    /**
     * Gets the value of the buitenlandsAdres property.
     * 
     * @return
     *     possible object is
     *     {@link BuitenlandsAdresType }
     *     
     */
    public BuitenlandsAdresType getBuitenlandsAdres() {
        return buitenlandsAdres;
    }

    /**
     * Sets the value of the buitenlandsAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuitenlandsAdresType }
     *     
     */
    public void setBuitenlandsAdres(BuitenlandsAdresType value) {
        this.buitenlandsAdres = value;
    }

}
