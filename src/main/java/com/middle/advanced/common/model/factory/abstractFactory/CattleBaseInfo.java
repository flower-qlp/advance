package com.middle.advanced.common.model.factory.abstractFactory;

import lombok.Data;

import java.util.Date;

@Data
public class CattleBaseInfo extends AbstractBaseInfo {

    private Integer hycType;

    private Integer taskStatus;

    @Override
    public Object init() {
        CattleBaseInfo info = new CattleBaseInfo();
        info.setLoanCode("JSBC0006");
        info.setHycType(0);
        info.setCreateTime(new Date());
        info.setTaskStatus(0);
        info.setProcessKey("GFC");
        return info;
    }
}
