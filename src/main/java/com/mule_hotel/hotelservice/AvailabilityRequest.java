
package com.mule_hotel.hotelservice;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="numberOfNights" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="travelAgentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startDate",
    "numberOfNights",
    "travelAgentId",
    "city"
})
@XmlRootElement(name = "AvailabilityRequest")
public class AvailabilityRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date startDate;
    @XmlElement(required = true)
    protected BigInteger numberOfNights;
    @XmlElement(required = true)
    protected String travelAgentId;
    @XmlElement(required = true)
    protected String city;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfNights(BigInteger value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the travelAgentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelAgentId() {
        return travelAgentId;
    }

    /**
     * Sets the value of the travelAgentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelAgentId(String value) {
        this.travelAgentId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

}
