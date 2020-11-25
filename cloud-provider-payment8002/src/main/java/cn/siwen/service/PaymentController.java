package cn.siwen.service;

import cn.siwen.entity.CommonResult;
import cn.siwen.entity.Payment;
import cn.siwen.config.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/add")
    public CommonResult<Payment> addPayment(@RequestBody Payment payment){
        int result = paymentService.addPayment(payment);
        if(result>0){
            return new CommonResult<>(200,"success",payment);
        }else{
            return new CommonResult<>(200,"faild");
        }
    }

    @GetMapping("/payment/find/{id}")
    public CommonResult<Payment> findPayment(@PathVariable long id){
        Payment paymentById = paymentService.findPaymentById(id);
        if(paymentById!=null){
            return new CommonResult<>(200,"服务端："+port,paymentById);
        }else{
            return new CommonResult<>(999,"faild");
        }

    }
}
