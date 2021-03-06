
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="driverStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_AVAILABLE"/>
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="DRIVING"/>
 *     &lt;enumeration value="RESTING_EN_ROUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "driverStatus")
@XmlEnum
public enum DriverStatus {

    NOT_AVAILABLE,
    FREE,
    DRIVING,
    RESTING_EN_ROUT;

    public String value() {
        return name();
    }

    public static DriverStatus fromValue(String v) {
        return valueOf(v);
    }

}
