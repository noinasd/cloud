package com.qs.springcloud.service;



import com.qs.springcloud.entities.Payment;


public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
