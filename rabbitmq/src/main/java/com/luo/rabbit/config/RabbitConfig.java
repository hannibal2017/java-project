package com.luo.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author edz
 * @version V1.0
 * @Package com.luo.rabbit.config
 * @date 2025/5/23 21:29
 */
@Configurable
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
