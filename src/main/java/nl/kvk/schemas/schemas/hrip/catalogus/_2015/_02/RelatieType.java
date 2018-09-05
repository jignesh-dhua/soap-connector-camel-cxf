
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}MetExtraElementenMogenlijkheidType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatieType")
@XmlSeeAlso({
    MaatschappelijkeActiviteitRelatieType.class,
    PersoonRelatieType.class,
    VestigingRelatieType.class,
    DeponeringRelatieType.class,
    FunctievervullingRelatieType.class,
    DeponeringNietNatuurlijkPersoonRelatieType.class,
    NatuurlijkPersoonRelatieType.class,
    NietNatuurlijkPersoonRelatieType.class,
    VestigingenRelatieType.class,
    OndernemingRelatieType.class,
    RelatieRegistratieType.class
})
public abstract class RelatieType
    extends MetExtraElementenMogenlijkheidType
{


}
