package cn.siwen.config;

import cn.siwen.entity.Payment;

public interface PaymentService {
    /**
     * 增加一笔支付
     * @param payment
     * @return
     */
    int addPayment(Payment payment);

    Payment findPaymentById(long id);
}
