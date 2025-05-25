package com.aluo.rabbit.controller;

import com.alibaba.fastjson.JSON;
import com.aluo.rabbit.model.User;
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
public class TestJsonSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        User user = new User();
        user.setName("luo");
        user.setPhone("0755");
        System.out.println("Sender : " + user);
        this.rabbitTemplate.convertAndSend("testJSONQueue", JSON.toJSONString(user));
    }
}
