
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetExtraElementenMogenlijkheidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetExtraElementenMogenlijkheidType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extraElementen" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}ExtraElementenType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetExtraElementenMogenlijkheidType", propOrder = {
    "extraElementen"
})
@XmlSeeAlso({
    BinnenlandsAdresType.class,
    DeponeringenType.class,
    FusieSplitsingVoorstelType.class,
    CommunicatienummerType.class,
    BerichtenboxType.class,
    TelefoonnummerType.class,
    BeperkingInHandelingType.class,
    RechterlijkeUitspraakType.class,
    MonistischeBestuurderType.class,
    BeperkteVolmachtType.class,
    RelatieType.class,
    ActiviteitenType.class,
    DeponeringType.class,
    BasisType.class,
    BuitenlandsAdresType.class
})
public abstract class MetExtraElementenMogenlijkheidType {

    protected ExtraElementenType extraElementen;

    /**
     * Gets the value of the extraElementen property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraElementenType }
     *     
     */
    public ExtraElementenType getExtraElementen() {
        return extraElementen;
    }

    /**
     * Sets the value of the extraElementen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraElementenType }
     *     
     */
    public void setExtraElementen(ExtraElementenType value) {
        this.extraElementen = value;
    }

}
