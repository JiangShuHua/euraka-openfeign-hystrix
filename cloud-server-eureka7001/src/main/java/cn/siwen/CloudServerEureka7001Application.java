package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServerEureka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerEureka7001Application.class, args);
    }

}
