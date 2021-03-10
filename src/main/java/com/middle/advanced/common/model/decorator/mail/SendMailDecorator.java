package com.middle.advanced.common.model.decorator.mail;

import com.middle.advanced.bean.Mail;

public class SendMailDecorator implements SendMail {
    private SendMail sendMail;

    public SendMailDecorator(SendMail sendMail) {
        this.sendMail = sendMail;
    }


    @Override
    public void sendMail(Mail mail) {
        sendMail.sendMail(mail);
    }
}
