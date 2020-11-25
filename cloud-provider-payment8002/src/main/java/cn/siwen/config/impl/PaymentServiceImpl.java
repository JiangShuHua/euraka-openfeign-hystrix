package cn.siwen.config.impl;

import cn.siwen.dao.PaymentDao;
import cn.siwen.entity.Payment;
import cn.siwen.config.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    @Override
    public Payment findPaymentById(long id) {
        return paymentDao.findPaymentById(id);
    }
}
