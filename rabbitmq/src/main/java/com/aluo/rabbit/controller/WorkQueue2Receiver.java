package com.aluo.rabbit.controller;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version V1.0
 * @Package com.luo.rabbit.controller
 * @date 2025/5/23 21:34
 */
@Component
@RabbitListener(queues = "work_queue")
public class WorkQueue2Receiver {

    @RabbitHandler
    public void work2(String message) {
        System.out.println("work2 Receiver  : " + message);
    }
}
