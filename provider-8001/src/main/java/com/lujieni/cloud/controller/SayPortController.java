package com.lujieni.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayPortController {

    @RequestMapping(value = "/say", method = RequestMethod.POST)
    public String say() throws Exception{
        System.out.println("say:provider-8001执行了");
        Thread.sleep(7 * 1000);
        return "say:provider-8001";
    }

    @RequestMapping(value = "/bye", method = RequestMethod.POST)
    public String bye() throws Exception{
        System.out.println("bye:provider-8001执行了");
        return "bye:provider-8001";
    }
}
