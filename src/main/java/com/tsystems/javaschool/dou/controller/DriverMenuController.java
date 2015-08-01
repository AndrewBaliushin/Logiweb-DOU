package com.tsystems.javaschool.dou.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.tsystems.javaschool.dou.services.IDriverService;
import com.tsystems.javaschool.dou.services.qualifiers.RemoteServerClient;

@ManagedBean
@SessionScoped
public class DriverMenuController {

    @Inject
    @RemoteServerClient
    private IDriverService driverService;

    private int driverEmpoloyeeId;

    public int getDriverEmpoloyeeId() {
        return driverEmpoloyeeId;
    }

    public void setDriverEmpoloyeeId(int driverEmpoloyeeId) {
        this.driverEmpoloyeeId = driverEmpoloyeeId;
    }

    public String getDriverInfo() {
        return driverService.getDriverInfo(driverEmpoloyeeId);
    }
}
