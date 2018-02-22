package com.facishare.test;

import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/**
 * Created by dingc on 2016/3/2.
 */
public class Test {

    public static void main(String[] args) {

//        Channel channel = null;
//        Connection conn = null;
//        try {
//
//            ConnectionFactory factory = new ConnectionFactory();
//            factory.setUsername("CALLBACK");
//            factory.setPassword("CALLBACK");
//            factory.setVirtualHost("CALLBACK");
//            factory.setHost("172.31.105.109");
//            factory.setPort(5672);
//            conn = factory.newConnection();
//
//            channel = conn.createChannel();
//
////            channel.exchangeDeclare(exchangeName, "direct", true);
////            String queueName = channel.queueDeclare().getQueue();
////            channel.queueBind(queueName, exchangeName, routingKey);
//            channel.exchangeDeclare("open", "direct", true);
//            String queueName = channel.queueDeclare().getQueue();
//            channel.queueBind(queueName, "open", "CALLBACK.PROVIDER.TASK.TEST");
//
//            for (int i = 1; i < 2; i++) {
//                String test = "String" + i;
//                byte[] messageBodyBytes = test.getBytes();
//                channel.basicPublish("open", "CALLBACK.PROVIDER.TASK.TEST",
//                        new AMQP.BasicProperties.Builder()
//                                .contentType("text/plain")
//                                .deliveryMode(2)
//                                .priority(i%2 == 1? 1 : 2)
//                                .userId("CALLBACK")
////                                .expiration("1") // 必须在1毫秒内执行完成，否则丢掉
//                                .build(),
//                        messageBodyBytes);
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } finally {
//            if (channel != null) {
//                try {
//                    channel.close();
//                    conn.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (TimeoutException e) {
//                    e.printStackTrace();
//                }
//            }
//        }

//        System.out.println("#######################  start to recive  ################");
//
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:spring-mq.xml");
//        RabbitTemplate openRabbitTemplate = (RabbitTemplate)ctx.getBean("rabbitTemplate");
//
//        // another methed to push message
//        openRabbitTemplate.convertAndSend("CALLBACK.PROVIDER.TASK.TEST", "send into queue");
//        System.out.println("send info into queue");


    }

}
