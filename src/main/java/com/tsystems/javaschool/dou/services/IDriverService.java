package com.tsystems.javaschool.dou.services;

import com.tsystems.javaschool.logiweb.webservices.DriverInfo;

public interface IDriverService {

    public void setStatusRestingForDriver(int driverEmployeeId);

    public void setStatusDrivingForDriver(int driverEmployeeId);
    
    public void setStatusDeliveredForCargoAndFinilizeOrderIfPossible(int cargoId);
    
    public void setStatusPickedUpForCargo(int cargoId);

    public DriverInfo getDriverInfo(int driverEmployeeId);

}