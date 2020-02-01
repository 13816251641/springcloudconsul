package com.lujieni520.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

/*指定feign对应的微服务的名称*/
@FeignClient(value="sayportservice")
public interface SayPortClientService {
    /* feign的接口中必须指定GetMapping和url */
    @PostMapping(value = "/sayport")
    String sayPort();
}
