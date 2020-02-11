package com.lujieni520.cloud.dto;

import lombok.Data;

import java.util.List;

/**
 * @Auther ljn
 * @Date 2020/2/11
 */
@Data
public class ResponseDto {

    private List<UserDto> userDtos;

    private List<PetDto> petDtos;

}
