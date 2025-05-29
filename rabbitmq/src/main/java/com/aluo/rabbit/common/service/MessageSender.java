package com.aluo.rabbit.common.service;

import com.aluo.rabbit.common.MqMessage;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.common
 * @date 2025/5/24 22:28
 */
public interface MessageSender {

    void send(MqMessage message);
}
