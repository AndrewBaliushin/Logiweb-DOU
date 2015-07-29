package com.tsystems.javaschool.dou.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.tsystems.javaschool.dou.ejb.DriverServiceClient;

@ManagedBean
@RequestScoped
public class DriverMenuController {

    @EJB
    private DriverServiceClient driverServiceClient;
    
    private int driverEmpoloyeeId;
    
    public int getDriverEmpoloyeeId() {
        return driverEmpoloyeeId;
    }

    public void setDriverEmpoloyeeId(int driverEmpoloyeeId) {
        this.driverEmpoloyeeId = driverEmpoloyeeId;
    }
    
    public String getDriverInfo() {
        return driverServiceClient.getDriverInfo(driverEmpoloyeeId);
    }
}
