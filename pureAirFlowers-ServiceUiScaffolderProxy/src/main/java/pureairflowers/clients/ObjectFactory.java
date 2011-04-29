
package pureairflowers.clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pureairflowers.clients package. 
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

    private final static QName _GetOrdersNumber_QNAME = new QName("http://clients.PureAirFlowers/", "getOrdersNumber");
    private final static QName _GetOrdersNumberResponse_QNAME = new QName("http://clients.PureAirFlowers/", "getOrdersNumberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pureairflowers.clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrdersNumberResponse }
     * 
     */
    public GetOrdersNumberResponse createGetOrdersNumberResponse() {
        return new GetOrdersNumberResponse();
    }

    /**
     * Create an instance of {@link GetOrdersNumber }
     * 
     */
    public GetOrdersNumber createGetOrdersNumber() {
        return new GetOrdersNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.PureAirFlowers/", name = "getOrdersNumber")
    public JAXBElement<GetOrdersNumber> createGetOrdersNumber(GetOrdersNumber value) {
        return new JAXBElement<GetOrdersNumber>(_GetOrdersNumber_QNAME, GetOrdersNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clients.PureAirFlowers/", name = "getOrdersNumberResponse")
    public JAXBElement<GetOrdersNumberResponse> createGetOrdersNumberResponse(GetOrdersNumberResponse value) {
        return new JAXBElement<GetOrdersNumberResponse>(_GetOrdersNumberResponse_QNAME, GetOrdersNumberResponse.class, null, value);
    }

}