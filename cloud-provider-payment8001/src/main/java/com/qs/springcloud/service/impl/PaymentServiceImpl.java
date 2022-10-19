package com.qs.springcloud.service.impl;


import com.qs.springcloud.dao.PaymentDao;
import com.qs.springcloud.entities.Payment;
import com.qs.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPayment(id);
    }
}
