package com.tsystems.javaschool.dou.ejb;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.ws.WebServiceRef;

import com.tsystems.javaschool.logiweb.webservices.WsDriver;
import com.tsystems.javaschool.logiweb.webservices.WsDriverImplService;

@ApplicationScoped
public class DriverServiceClient {

    public static final String SERVICE_URL = 
            "http://localhost:8080/logiweb/services/driver?wsdl";
    
    @WebServiceRef(wsdlLocation = SERVICE_URL)
    private static WsDriverImplService service;
    
    
//    private DriverWebService getDriverWebServiceClient() {
//        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//        factory.setServiceClass(DriverWebService.class);
//        factory.setAddress(SERVICE_URL);
//        DriverWebService client = (DriverWebService) factory.create();
//        return client;
//    }

    public void setStatusRestingForDriver(int driverEmployeeId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusRestingForDriver(driverEmployeeId);
    }

    public void setStatusDrivingForDriver(int driverEmployeeId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusDrivingForDriver(driverEmployeeId);
    }
    
    public String getDriverInfo(int driverEmployeeId) {
        if (driverEmployeeId == 0) return "Haha";
        
//        WsDriverImplService service = new WsDriverImplService();
        WsDriver driverWebService = service.getWsDriverImplPort();
        return driverWebService.getDriverInfo(driverEmployeeId);
    }

}
