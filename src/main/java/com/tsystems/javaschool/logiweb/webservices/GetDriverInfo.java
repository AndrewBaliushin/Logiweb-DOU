
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDriverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDriverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriverEmployeeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDriverInfo", propOrder = {
    "driverEmployeeId"
})
public class GetDriverInfo {

    @XmlElement(name = "DriverEmployeeId")
    protected int driverEmployeeId;

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

}
