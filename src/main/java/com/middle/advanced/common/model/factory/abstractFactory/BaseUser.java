package com.middle.advanced.common.model.factory.abstractFactory;

import lombok.Data;

@Data
public class BaseUser {
    private String userName;
    private Long userId;
    private String idCard;
    private String address;
    private String provinceCode;
    private String provinceName;
    private String cityCode;
    private String cityName;
    private String districtCode;
    private String districtName;
    private Integer age;
    private Boolean sex;
}
