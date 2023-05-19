package com.zhia.zhiaeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZhiaEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhiaEurekaApplication.class, args);
    }

}
