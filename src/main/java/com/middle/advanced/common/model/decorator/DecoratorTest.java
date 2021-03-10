package com.middle.advanced.common.model.decorator;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.TUserInfo;
import com.middle.advanced.common.model.decorator.mail.EmpSendMail;
import com.middle.advanced.common.model.decorator.mail.SendMailImpl;
import com.middle.advanced.common.model.decorator.mail.SupportSendMail;
import com.middle.advanced.common.model.decorator.test.GfService;
import com.middle.advanced.common.model.decorator.test.LoanGfServiceImpl;
import com.middle.advanced.common.model.decorator.test.loanService;

public class DecoratorTest {
    public static void main(String[] args) {

        new SupportSendMail(new SendMailImpl()).sendEmail();
        new EmpSendMail(new SendMailImpl()).sendEmail();

//        loanService loanGfService = new LoanGfServiceImpl();
//        loanService loan = new GfService(loanGfService);
//        TUserInfo userInfo = loan.findById(1);
//        System.out.println(JSON.toJSONString(userInfo));
    }


}
