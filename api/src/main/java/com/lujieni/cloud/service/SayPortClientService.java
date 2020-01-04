package com.lujieni.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*指定feign对应的微服务的名称*/
@FeignClient(value="sayportservice")
public interface SayPortClientService {
    /* feign的接口中必须指定GetMapping和url */
    @GetMapping(value = "/sayport")
    String sayPort();
}
