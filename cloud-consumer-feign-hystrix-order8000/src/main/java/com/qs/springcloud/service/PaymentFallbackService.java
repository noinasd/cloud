package com.qs.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService  服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService  服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}
