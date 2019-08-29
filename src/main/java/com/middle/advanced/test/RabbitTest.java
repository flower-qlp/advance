package com.middle.advanced.test;


import com.middle.advanced.common.TopicSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitTest {

    @Autowired
    private TopicSender topicSender;


    @Test
    public void sendMessage(){
        topicSender.topicSend();
    }
}
