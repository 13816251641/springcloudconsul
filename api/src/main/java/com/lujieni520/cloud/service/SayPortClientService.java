package com.lujieni520.cloud.service;

import com.lujieni520.cloud.service.impl.SayPortClientServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/*指定feign对应的微服务的名称*/
@FeignClient(value="sayportservice",fallback = SayPortClientServiceFallback.class)
public interface SayPortClientService {
    /* feign的接口中必须指定GetMapping和url */
    @PostMapping(value = "/say")
    String say();

    /* feign的接口中必须指定GetMapping和url */
    @PostMapping(value = "/bye")
    String bye();

}
