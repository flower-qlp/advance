package com.middle.advanced.utils;

//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//
//import java.io.IOException;

/**
 * 原生rabbit 当前使用的是spring 整合的
 * **/
public class RebbitSent {

//    public final String QUEUE_NAME = "advance";
//
//    public final String EXCHANGE_NAME = "exchange1";
//
//    public final String routingKey = "exchange1";
//
//    public void sendMessage(String text) {
//
//        ConnectionFactory factory = new ConnectionFactory();
//        //设置mabbitMQ所在的主机ip或者主机名
//        factory.setHost("10.2.26.143");
//
//        //创建一个链接
//        try {
//            Connection connection = factory.newConnection();
//            //创建一个频道
//            Channel channel = connection.createChannel();
//
//            /**
//             * 指定一个队列
//             **/
//
//            channel.exchangeDeclare(EXCHANGE_NAME,"direct",true);
//            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
//            channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,routingKey);
//
//
//
//
//            //发送的消息
//            channel.basicPublish(EXCHANGE_NAME,routingKey , null, text.getBytes());
//
//            channel.close();
//            connection.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        new myTask().start();
//    }
//
//    static class myTask extends Thread {
//        @Override
//        public void run() {
//            while(true){
//                System.out.println(System.currentTimeMillis());
//                new RebbitSent().sendMessage("hello! this time is " + System.currentTimeMillis());
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

}
