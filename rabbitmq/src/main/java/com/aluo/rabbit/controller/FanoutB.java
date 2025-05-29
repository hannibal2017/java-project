package com.aluo.rabbit.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.controller
 * @date 2025/5/25 13:24
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutB {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver,fanout.B: " + message);
    }
}
