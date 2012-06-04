
package com.mule_hotel.hotelservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roomType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="Presidential"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roomType")
@XmlEnum
public enum RoomType {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Presidential")
    PRESIDENTIAL("Presidential");
    private final String value;

    RoomType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoomType fromValue(String v) {
        for (RoomType c: RoomType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
