package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentApplicationStart8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicationStart8001.class,args);
    }
}
