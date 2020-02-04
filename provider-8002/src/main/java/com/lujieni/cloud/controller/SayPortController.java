package com.lujieni.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayPortController {

    @RequestMapping(value = "/say", method = RequestMethod.POST)
    public String say(){
        System.out.println("say:provider-8002执行了");
        return "say:provider-8002";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.POST)
    public String bye(){
        System.out.println("bye:provider-8002执行了");
        return "bye:provider-8002";
    }
}
