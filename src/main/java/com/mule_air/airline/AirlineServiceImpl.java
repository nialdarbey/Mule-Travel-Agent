package com.mule_air.airline;

import java.util.Date;

public class AirlineServiceImpl implements AirlineService {

	@Override
	public FlightReservationResponse reserveFlight(FlightReservationRequest flightReservationRequest) {
		FlightReservationResponse response = new FlightReservationResponse();
		
		if (flightReservationRequest.getFrom().equals("SFO") && (flightReservationRequest.getTo().equals("NYC"))) {
			throw new RuntimeException("No direct flights between SFO and NYC");
		}
		
		response.setExpiryDate(new Date());
		response.setPrice(500);
		response.setReservationNumber("13X1");
		return response;
	}

	@Override
	public FlightConfirmationResponse confirmFlight(FlightConfirmationRequest flightConfirmationRequest) {
		FlightConfirmationResponse response = new FlightConfirmationResponse();
		response.setConfirmationNumber("1234xfaer");
		return response;
	}

	@Override
	public CancelationResponse cancelFlight(CancelationRequest parameters) {
		CancelationResponse response = new CancelationResponse();
		response.setCancelationNumber("q34124");
		return response;
	}

}
