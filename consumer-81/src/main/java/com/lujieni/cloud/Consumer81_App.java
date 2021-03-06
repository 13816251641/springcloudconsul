package com.lujieni.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages="com")
/*启动feign客户端,扫描com包下的所有feign接口并生成动态代理类*/
@EnableFeignClients(basePackages = "com")
@EnableDiscoveryClient //启用服务发现
public class Consumer81_App {

    public static void main(String[] args) {
        SpringApplication.run(Consumer81_App.class, args);
    }

}
