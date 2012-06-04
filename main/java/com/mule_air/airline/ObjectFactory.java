
package com.mule_air.airline;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mule_air.airline package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mule_air.airline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightReservationResponse }
     * 
     */
    public FlightReservationResponse createFlightReservationResponse() {
        return new FlightReservationResponse();
    }

    /**
     * Create an instance of {@link FlightConfirmationResponse }
     * 
     */
    public FlightConfirmationResponse createFlightConfirmationResponse() {
        return new FlightConfirmationResponse();
    }

    /**
     * Create an instance of {@link FlightReservationRequest }
     * 
     */
    public FlightReservationRequest createFlightReservationRequest() {
        return new FlightReservationRequest();
    }

    /**
     * Create an instance of {@link FlightConfirmationRequest }
     * 
     */
    public FlightConfirmationRequest createFlightConfirmationRequest() {
        return new FlightConfirmationRequest();
    }

}
