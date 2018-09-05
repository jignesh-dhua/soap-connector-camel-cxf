
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoValue">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="nietOndersteund"/>
 *     &lt;enumeration value="nietGeautoriseerd"/>
 *     &lt;enumeration value="geenWaarde"/>
 *     &lt;enumeration value="waardeOnbekend"/>
 *     &lt;enumeration value="vastgesteldOnbekend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NoValue")
@XmlEnum
public enum NoValue {

    @XmlEnumValue("nietOndersteund")
    NIET_ONDERSTEUND("nietOndersteund"),
    @XmlEnumValue("nietGeautoriseerd")
    NIET_GEAUTORISEERD("nietGeautoriseerd"),
    @XmlEnumValue("geenWaarde")
    GEEN_WAARDE("geenWaarde"),
    @XmlEnumValue("waardeOnbekend")
    WAARDE_ONBEKEND("waardeOnbekend"),
    @XmlEnumValue("vastgesteldOnbekend")
    VASTGESTELD_ONBEKEND("vastgesteldOnbekend");
    private final String value;

    NoValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoValue fromValue(String v) {
        for (NoValue c: NoValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
