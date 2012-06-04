
package com.mule_hotel.hotelservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mule_hotel.hotelservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mule_hotel.hotelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AvailabilityRequest }
     * 
     */
    public AvailabilityRequest createAvailabilityRequest() {
        return new AvailabilityRequest();
    }

    /**
     * Create an instance of {@link AvailabilityResponse }
     * 
     */
    public AvailabilityResponse createAvailabilityResponse() {
        return new AvailabilityResponse();
    }

    /**
     * Create an instance of {@link ConfirmationRequest }
     * 
     */
    public ConfirmationRequest createConfirmationRequest() {
        return new ConfirmationRequest();
    }

    /**
     * Create an instance of {@link AvailabilityResponse.Room }
     * 
     */
    public AvailabilityResponse.Room createAvailabilityResponseRoom() {
        return new AvailabilityResponse.Room();
    }

    /**
     * Create an instance of {@link ConfirmationResponse }
     * 
     */
    public ConfirmationResponse createConfirmationResponse() {
        return new ConfirmationResponse();
    }

}
