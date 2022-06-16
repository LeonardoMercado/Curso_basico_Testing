package com.leonardo.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
