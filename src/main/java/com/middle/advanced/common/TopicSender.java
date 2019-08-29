package com.middle.advanced.common;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author itoutsource.cz10
 */
@Component
public class TopicSender {


    @Autowired
    private CallBackProducer callBackProducer;

    public void topicSend(){
        CorrelationData correlationData=new CorrelationData(UUID.randomUUID().toString());
        callBackProducer.send("topic-exchange","topic.receiver","好样的", correlationData);
        callBackProducer.send("topic-exchange","topic.receivers","好样的", correlationData);

    }


}
