package com.middle.advanced.common.model.factory.abstractFactory;

import lombok.Data;

import java.util.Date;

@Data
public class PigBaseInfo extends AbstractBaseInfo {
    private Integer hycType;

    @Override
    public AbstractBaseInfo init() {
        PigBaseInfo info = new PigBaseInfo();
        info.setLoanCode("JSBC0005");
        info.setHycType(0);
        info.setCreateTime(new Date());
        info.setProcessKey("GFP");
        return info;
    }
}
