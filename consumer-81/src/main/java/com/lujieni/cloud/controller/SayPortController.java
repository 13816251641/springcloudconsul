package com.lujieni.cloud.controller;


import com.lujieni520.cloud.service.SayPortClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SayPortController {

    @Autowired
    private SayPortClientService sayPortClientService;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){
        return sayPortClientService.say();
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public String bye(){
        return sayPortClientService.bye();
    }


    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public void insert(){
        String result = sayPortClientService.insert();
        System.out.println(result);
    }

}
