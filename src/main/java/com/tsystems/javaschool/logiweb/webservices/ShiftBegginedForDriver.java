
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shiftBegginedForDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shiftBegginedForDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverEmployeeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBehindWheel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shiftBegginedForDriver", propOrder = {
    "driverEmployeeId",
    "isBehindWheel"
})
public class ShiftBegginedForDriver {

    @XmlElement(name = "DriverEmployeeId")
    protected int driverEmployeeId;
    @XmlElement(name = "IsBehindWheel")
    protected boolean isBehindWheel;

    /**
     * Gets the value of the driverEmployeeId property.
     * 
     */
    public int getDriverEmployeeId() {
        return driverEmployeeId;
    }

    /**
     * Sets the value of the driverEmployeeId property.
     * 
     */
    public void setDriverEmployeeId(int value) {
        this.driverEmployeeId = value;
    }

    /**
     * Gets the value of the isBehindWheel property.
     * 
     */
    public boolean isIsBehindWheel() {
        return isBehindWheel;
    }

    /**
     * Sets the value of the isBehindWheel property.
     * 
     */
    public void setIsBehindWheel(boolean value) {
        this.isBehindWheel = value;
    }

}
