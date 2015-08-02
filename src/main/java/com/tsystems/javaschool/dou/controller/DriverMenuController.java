package com.tsystems.javaschool.dou.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.tsystems.javaschool.dou.services.IDriverService;
import com.tsystems.javaschool.dou.services.qualifiers.RemoteServerClient;
import com.tsystems.javaschool.logiweb.webservices.CargoStatus;
import com.tsystems.javaschool.logiweb.webservices.DriverInfo;
import com.tsystems.javaschool.logiweb.webservices.DriverStatus;
import com.tsystems.javaschool.logiweb.webservices.Waypoint;

@ManagedBean
@SessionScoped
public class DriverMenuController {

    @Inject
    @RemoteServerClient
    private IDriverService driverService;

    private int driverEmpoloyeeId;
    
    private DriverInfo driverInfo;

    public int getDriverEmpoloyeeId() {
        return driverEmpoloyeeId;
    }

    public void setDriverEmpoloyeeId(int driverEmpoloyeeId) {
        this.driverEmpoloyeeId = driverEmpoloyeeId;
    }
    
    public String initDriverInfo() {
        driverInfo = driverService.getDriverInfo(driverEmpoloyeeId);   
        return "driverMenu?faces-redirect=true";
    }
    
    public DriverInfo getDriverInfo() {
            return driverInfo;
    }
    
    public void setStatusDrivingForDriver() {
        driverService.setStatusDrivingForDriver(driverInfo.getEmployeeId());
        driverInfo.setCutrrentStatus(DriverStatus.DRIVING);
    }
    
    public void setStatusRestingForDriver() {
        driverService.setStatusRestingForDriver(driverInfo.getEmployeeId());
        driverInfo.setCutrrentStatus(DriverStatus.RESTING_EN_ROUT);
    }
    
    public void setStatusDeliveredForCargoAndFinilizeOrderIfPossible(int cargoId) {
        setStatusToCargo(cargoId, CargoStatus.DELIVERED);        
        driverService.setStatusDeliveredForCargoAndFinilizeOrderIfPossible(cargoId);
    }
    
    public void setStatusPickedUpForCargo(int cargoId) {
        setStatusToCargo(cargoId, CargoStatus.PICKED_UP);        
        driverService.setStatusPickedUpForCargo(cargoId);
    }
    
    private void setStatusToCargo(int cargoId, CargoStatus newStatus) {
        List<Waypoint> waypoints = driverInfo.getRouteInformation()
                .getBestOrderOfDelivery();
        for (Waypoint w : waypoints) {
            if (w.getCargo().getId() == cargoId) w.getCargo().setStatus(newStatus);
        }
    }
    
}
