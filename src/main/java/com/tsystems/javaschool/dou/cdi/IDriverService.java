package com.tsystems.javaschool.dou.cdi;

public interface IDriverService {

    public void setStatusRestingForDriver(int driverEmployeeId);

    public void setStatusDrivingForDriver(int driverEmployeeId);

    public String getDriverInfo(int driverEmployeeId);

}