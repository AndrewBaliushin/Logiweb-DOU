package com.tsystems.javaschool.dou.ejb;

import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.tsystems.javaschool.logiweb.webservices.DriverWebService;

@Stateless
public class DriverServiceClient {

    public static final String SERVICE_URL = 
            "http://localhost:8080/logiweb/services/driver";

    private DriverWebService getDriverWebServiceClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(SERVICE_URL);
        DriverWebService client = (DriverWebService) factory.create();
        return client;
    }

    public void setStatusRestingForDriver(int driverEmployeeId) {
        DriverWebService client = getDriverWebServiceClient();
        client.setStatusRestingForDriver(driverEmployeeId);
    }

    public void setStatusDrivingForDriver(int driverEmployeeId) {
        DriverWebService client = getDriverWebServiceClient();
        client.setStatusDrivingForDriver(driverEmployeeId);
    }
    
    public String getDriverInfo(int driverEmployeeId) {
        if (driverEmployeeId == 0) return "";
        
        DriverWebService client = getDriverWebServiceClient();
        return client.getDriverInfo(driverEmployeeId);
    }

}
