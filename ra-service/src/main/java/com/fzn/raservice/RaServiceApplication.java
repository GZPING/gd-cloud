package com.fzn.raservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RaServiceApplication.class, args);
    }

}
