package com.middle.advanced.test;


import com.middle.advanced.common.rabbit.OneToOneSender;
import com.middle.advanced.common.rabbit.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitTest {

    @Autowired
    private TopicSender topicSender;

    @Test
    public void doTest() {
            topicSender.topicSend();
    }

}
