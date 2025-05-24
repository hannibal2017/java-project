package com.aluo.rabbit.common.service;

import com.aluo.rabbit.common.MqMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.common
 * @date 2025/5/24 22:28
 */
@Service
@Slf4j
public class MessageSenderImpl implements MessageSender {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(MqMessage message) {
        try {
            log.info("MessageSenderImpl send message: {}", message);
//            publisher.publishEvent(message);
            rabbitTemplate.convertAndSend(message.getExchange(), message.getRoutingKey(), message.getMessage());
        } catch (Exception e) {
            log.error("MessageSenderImpl send error : message{}", message, e);
        }
    }
}
