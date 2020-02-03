package com.lujieni520.cloud.service.impl;

import com.lujieni520.cloud.service.SayPortClientService;
import org.springframework.stereotype.Service;

/**
 * @Auther ljn
 * @Date 2020/2/1
 */
@Service
public class SayPortClientServiceFallback implements SayPortClientService {
    @Override
    public String say() {
        return "熔断方法";
    }
}
