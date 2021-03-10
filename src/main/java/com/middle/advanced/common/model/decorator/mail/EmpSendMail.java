package com.middle.advanced.common.model.decorator.mail;

import com.middle.advanced.bean.Mail;
import com.middle.advanced.bean.TUserInfo;
import com.middle.advanced.common.model.decorator.test.GfService;
import com.middle.advanced.common.model.decorator.test.LoanGfServiceImpl;

public class EmpSendMail extends SendMailDecorator {
    public EmpSendMail(SendMail sendMail) {
        super(sendMail);
    }

    public void sendEmail() {
        TUserInfo userInfo = new GfService(new LoanGfServiceImpl()).findById(1);
        super.sendMail(exchangeMail(userInfo));
    }

    public Mail exchangeMail(TUserInfo userInfo) {
        Mail mail = new Mail();
        mail.setId(1L);
        mail.setMsg(userInfo.getNickName());
        mail.setToAccount(userInfo.getTel());
        return mail;
    }

}
