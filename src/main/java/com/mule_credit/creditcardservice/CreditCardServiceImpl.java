package com.mule_credit.creditcardservice;

public class CreditCardServiceImpl implements CreditCardService {

	@Override
	public PaymentResponse authorisePayment(PaymentRequest parameters) {
		PaymentResponse response = new PaymentResponse();
		response.setAuthorisationNumber("12343ldkj");
		return response;
	}

	@Override
	public CancelationResponse cancelPayment(CancelationRequest parameters) {
		CancelationResponse response = new CancelationResponse();
		response.setCancelationNumber("123414");
		return response;
	}

}
