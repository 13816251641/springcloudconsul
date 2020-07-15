package com.lujieni.cloud.controller;

import com.lujieni.cloud.dao.StudentDao;
import com.lujieni.cloud.domain.StudentPO;
import com.lujieni520.cloud.dto.PetDto;
import com.lujieni520.cloud.dto.ResponseDto;
import com.lujieni520.cloud.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SayPortController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "/zuul", method = RequestMethod.GET)
    public String zuul(HttpServletRequest request) throws Exception{
        //Thread.sleep(10_000);
        System.out.println("provider-8001执行了zuul");
        String token = request.getHeader("token");
        Cookie[] cookies = request.getCookies();

        for (Cookie c: cookies) {
            if(c.getName().equals("name")){
                String value = c.getValue();
                System.out.println(value);
            }
            if(c.getName().equals("age")){
                String value = c.getValue();
                System.out.println(value);
            }
        }
        return "provider-8001:zuul";
    }


    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() throws Exception{
        System.out.println("say:provider-8001执行了");
        Thread.sleep(3_000);
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

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    @Transactional
    public String insert() throws Exception{
        studentDao.insert(new StudentPO().setName("lujieni").setAge(29).setGender("男"));
        int i = 5/0;
        return "provider-8001:insert succcess";
    }



}
