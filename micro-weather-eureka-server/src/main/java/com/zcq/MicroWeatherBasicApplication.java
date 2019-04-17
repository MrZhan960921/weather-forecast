package com.zcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroWeatherBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherBasicApplication.class, args);
    }


}
