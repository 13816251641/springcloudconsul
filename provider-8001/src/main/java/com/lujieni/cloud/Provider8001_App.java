package com.lujieni.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
/*扫描mapper接口,mybatis和tkmapper都需要*/
@MapperScan("com.lujieni.cloud.dao")
public class Provider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001_App.class, args);
    }

}
