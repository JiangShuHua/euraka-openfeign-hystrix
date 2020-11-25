package cn.siwen.service;

import cn.siwen.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "payment")
public interface PaymentFeignService {

     @GetMapping("/payment/find/{id}")
     CommonResult getPaymentByid(@PathVariable("id") long id);
}
