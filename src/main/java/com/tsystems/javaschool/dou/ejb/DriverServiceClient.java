package com.tsystems.javaschool.dou.ejb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.management.RuntimeErrorException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.tsystems.javaschool.logiweb.webservices.DriverWebService;

@Stateless
public class DriverServiceClient {

    public static final String SERVICE_URL = 
            "http://localhost:8080/logiweb/services/driver";

    public String test() {
        return "test ejb";
    }

    public DriverWebService getDriverWebServiceClient() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(DriverWebService.class);
        factory.setAddress(SERVICE_URL);
        DriverWebService client = (DriverWebService) factory.create();
        return client;
    }

    public void setStatusRestingForDriver(int driverEmployeeId) {
        System.out.println("setStatusRestingForDriver");
        DriverWebService client = getDriverWebServiceClient();
        client.setStatusRestingForDriver(driverEmployeeId);
    }

    public void setStatusDrivingForDriver(int driverEmployeeId) {
        System.out.println("setStatusDrivingForDriver");
        DriverWebService client = getDriverWebServiceClient();
        client.setStatusDrivingForDriver(driverEmployeeId);
    }

}
