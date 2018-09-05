
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActiviteitenCommercieleVestigingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActiviteitenCommercieleVestigingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ActiviteitenType">
 *       &lt;sequence>
 *         &lt;element name="exporteert" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="importeert" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActiviteitenCommercieleVestigingType", propOrder = {
    "exporteert",
    "importeert"
})
public class ActiviteitenCommercieleVestigingType
    extends ActiviteitenType
{

    protected EnumeratieType exporteert;
    protected EnumeratieType importeert;

    /**
     * Gets the value of the exporteert property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getExporteert() {
        return exporteert;
    }

    /**
     * Sets the value of the exporteert property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setExporteert(EnumeratieType value) {
        this.exporteert = value;
    }

    /**
     * Gets the value of the importeert property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getImporteert() {
        return importeert;
    }

    /**
     * Sets the value of the importeert property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setImporteert(EnumeratieType value) {
        this.importeert = value;
    }

}
