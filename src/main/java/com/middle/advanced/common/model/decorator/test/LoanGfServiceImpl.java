package com.middle.advanced.common.model.decorator.test;

import com.middle.advanced.bean.TUserInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @author happy
 */
public class LoanGfServiceImpl implements loanService {

    public LoanGfServiceImpl() {
        System.out.println("创建类");
    }

    @Override
    public List<Integer> findList() {
        return Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Override
    public TUserInfo findById(Integer id) {
        TUserInfo userInfo = new TUserInfo();
        userInfo.setUserId(123L);
        return userInfo;
    }
}
