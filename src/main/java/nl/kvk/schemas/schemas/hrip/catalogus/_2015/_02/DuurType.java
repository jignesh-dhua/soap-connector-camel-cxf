
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DuurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DuurType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BasisType">
 *       &lt;choice>
 *         &lt;element name="eindeDuur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DatumIncompleetType" minOccurs="0"/>
 *         &lt;element name="heeftOnbepaaldeDuur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuurType", propOrder = {
    "eindeDuur",
    "heeftOnbepaaldeDuur"
})
public class DuurType
    extends BasisType
{

    protected String eindeDuur;
    protected EnumeratieType heeftOnbepaaldeDuur;

    /**
     * Gets the value of the eindeDuur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEindeDuur() {
        return eindeDuur;
    }

    /**
     * Sets the value of the eindeDuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEindeDuur(String value) {
        this.eindeDuur = value;
    }

    /**
     * Gets the value of the heeftOnbepaaldeDuur property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getHeeftOnbepaaldeDuur() {
        return heeftOnbepaaldeDuur;
    }

    /**
     * Sets the value of the heeftOnbepaaldeDuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setHeeftOnbepaaldeDuur(EnumeratieType value) {
        this.heeftOnbepaaldeDuur = value;
    }

}
