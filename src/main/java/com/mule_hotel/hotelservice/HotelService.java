package com.mule_hotel.hotelservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2012-05-24T10:33:10.922-03:00
 * Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://www.mule-hotel.com/HotelService/", name = "HotelService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelService {

    @WebResult(name = "ConfirmationResponse", targetNamespace = "http://www.mule-hotel.com/HotelService/", partName = "parameters")
    @WebMethod(action = "http://www.mule-hotel.com/HotelService/confirmRoom")
    public ConfirmationResponse confirmRoom(
        @WebParam(partName = "parameters", name = "ConfirmationRequest", targetNamespace = "http://www.mule-hotel.com/HotelService/")
        ConfirmationRequest parameters
    );

    @WebResult(name = "AvailabilityResponse", targetNamespace = "http://www.mule-hotel.com/HotelService/", partName = "parameters")
    @WebMethod(action = "http://www.mule-hotel.com/HotelService/getAvailableRooms")
    public AvailabilityResponse getAvailableRooms(
        @WebParam(partName = "parameters", name = "AvailabilityRequest", targetNamespace = "http://www.mule-hotel.com/HotelService/")
        AvailabilityRequest parameters
    );
}
