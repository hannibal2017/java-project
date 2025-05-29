package com.aluo.rabbit.producer.service;

import com.aluo.rabbit.common.AmqpExchanges;
import com.aluo.rabbit.common.MqMessage;
import com.aluo.rabbit.common.service.MessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.producer.service
 * @date 2025/5/24 22:35
 */
@Service
@Slf4j
public class smsProducerImpl implements SmsProducer {


    @Autowired
    private MessageSender messageSender;

    @Override
    public void send(Object message) {
        log.info("send message:{}",message.toString());
        messageSender.send(new MqMessage(AmqpExchanges.SEND_MSG_EVENT, AmqpExchanges.SEND_MSG_EVENT + "_ROUTING",  message));
    }
}
