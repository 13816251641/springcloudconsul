package com.lujieni.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001_App.class, args);
    }

}
