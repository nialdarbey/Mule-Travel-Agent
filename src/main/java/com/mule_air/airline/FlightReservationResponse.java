
package com.mule_air.airline;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "reservationNumber",
    "expiryDate",
    "price"
})
@XmlRootElement(name = "FlightReservationResponse")
public class FlightReservationResponse implements Serializable {

    @XmlElement(required = true)
    protected String reservationNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected Date expiryDate;
    protected float price;

    /**
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(Date value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

}
