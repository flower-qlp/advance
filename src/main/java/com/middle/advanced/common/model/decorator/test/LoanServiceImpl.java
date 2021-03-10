package com.middle.advanced.common.model.decorator.test;

import com.middle.advanced.bean.TUserInfo;

import java.util.List;

public class LoanServiceImpl implements loanService {

    private loanService loanService;

    public LoanServiceImpl(loanService loanService) {
        this.loanService = loanService;
    }

    @Override
    public List<Integer> findList() {
        return loanService.findList();
    }

    @Override
    public TUserInfo findById(Integer id) {
        return loanService.findById(id);
    }
}
