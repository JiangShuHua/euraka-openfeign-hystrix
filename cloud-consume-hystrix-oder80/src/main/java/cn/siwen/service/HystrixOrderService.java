package cn.siwen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-hystrix-payment")//添加@FeignClient注解,指定服务提供方服务名称
public interface HystrixOrderService {

    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_Ok(@PathVariable("id") Integer id);

    //timeout超时
    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);

    //服务熔断
    @GetMapping(value = "/payment/hystrix/circuit/{id}")
    String paymentInfo(@PathVariable("id") Integer id);
}
