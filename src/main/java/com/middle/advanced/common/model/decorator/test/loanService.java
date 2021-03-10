package com.middle.advanced.common.model.decorator.test;

import com.middle.advanced.bean.TUserInfo;

import java.util.List;

public interface loanService {
    List<Integer> findList();

    TUserInfo findById(Integer id);
}
