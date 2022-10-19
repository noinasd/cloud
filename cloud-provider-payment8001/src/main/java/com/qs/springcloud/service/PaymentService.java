package com.qs.springcloud.service;



import com.qs.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
