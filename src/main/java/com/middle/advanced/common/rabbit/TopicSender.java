package com.middle.advanced.common.rabbit;

import com.middle.advanced.common.CallBackProducer;
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
        callBackProducer.send("topic-exchange","topic.receivers","好样的，不好", correlationData);
        callBackProducer.send("topic-exchange","topic.receiver3","好样的，shibai", correlationData);
    }

    public static void main(String[] args) {
        new TopicSender().topicSend();
    }

}
