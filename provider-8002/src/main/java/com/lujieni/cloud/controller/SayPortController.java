package com.lujieni.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayPortController {

    @RequestMapping(value = "/sayport", method = RequestMethod.POST)
    public String sayPort(){
        return "provider-8002";
    }
}
