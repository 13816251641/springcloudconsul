package com.lujieni.cloud.controller;

import com.lujieni520.cloud.dto.PetDto;
import com.lujieni520.cloud.dto.ResponseDto;
import com.lujieni520.cloud.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/get-data", method = RequestMethod.POST)
    public ResponseDto getData() throws Exception{
        ResponseDto responseDto = new ResponseDto();

        List<UserDto> userDtos = new ArrayList<>();
        userDtos.add(new UserDto().setId(11).setUsername("蒋介石").setPassword("123"));
        userDtos.add(new UserDto().setId(12).setUsername("毛泽东").setPassword("123"));
        responseDto.setUserDtos(userDtos);

        List<PetDto> petDtos = new ArrayList<>();
        petDtos.add(new PetDto().setId(2).setName("佩奇").setKind("猪"));
        responseDto.setPetDtos(petDtos);

        return responseDto;
    }
}
