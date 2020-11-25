package cn.siwen.dao;

import cn.siwen.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    /**
     * 增加一笔支付
     * @param payment
     * @return
     */
    int addPayment(Payment payment);

    Payment findPaymentById(@Param("id")long id);
}
