package com.lujieni.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayPortController {

    @RequestMapping(value = "/sayport", method = RequestMethod.GET)
    public String sayPort() throws Exception{
       /* Thread.sleep(7 * 1000);*/
        return "provider-8001";
    }
}
