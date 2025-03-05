package org.ljy.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.ljy.order.client")
public class MsaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsaOrderApplication.class, args);
    }

}
