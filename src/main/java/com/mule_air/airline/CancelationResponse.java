
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
 *         &lt;element name="cancelationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "cancelationNumber"
})
@XmlRootElement(name = "CancelationResponse")
public class CancelationResponse {

    @XmlElement(required = true)
    protected String cancelationNumber;

    /**
     * Gets the value of the cancelationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelationNumber() {
        return cancelationNumber;
    }

    /**
     * Sets the value of the cancelationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelationNumber(String value) {
        this.cancelationNumber = value;
    }

}
