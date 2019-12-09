package com.lujieni.cloud.controller;


import com.lujieni.cloud.service.SayPortClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayPortController {

    @Autowired
    private SayPortClientService sayPortClientService;

    @RequestMapping(value = "/sayport", method = RequestMethod.GET)
    public String sayPort(){
        return sayPortClientService.sayPort();
    }

}
