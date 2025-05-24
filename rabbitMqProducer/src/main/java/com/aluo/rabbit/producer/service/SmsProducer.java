package com.aluo.rabbit.producer.service;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.producer.service
 * @date 2025/5/24 22:34
 */
public interface SmsProducer {

    void send(Object message);
}
