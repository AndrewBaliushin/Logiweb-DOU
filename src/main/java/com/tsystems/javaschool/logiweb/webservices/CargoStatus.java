
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cargoStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cargoStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAITING_FOR_PICKUP"/>
 *     &lt;enumeration value="PICKED_UP"/>
 *     &lt;enumeration value="DELIVERED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cargoStatus")
@XmlEnum
public enum CargoStatus {

    WAITING_FOR_PICKUP,
    PICKED_UP,
    DELIVERED;

    public String value() {
        return name();
    }

    public static CargoStatus fromValue(String v) {
        return valueOf(v);
    }

}
