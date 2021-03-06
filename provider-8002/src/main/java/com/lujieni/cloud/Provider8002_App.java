package com.lujieni.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lujieni.cloud.dao")
public class Provider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(Provider8002_App.class, args);
    }

}
