
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waypoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waypoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cargo" type="{http://webservices.logiweb.javaschool.tsystems.com/}cargo" minOccurs="0"/>
 *         &lt;element name="city" type="{http://webservices.logiweb.javaschool.tsystems.com/}city" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://webservices.logiweb.javaschool.tsystems.com/}operationWithCargo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waypoint", propOrder = {
    "cargo",
    "city",
    "operation"
})
public class Waypoint {

    protected Cargo cargo;
    protected City city;
    protected OperationWithCargo operation;

    /**
     * Gets the value of the cargo property.
     * 
     * @return
     *     possible object is
     *     {@link Cargo }
     *     
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cargo }
     *     
     */
    public void setCargo(Cargo value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationWithCargo }
     *     
     */
    public OperationWithCargo getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationWithCargo }
     *     
     */
    public void setOperation(OperationWithCargo value) {
        this.operation = value;
    }

}
