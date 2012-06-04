
package com.mule_travel.travelagent;

import java.math.BigInteger;
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
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="nights" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="roomPreference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "beginDate",
    "nights",
    "roomPreference",
    "fromCity",
    "toCity",
    "userId"
})
@XmlRootElement(name = "TravelRequest")
public class TravelRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(required = true)
    protected BigInteger nights;
    @XmlElement(required = true)
    protected String roomPreference;
    @XmlElement(required = true)
    protected String fromCity;
    @XmlElement(required = true)
    protected String toCity;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the nights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNights(BigInteger value) {
        this.nights = value;
    }

    /**
     * Gets the value of the roomPreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomPreference() {
        return roomPreference;
    }

    /**
     * Sets the value of the roomPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomPreference(String value) {
        this.roomPreference = value;
    }

    /**
     * Gets the value of the fromCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCity() {
        return fromCity;
    }

    /**
     * Sets the value of the fromCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCity(String value) {
        this.fromCity = value;
    }

    /**
     * Gets the value of the toCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCity() {
        return toCity;
    }

    /**
     * Sets the value of the toCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCity(String value) {
        this.toCity = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
