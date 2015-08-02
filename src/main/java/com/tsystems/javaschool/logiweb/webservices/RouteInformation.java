
package com.tsystems.javaschool.logiweb.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for routeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bestOrderOfDelivery" type="{http://webservices.logiweb.javaschool.tsystems.com/}waypoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedTime" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxWeightOnCourse" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeInformation", propOrder = {
    "bestOrderOfDelivery",
    "estimatedTime",
    "maxWeightOnCourse"
})
public class RouteInformation {

    @XmlElement(nillable = true)
    protected List<Waypoint> bestOrderOfDelivery;
    protected float estimatedTime;
    protected float maxWeightOnCourse;

    /**
     * Gets the value of the bestOrderOfDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bestOrderOfDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBestOrderOfDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Waypoint }
     * 
     * 
     */
    public List<Waypoint> getBestOrderOfDelivery() {
        if (bestOrderOfDelivery == null) {
            bestOrderOfDelivery = new ArrayList<Waypoint>();
        }
        return this.bestOrderOfDelivery;
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     */
    public float getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     */
    public void setEstimatedTime(float value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the maxWeightOnCourse property.
     * 
     */
    public float getMaxWeightOnCourse() {
        return maxWeightOnCourse;
    }

    /**
     * Sets the value of the maxWeightOnCourse property.
     * 
     */
    public void setMaxWeightOnCourse(float value) {
        this.maxWeightOnCourse = value;
    }

}
