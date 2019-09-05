package com.middle.advanced.common.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 一对一
 * **/
@Component
public class OneToOneSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String text){
        this.amqpTemplate.convertAndSend("hello",text);
    }
}
