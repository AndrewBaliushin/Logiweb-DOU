
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cutrrentStatus" type="{http://webservices.logiweb.javaschool.tsystems.com/}driverStatus" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="routeInformation" type="{http://webservices.logiweb.javaschool.tsystems.com/}routeInformation" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingHoursInThisMonth" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driverInfo", propOrder = {
    "cutrrentStatus",
    "employeeId",
    "name",
    "routeInformation",
    "surname",
    "workingHoursInThisMonth"
})
public class DriverInfo {

    protected DriverStatus cutrrentStatus;
    protected int employeeId;
    protected String name;
    protected RouteInformation routeInformation;
    protected String surname;
    protected float workingHoursInThisMonth;

    /**
     * Gets the value of the cutrrentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DriverStatus }
     *     
     */
    public DriverStatus getCutrrentStatus() {
        return cutrrentStatus;
    }

    /**
     * Sets the value of the cutrrentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverStatus }
     *     
     */
    public void setCutrrentStatus(DriverStatus value) {
        this.cutrrentStatus = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     */
    public void setEmployeeId(int value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the routeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RouteInformation }
     *     
     */
    public RouteInformation getRouteInformation() {
        return routeInformation;
    }

    /**
     * Sets the value of the routeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteInformation }
     *     
     */
    public void setRouteInformation(RouteInformation value) {
        this.routeInformation = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the workingHoursInThisMonth property.
     * 
     */
    public float getWorkingHoursInThisMonth() {
        return workingHoursInThisMonth;
    }

    /**
     * Sets the value of the workingHoursInThisMonth property.
     * 
     */
    public void setWorkingHoursInThisMonth(float value) {
        this.workingHoursInThisMonth = value;
    }

}
