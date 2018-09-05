
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamenwerkingsverbandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamenwerkingsverbandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}NietNatuurlijkPersoonType">
 *       &lt;sequence>
 *         &lt;element name="rechtsvorm" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}EnumeratieType" minOccurs="0"/>
 *         &lt;element name="aantalCommanditaireVennoten" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="duur" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}DuurType" minOccurs="0"/>
 *         &lt;element name="commanditairKapitaal" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}CommanditairKapitaalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamenwerkingsverbandType", propOrder = {
    "rechtsvorm",
    "aantalCommanditaireVennoten",
    "duur",
    "commanditairKapitaal"
})
public class SamenwerkingsverbandType
    extends NietNatuurlijkPersoonType
{

    protected EnumeratieType rechtsvorm;
    protected BigInteger aantalCommanditaireVennoten;
    protected DuurType duur;
    protected List<CommanditairKapitaalType> commanditairKapitaal;

    /**
     * Gets the value of the rechtsvorm property.
     * 
     * @return
     *     possible object is
     *     {@link EnumeratieType }
     *     
     */
    public EnumeratieType getRechtsvorm() {
        return rechtsvorm;
    }

    /**
     * Sets the value of the rechtsvorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumeratieType }
     *     
     */
    public void setRechtsvorm(EnumeratieType value) {
        this.rechtsvorm = value;
    }

    /**
     * Gets the value of the aantalCommanditaireVennoten property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAantalCommanditaireVennoten() {
        return aantalCommanditaireVennoten;
    }

    /**
     * Sets the value of the aantalCommanditaireVennoten property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAantalCommanditaireVennoten(BigInteger value) {
        this.aantalCommanditaireVennoten = value;
    }

    /**
     * Gets the value of the duur property.
     * 
     * @return
     *     possible object is
     *     {@link DuurType }
     *     
     */
    public DuurType getDuur() {
        return duur;
    }

    /**
     * Sets the value of the duur property.
     * 
     * @param value
     *     allowed object is
     *     {@link DuurType }
     *     
     */
    public void setDuur(DuurType value) {
        this.duur = value;
    }

    /**
     * Gets the value of the commanditairKapitaal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commanditairKapitaal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommanditairKapitaal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommanditairKapitaalType }
     * 
     * 
     */
    public List<CommanditairKapitaalType> getCommanditairKapitaal() {
        if (commanditairKapitaal == null) {
            commanditairKapitaal = new ArrayList<CommanditairKapitaalType>();
        }
        return this.commanditairKapitaal;
    }

}
