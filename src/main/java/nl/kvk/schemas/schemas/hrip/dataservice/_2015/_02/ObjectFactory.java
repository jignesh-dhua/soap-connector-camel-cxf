
package nl.kvk.schemas.schemas.hrip.dataservice._2015._02;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.kvk.schemas.schemas.hrip.dataservice._2015._02 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OphalenInschrijvingResponse_QNAME = new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "ophalenInschrijvingResponse");
    private final static QName _OphalenInschrijvingRequest_QNAME = new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "ophalenInschrijvingRequest");
    private final static QName _OphalenVestigingRequest_QNAME = new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "ophalenVestigingRequest");
    private final static QName _OphalenVestigingResponse_QNAME = new QName("http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", "ophalenVestigingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.kvk.schemas.schemas.hrip.dataservice._2015._02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link MaatschappelijkeActiviteitResponseType }
     * 
     */
    public MaatschappelijkeActiviteitResponseType createMaatschappelijkeActiviteitResponseType() {
        return new MaatschappelijkeActiviteitResponseType();
    }

    /**
     * Create an instance of {@link VestigingResponseType }
     * 
     */
    public VestigingResponseType createVestigingResponseType() {
        return new VestigingResponseType();
    }

    /**
     * Create an instance of {@link InschrijvingRequestType }
     * 
     */
    public InschrijvingRequestType createInschrijvingRequestType() {
        return new InschrijvingRequestType();
    }

    /**
     * Create an instance of {@link VestigingRequestType }
     * 
     */
    public VestigingRequestType createVestigingRequestType() {
        return new VestigingRequestType();
    }

    /**
     * Create an instance of {@link InschrijvingResponseType }
     * 
     */
    public InschrijvingResponseType createInschrijvingResponseType() {
        return new InschrijvingResponseType();
    }

    /**
     * Create an instance of {@link KvKNummerOfRSINummerRequestType }
     * 
     */
    public KvKNummerOfRSINummerRequestType createKvKNummerOfRSINummerRequestType() {
        return new KvKNummerOfRSINummerRequestType();
    }

    /**
     * Create an instance of {@link MeldingType }
     * 
     */
    public MeldingType createMeldingType() {
        return new MeldingType();
    }

    /**
     * Create an instance of {@link VestigingOfRsinOfKvKNummerRequestType }
     * 
     */
    public VestigingOfRsinOfKvKNummerRequestType createVestigingOfRsinOfKvKNummerRequestType() {
        return new VestigingOfRsinOfKvKNummerRequestType();
    }

    /**
     * Create an instance of {@link ProductRequestType }
     * 
     */
    public ProductRequestType createProductRequestType() {
        return new ProductRequestType();
    }

    /**
     * Create an instance of {@link VestigingsnummerRequestType }
     * 
     */
    public VestigingsnummerRequestType createVestigingsnummerRequestType() {
        return new VestigingsnummerRequestType();
    }

    /**
     * Create an instance of {@link KvKNummerRequestType }
     * 
     */
    public KvKNummerRequestType createKvKNummerRequestType() {
        return new KvKNummerRequestType();
    }

    /**
     * Create an instance of {@link ResponseType.Meldingen }
     * 
     */
    public ResponseType.Meldingen createResponseTypeMeldingen() {
        return new ResponseType.Meldingen();
    }

    /**
     * Create an instance of {@link MaatschappelijkeActiviteitResponseType.Product }
     * 
     */
    public MaatschappelijkeActiviteitResponseType.Product createMaatschappelijkeActiviteitResponseTypeProduct() {
        return new MaatschappelijkeActiviteitResponseType.Product();
    }

    /**
     * Create an instance of {@link VestigingResponseType.Product }
     * 
     */
    public VestigingResponseType.Product createVestigingResponseTypeProduct() {
        return new VestigingResponseType.Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InschrijvingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", name = "ophalenInschrijvingResponse")
    public JAXBElement<InschrijvingResponseType> createOphalenInschrijvingResponse(InschrijvingResponseType value) {
        return new JAXBElement<InschrijvingResponseType>(_OphalenInschrijvingResponse_QNAME, InschrijvingResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InschrijvingRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", name = "ophalenInschrijvingRequest")
    public JAXBElement<InschrijvingRequestType> createOphalenInschrijvingRequest(InschrijvingRequestType value) {
        return new JAXBElement<InschrijvingRequestType>(_OphalenInschrijvingRequest_QNAME, InschrijvingRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VestigingRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", name = "ophalenVestigingRequest")
    public JAXBElement<VestigingRequestType> createOphalenVestigingRequest(VestigingRequestType value) {
        return new JAXBElement<VestigingRequestType>(_OphalenVestigingRequest_QNAME, VestigingRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VestigingResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.kvk.nl/schemas/hrip/dataservice/2015/02", name = "ophalenVestigingResponse")
    public JAXBElement<VestigingResponseType> createOphalenVestigingResponse(VestigingResponseType value) {
        return new JAXBElement<VestigingResponseType>(_OphalenVestigingResponse_QNAME, VestigingResponseType.class, null, value);
    }

}
