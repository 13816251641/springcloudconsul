package com.lujieni.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ljn
 * @Date 2020/1/4
 * G版本默认策略不是RoundRobin
 */
@Configuration
public class RibbonConfig {
/*    @Bean
    public IRule myRule(){
        return new RoundRobinRule();//轮询
        //return new RetryRule();//重试
        //return new BestAvailableRule();
    }*/
}
