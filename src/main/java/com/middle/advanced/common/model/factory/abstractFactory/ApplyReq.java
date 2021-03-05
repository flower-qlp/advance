package com.middle.advanced.common.model.factory.abstractFactory;

import lombok.Data;

@Data
public class ApplyReq {
    private String idCard;
    private String customerNo;
    private String arrayTypeCode;
    private Long capital;
    private Integer enuNum;
    private Integer singlePower;
}
