package com.mule_hotel.hotelservice;

import java.util.ArrayList;
import java.util.List;

import com.mule_hotel.hotelservice.AvailabilityResponse.Room;

public class HotelServiceImpl implements HotelService {

	@Override
	public ConfirmationResponse confirmRoom(ConfirmationRequest parameters) {
		ConfirmationResponse response = new ConfirmationResponse();
		response.setConfirmationNumber("1234zxcv");
		return response;
	}

	@Override
	public AvailabilityResponse getAvailableRooms(AvailabilityRequest parameters) {
		AvailabilityResponse response = new AvailabilityResponse();
		List<Room> rooms = response.getRooms();
		rooms.add(new Room() {{ setRoomType(RoomType.DOUBLE); setPrice(70); }} );
		rooms.add(new Room() {{ setRoomType(RoomType.SINGLE); setPrice(50); }} );
		rooms.add(new Room() {{ setRoomType(RoomType.PRESIDENTIAL); setPrice(600); }} );
		
		return response;
	}

}
