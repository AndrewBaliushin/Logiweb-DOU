package com.tsystems.javaschool.dou.controller;

import javax.ejb.EJB;
import javax.inject.Named;

import com.tsystems.javaschool.dou.ejb.DriverServiceClient;

@Named("driverMenu")
public class DriverMenuController {

    @EJB
    private DriverServiceClient driverServiceClient;
    
    public String test() {
        driverServiceClient.setStatusDrivingForDriver(1);
        return driverServiceClient.test();
    }
    
    public void testSoap() {
        driverServiceClient.setStatusDrivingForDriver(1);
    }

}
