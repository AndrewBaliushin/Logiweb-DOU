
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setStatusDeliveredForCargoAndFinilizeOrderIfPossible complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setStatusDeliveredForCargoAndFinilizeOrderIfPossible">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CargoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setStatusDeliveredForCargoAndFinilizeOrderIfPossible", propOrder = {
    "cargoId"
})
public class SetStatusDeliveredForCargoAndFinilizeOrderIfPossible {

    @XmlElement(name = "CargoId")
    protected int cargoId;

    /**
     * Gets the value of the cargoId property.
     * 
     */
    public int getCargoId() {
        return cargoId;
    }

    /**
     * Sets the value of the cargoId property.
     * 
     */
    public void setCargoId(int value) {
        this.cargoId = value;
    }

}
