
package com.tsystems.javaschool.logiweb.webservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationWithCargo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operationWithCargo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PICKUP"/>
 *     &lt;enumeration value="DELIVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "operationWithCargo")
@XmlEnum
public enum OperationWithCargo {

    PICKUP,
    DELIVER;

    public String value() {
        return name();
    }

    public static OperationWithCargo fromValue(String v) {
        return valueOf(v);
    }

}
