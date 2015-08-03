package com.tsystems.javaschool.dou.services;

import com.tsystems.javaschool.logiweb.webservices.DriverInfo;

public interface IDriverService {

    public void setStatusRestingForDriver(int driverEmployeeId);

    public void setStatusDrivingForDriver(int driverEmployeeId);
    
    public void setStatusDeliveredForCargoAndFinilizeOrderIfPossible(int cargoId);
    
    public void setStatusPickedUpForCargo(int cargoId);

    public DriverInfo getDriverInfo(int driverEmployeeId);
    
    /**
     * Start new shift.
     * @param driverEmployeeId
     * @throws IllegalStateException if shift is already started.
     */
    public void startDriverShift(int driverEmployeeId) throws IllegalStateException ;
    
    /**
     * End current shift.
     * @param driverEmployeeId
     * @throws IllegalStateException if there is no unfinished shift.
     */
    public void endDriverShift(int driverEmployeeId) throws IllegalStateException ;

}