
package nl.kvk.schemas.schemas.hrip.catalogus._2015._02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunctievervullingRelatieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctievervullingRelatieType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}RelatieType">
 *       &lt;choice>
 *         &lt;element name="aansprakelijke" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}AansprakelijkeType"/>
 *         &lt;element name="bestuursfunctie" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}BestuursfunctieType"/>
 *         &lt;element name="functionarisBijzondereRechtstoestand" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}FunctionarisBijzondereRechtstoestandType"/>
 *         &lt;element name="gemachtigde" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}GemachtigdeType"/>
 *         &lt;element name="overigeFunctionaris" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}OverigeFunctionarisType"/>
 *         &lt;element name="publiekrechtelijkeFunctionaris" type="{http://schemas.kvk.nl/schemas/hrip/catalogus/2015/02}PubliekrechtelijkeFunctionarisType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctievervullingRelatieType", propOrder = {
    "aansprakelijke",
    "bestuursfunctie",
    "functionarisBijzondereRechtstoestand",
    "gemachtigde",
    "overigeFunctionaris",
    "publiekrechtelijkeFunctionaris"
})
public class FunctievervullingRelatieType
    extends RelatieType
{

    protected AansprakelijkeType aansprakelijke;
    protected BestuursfunctieType bestuursfunctie;
    protected FunctionarisBijzondereRechtstoestandType functionarisBijzondereRechtstoestand;
    protected GemachtigdeType gemachtigde;
    protected OverigeFunctionarisType overigeFunctionaris;
    protected PubliekrechtelijkeFunctionarisType publiekrechtelijkeFunctionaris;

    /**
     * Gets the value of the aansprakelijke property.
     * 
     * @return
     *     possible object is
     *     {@link AansprakelijkeType }
     *     
     */
    public AansprakelijkeType getAansprakelijke() {
        return aansprakelijke;
    }

    /**
     * Sets the value of the aansprakelijke property.
     * 
     * @param value
     *     allowed object is
     *     {@link AansprakelijkeType }
     *     
     */
    public void setAansprakelijke(AansprakelijkeType value) {
        this.aansprakelijke = value;
    }

    /**
     * Gets the value of the bestuursfunctie property.
     * 
     * @return
     *     possible object is
     *     {@link BestuursfunctieType }
     *     
     */
    public BestuursfunctieType getBestuursfunctie() {
        return bestuursfunctie;
    }

    /**
     * Sets the value of the bestuursfunctie property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestuursfunctieType }
     *     
     */
    public void setBestuursfunctie(BestuursfunctieType value) {
        this.bestuursfunctie = value;
    }

    /**
     * Gets the value of the functionarisBijzondereRechtstoestand property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionarisBijzondereRechtstoestandType }
     *     
     */
    public FunctionarisBijzondereRechtstoestandType getFunctionarisBijzondereRechtstoestand() {
        return functionarisBijzondereRechtstoestand;
    }

    /**
     * Sets the value of the functionarisBijzondereRechtstoestand property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionarisBijzondereRechtstoestandType }
     *     
     */
    public void setFunctionarisBijzondereRechtstoestand(FunctionarisBijzondereRechtstoestandType value) {
        this.functionarisBijzondereRechtstoestand = value;
    }

    /**
     * Gets the value of the gemachtigde property.
     * 
     * @return
     *     possible object is
     *     {@link GemachtigdeType }
     *     
     */
    public GemachtigdeType getGemachtigde() {
        return gemachtigde;
    }

    /**
     * Sets the value of the gemachtigde property.
     * 
     * @param value
     *     allowed object is
     *     {@link GemachtigdeType }
     *     
     */
    public void setGemachtigde(GemachtigdeType value) {
        this.gemachtigde = value;
    }

    /**
     * Gets the value of the overigeFunctionaris property.
     * 
     * @return
     *     possible object is
     *     {@link OverigeFunctionarisType }
     *     
     */
    public OverigeFunctionarisType getOverigeFunctionaris() {
        return overigeFunctionaris;
    }

    /**
     * Sets the value of the overigeFunctionaris property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverigeFunctionarisType }
     *     
     */
    public void setOverigeFunctionaris(OverigeFunctionarisType value) {
        this.overigeFunctionaris = value;
    }

    /**
     * Gets the value of the publiekrechtelijkeFunctionaris property.
     * 
     * @return
     *     possible object is
     *     {@link PubliekrechtelijkeFunctionarisType }
     *     
     */
    public PubliekrechtelijkeFunctionarisType getPubliekrechtelijkeFunctionaris() {
        return publiekrechtelijkeFunctionaris;
    }

    /**
     * Sets the value of the publiekrechtelijkeFunctionaris property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubliekrechtelijkeFunctionarisType }
     *     
     */
    public void setPubliekrechtelijkeFunctionaris(PubliekrechtelijkeFunctionarisType value) {
        this.publiekrechtelijkeFunctionaris = value;
    }

}
