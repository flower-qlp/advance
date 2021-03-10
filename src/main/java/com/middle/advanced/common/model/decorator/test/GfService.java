package com.middle.advanced.common.model.decorator.test;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.TUser;
import com.middle.advanced.bean.TUserInfo;

public class GfService extends LoanServiceImpl {

    public GfService(loanService loanService) {
        super(loanService);
    }

    @Override
    public TUserInfo findById(Integer id) {
        TUserInfo userInfo = super.findById(id);
        System.out.println(JSON.toJSONString(userInfo));
        return exchange(userInfo);
    }

    public TUserInfo exchange(TUserInfo userInfo) {
        userInfo.setAge(12);
        userInfo.setSex(true);
        userInfo.setNickName("ccc");
        userInfo.setTel("12345");
        return userInfo;
    }
}
