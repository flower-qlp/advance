package com.middle.advanced.common.model.factory.abstractFactory;

import lombok.Data;

import java.util.Date;

@Data
public abstract class AbstractBaseInfo {
    private Long id;
    private String loanNo;
    private Long userId;
    private String customerNo;
    private Long productId;
    private Date createTime;
    private Date applyTime;
    private String loanCode;
    private Integer version;
    private String processKey;
    private Long instanceId;
    private Integer applyStatus;

    public abstract Object init();
}
