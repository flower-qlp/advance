package com.middle.advanced.common.model.decorator.mail;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.Mail;

public class SendMailImpl implements SendMail {
    @Override
    public void sendMail(Mail mail) {
        System.out.println(JSON.toJSONString(mail));
    }
}
