package com.aluo.rabbit.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author edz
 * @version V1.0
 * @Package com.luo.rabbit.controller
 * @date 2025/5/23 21:31
 */
@Component
public class WorkQueueSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "work " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("work_queue", context);
    }
}
