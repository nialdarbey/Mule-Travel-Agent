
package com.mule_credit.creditcardservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mule_credit.creditcardservice package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mule_credit.creditcardservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link CancelationRequest }
     * 
     */
    public CancelationRequest createCancelationRequest() {
        return new CancelationRequest();
    }

    /**
     * Create an instance of {@link CancelationResponse }
     * 
     */
    public CancelationResponse createCancelationResponse() {
        return new CancelationResponse();
    }

}
