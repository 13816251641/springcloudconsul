package com.lujieni520.cloud.service.impl;

import com.lujieni520.cloud.dto.ResponseDto;
import com.lujieni520.cloud.service.SayPortClientService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Auther ljn
 * @Date 2020/2/1
 * Fallback 接口实现类需要注解 @Service
 */
@Service
public class SayPortClientServiceFallback implements SayPortClientService {
    @Override
    public String say() {
        return "say的熔断方法";
    }

    @Override
    public ResponseDto getData(Map<String, Object> map) {
        return null;
    }

    @Override
    public String insert() {
        return "insert 的熔断方法";
    }

    @Override
    public String bye() {
        return "bye的熔断方法";
    }
}
