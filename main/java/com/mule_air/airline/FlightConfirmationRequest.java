
package com.mule_air.airline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creditCardAuthorisationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "creditCardAuthorisationNumber"
})
@XmlRootElement(name = "FlightConfirmationRequest")
public class FlightConfirmationRequest {

    @XmlElement(required = true)
    protected String reservationNumber;
    @XmlElement(required = true)
    protected String creditCardAuthorisationNumber;

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
     * Gets the value of the creditCardAuthorisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardAuthorisationNumber() {
        return creditCardAuthorisationNumber;
    }

    /**
     * Sets the value of the creditCardAuthorisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardAuthorisationNumber(String value) {
        this.creditCardAuthorisationNumber = value;
    }

}
