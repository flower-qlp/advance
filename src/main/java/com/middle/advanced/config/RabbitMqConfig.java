package com.middle.advanced.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue() {
        Map<String, Object> arguments = new HashMap<>();
        arguments.put("x-dead-letter-exchange", "hello");
        arguments.put("x-dead-letter-routing-key", "queue.hello");
        arguments.put("x-message-ttl", 300000);
        return new Queue("hello", true, false, false, arguments);
    }
}
