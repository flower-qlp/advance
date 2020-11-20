package com.middle.advanced.common.rabbit;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @author
 */
@Component
public class CallBackProducer implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {

    private RabbitTemplate rabbitTemplate;

    public CallBackProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setConfirmCallback(this);
    }

    public void send(String exchange, String routingKey, Object object, CorrelationData correlationData) {
        this.rabbitTemplate.convertAndSend(exchange, routingKey, object, correlationData);
    }


    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String s) {
        if (ack) {
            System.out.println("发送成功:" + JSON.toJSONString(correlationData));
        } else {
            System.out.println("发送失败:" + JSON.toJSONString(correlationData) + " 错误信息:【" + s + "】");
        }
    }

    /**
     * 发送失败回调的函数
     **/
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        String correlationId = message.getMessageProperties().getCorrelationId();
        System.out.println("消息:{}发送失败，应答码:{} 原因:{} 交换机:{} 路由键:{}" + correlationId + "-" + replyCode + "-" + replyText + "-" + exchange + "-" + routingKey);
    }

}
