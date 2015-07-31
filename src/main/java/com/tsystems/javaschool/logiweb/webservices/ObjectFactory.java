
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tsystems.javaschool.logiweb.webservices package. 
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

    private final static QName _SetStatusDrivingForDriver_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusDrivingForDriver");
    private final static QName _SetStatusRestingForDriverResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusRestingForDriverResponse");
    private final static QName _SetStatusDeliveredForCargoAndFinilizeOrderIfPossible_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusDeliveredForCargoAndFinilizeOrderIfPossible");
    private final static QName _SetStatusPickedUpForCargo_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusPickedUpForCargo");
    private final static QName _GetDriverInfoResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "getDriverInfoResponse");
    private final static QName _GetDriverInfo_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "getDriverInfo");
    private final static QName _ShiftBegginedForDriver_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "shiftBegginedForDriver");
    private final static QName _SetStatusDrivingForDriverResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusDrivingForDriverResponse");
    private final static QName _SetStatusPickedUpForCargoResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusPickedUpForCargoResponse");
    private final static QName _SetStatusRestingForDriver_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusRestingForDriver");
    private final static QName _ShiftBegginedForDriverResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "shiftBegginedForDriverResponse");
    private final static QName _SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse_QNAME = new QName("http://webservices.logiweb.javaschool.tsystems.com/", "setStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tsystems.javaschool.logiweb.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetStatusPickedUpForCargo }
     * 
     */
    public SetStatusPickedUpForCargo createSetStatusPickedUpForCargo() {
        return new SetStatusPickedUpForCargo();
    }

    /**
     * Create an instance of {@link SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse }
     * 
     */
    public SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse createSetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse() {
        return new SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse();
    }

    /**
     * Create an instance of {@link SetStatusDrivingForDriver }
     * 
     */
    public SetStatusDrivingForDriver createSetStatusDrivingForDriver() {
        return new SetStatusDrivingForDriver();
    }

    /**
     * Create an instance of {@link SetStatusRestingForDriverResponse }
     * 
     */
    public SetStatusRestingForDriverResponse createSetStatusRestingForDriverResponse() {
        return new SetStatusRestingForDriverResponse();
    }

    /**
     * Create an instance of {@link SetStatusPickedUpForCargoResponse }
     * 
     */
    public SetStatusPickedUpForCargoResponse createSetStatusPickedUpForCargoResponse() {
        return new SetStatusPickedUpForCargoResponse();
    }

    /**
     * Create an instance of {@link SetStatusDeliveredForCargoAndFinilizeOrderIfPossible }
     * 
     */
    public SetStatusDeliveredForCargoAndFinilizeOrderIfPossible createSetStatusDeliveredForCargoAndFinilizeOrderIfPossible() {
        return new SetStatusDeliveredForCargoAndFinilizeOrderIfPossible();
    }

    /**
     * Create an instance of {@link ShiftBegginedForDriver }
     * 
     */
    public ShiftBegginedForDriver createShiftBegginedForDriver() {
        return new ShiftBegginedForDriver();
    }

    /**
     * Create an instance of {@link SetStatusDrivingForDriverResponse }
     * 
     */
    public SetStatusDrivingForDriverResponse createSetStatusDrivingForDriverResponse() {
        return new SetStatusDrivingForDriverResponse();
    }

    /**
     * Create an instance of {@link SetStatusRestingForDriver }
     * 
     */
    public SetStatusRestingForDriver createSetStatusRestingForDriver() {
        return new SetStatusRestingForDriver();
    }

    /**
     * Create an instance of {@link GetDriverInfoResponse }
     * 
     */
    public GetDriverInfoResponse createGetDriverInfoResponse() {
        return new GetDriverInfoResponse();
    }

    /**
     * Create an instance of {@link GetDriverInfo }
     * 
     */
    public GetDriverInfo createGetDriverInfo() {
        return new GetDriverInfo();
    }

    /**
     * Create an instance of {@link ShiftBegginedForDriverResponse }
     * 
     */
    public ShiftBegginedForDriverResponse createShiftBegginedForDriverResponse() {
        return new ShiftBegginedForDriverResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusDrivingForDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusDrivingForDriver")
    public JAXBElement<SetStatusDrivingForDriver> createSetStatusDrivingForDriver(SetStatusDrivingForDriver value) {
        return new JAXBElement<SetStatusDrivingForDriver>(_SetStatusDrivingForDriver_QNAME, SetStatusDrivingForDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusRestingForDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusRestingForDriverResponse")
    public JAXBElement<SetStatusRestingForDriverResponse> createSetStatusRestingForDriverResponse(SetStatusRestingForDriverResponse value) {
        return new JAXBElement<SetStatusRestingForDriverResponse>(_SetStatusRestingForDriverResponse_QNAME, SetStatusRestingForDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusDeliveredForCargoAndFinilizeOrderIfPossible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusDeliveredForCargoAndFinilizeOrderIfPossible")
    public JAXBElement<SetStatusDeliveredForCargoAndFinilizeOrderIfPossible> createSetStatusDeliveredForCargoAndFinilizeOrderIfPossible(SetStatusDeliveredForCargoAndFinilizeOrderIfPossible value) {
        return new JAXBElement<SetStatusDeliveredForCargoAndFinilizeOrderIfPossible>(_SetStatusDeliveredForCargoAndFinilizeOrderIfPossible_QNAME, SetStatusDeliveredForCargoAndFinilizeOrderIfPossible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusPickedUpForCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusPickedUpForCargo")
    public JAXBElement<SetStatusPickedUpForCargo> createSetStatusPickedUpForCargo(SetStatusPickedUpForCargo value) {
        return new JAXBElement<SetStatusPickedUpForCargo>(_SetStatusPickedUpForCargo_QNAME, SetStatusPickedUpForCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "getDriverInfoResponse")
    public JAXBElement<GetDriverInfoResponse> createGetDriverInfoResponse(GetDriverInfoResponse value) {
        return new JAXBElement<GetDriverInfoResponse>(_GetDriverInfoResponse_QNAME, GetDriverInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "getDriverInfo")
    public JAXBElement<GetDriverInfo> createGetDriverInfo(GetDriverInfo value) {
        return new JAXBElement<GetDriverInfo>(_GetDriverInfo_QNAME, GetDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftBegginedForDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "shiftBegginedForDriver")
    public JAXBElement<ShiftBegginedForDriver> createShiftBegginedForDriver(ShiftBegginedForDriver value) {
        return new JAXBElement<ShiftBegginedForDriver>(_ShiftBegginedForDriver_QNAME, ShiftBegginedForDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusDrivingForDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusDrivingForDriverResponse")
    public JAXBElement<SetStatusDrivingForDriverResponse> createSetStatusDrivingForDriverResponse(SetStatusDrivingForDriverResponse value) {
        return new JAXBElement<SetStatusDrivingForDriverResponse>(_SetStatusDrivingForDriverResponse_QNAME, SetStatusDrivingForDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusPickedUpForCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusPickedUpForCargoResponse")
    public JAXBElement<SetStatusPickedUpForCargoResponse> createSetStatusPickedUpForCargoResponse(SetStatusPickedUpForCargoResponse value) {
        return new JAXBElement<SetStatusPickedUpForCargoResponse>(_SetStatusPickedUpForCargoResponse_QNAME, SetStatusPickedUpForCargoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusRestingForDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusRestingForDriver")
    public JAXBElement<SetStatusRestingForDriver> createSetStatusRestingForDriver(SetStatusRestingForDriver value) {
        return new JAXBElement<SetStatusRestingForDriver>(_SetStatusRestingForDriver_QNAME, SetStatusRestingForDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShiftBegginedForDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "shiftBegginedForDriverResponse")
    public JAXBElement<ShiftBegginedForDriverResponse> createShiftBegginedForDriverResponse(ShiftBegginedForDriverResponse value) {
        return new JAXBElement<ShiftBegginedForDriverResponse>(_ShiftBegginedForDriverResponse_QNAME, ShiftBegginedForDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.logiweb.javaschool.tsystems.com/", name = "setStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse")
    public JAXBElement<SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse> createSetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse(SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse value) {
        return new JAXBElement<SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse>(_SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse_QNAME, SetStatusDeliveredForCargoAndFinilizeOrderIfPossibleResponse.class, null, value);
    }

}
