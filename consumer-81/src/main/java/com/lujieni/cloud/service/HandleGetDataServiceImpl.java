package com.lujieni.cloud.service;

import com.lujieni.cloud.dao.OdsPetRepository;
import com.lujieni.cloud.dao.OdsUserRepository;
import com.lujieni.cloud.entity.OdsPet;
import com.lujieni.cloud.entity.OdsUser;
import com.lujieni.cloud.util.BeanCloneUtils;
import com.lujieni520.cloud.dto.ResponseDto;
import com.lujieni520.cloud.service.SayPortClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther ljn
 * @Date 2020/2/11
 */
@Service
public class HandleGetDataServiceImpl {

    @Autowired
    private SayPortClientService sayPortClientService;

    @Autowired
    private OdsPetRepository odsPetRepository;

    @Autowired
    private OdsUserRepository odsUserRepository;


    public void handleGetData(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","lujieni");
        ResponseDto data = sayPortClientService.getData(map);
        data.getPetDtos().forEach(e->{
            OdsPet odsPet = BeanCloneUtils.copyTo(e, OdsPet.class);
            odsPetRepository.save(odsPet);

        });
        data.getUserDtos().forEach(e->{
            OdsUser odsUser = BeanCloneUtils.copyTo(e, OdsUser.class);
            odsUserRepository.save(odsUser);
        });
    }


}
