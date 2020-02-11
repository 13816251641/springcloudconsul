package com.lujieni520.cloud.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Auther ljn
 * @Date 2020/2/11
 */
@Data
@Accessors(chain = true)
public class UserDto {
    private Integer id;
    private String username;
    private String password;

}
