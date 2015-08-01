package com.tsystems.javaschool.dou.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.ws.WebServiceRef;

import com.tsystems.javaschool.dou.cdi.qualifiers.RemoteServerClient;
import com.tsystems.javaschool.logiweb.webservices.WsDriver;
import com.tsystems.javaschool.logiweb.webservices.WsDriverImplService;

@ApplicationScoped
@RemoteServerClient
public class DriverServiceRemoteClient implements IDriverService {

    public static final String SERVICE_URL = 
            "http://localhost:8080/logiweb/services/driver?wsdl";
    
    @WebServiceRef(wsdlLocation = SERVICE_URL)
    private static WsDriverImplService service;

    @Override
    public void setStatusRestingForDriver(int driverEmployeeId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusRestingForDriver(driverEmployeeId);
    }

    @Override
    public void setStatusDrivingForDriver(int driverEmployeeId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusDrivingForDriver(driverEmployeeId);
    }
    
    @Override
    public String getDriverInfo(int driverEmployeeId) {
        if (driverEmployeeId == 0) return "";
        
        WsDriver driverWebService = service.getWsDriverImplPort();
        return driverWebService.getDriverInfo(driverEmployeeId);
    }

}
