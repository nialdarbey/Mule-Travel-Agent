
package com.mule_air.airline;

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
 *         &lt;element name="seatCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="departing" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="returning" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="travelAgentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "seatCount",
    "departing",
    "returning",
    "from",
    "to",
    "travelAgentId"
})
@XmlRootElement(name = "FlightReservationRequest")
public class FlightReservationRequest {

    @XmlElement(required = true)
    protected BigInteger seatCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date departing;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date returning;
    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String travelAgentId;

    /**
     * Gets the value of the seatCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatCount() {
        return seatCount;
    }

    /**
     * Sets the value of the seatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatCount(BigInteger value) {
        this.seatCount = value;
    }

    /**
     * Gets the value of the departing property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeparting() {
        return departing;
    }

    /**
     * Sets the value of the departing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeparting(Date value) {
        this.departing = value;
    }

    /**
     * Gets the value of the returning property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getReturning() {
        return returning;
    }

    /**
     * Sets the value of the returning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setReturning(Date value) {
        this.returning = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
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

}
