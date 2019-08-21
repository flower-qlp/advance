package com.middle.advanced.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LoginDto {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    private String passWord;
}
