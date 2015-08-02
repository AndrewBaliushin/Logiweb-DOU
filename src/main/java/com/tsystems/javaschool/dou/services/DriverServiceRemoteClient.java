package com.tsystems.javaschool.dou.services;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.ws.WebServiceRef;

import com.tsystems.javaschool.dou.services.qualifiers.RemoteServerClient;
import com.tsystems.javaschool.logiweb.webservices.DriverInfo;
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
    public void setStatusDeliveredForCargoAndFinilizeOrderIfPossible(int cargoId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusDeliveredForCargoAndFinilizeOrderIfPossible(cargoId);        
    }

    @Override
    public void setStatusPickedUpForCargo(int cargoId) {
        WsDriver driverWebService = service.getWsDriverImplPort();
        driverWebService.setStatusPickedUpForCargo(cargoId);        
    }

    @Override
    public DriverInfo getDriverInfo(int driverEmployeeId) {
        if (driverEmployeeId == 0) return null;
        
        WsDriver driverWebService = service.getWsDriverImplPort();
        return driverWebService.getDriverInfo(driverEmployeeId);
    }
    
    

}
