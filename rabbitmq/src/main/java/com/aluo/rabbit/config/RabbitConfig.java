package com.aluo.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
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

    /**
     * 消息JSON格式
     * @return
     */
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory,
                                         MessageConverter messageConverter) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter);
        return template;
    }
    @Bean
    public Queue TestJSONQueue() {
        return new Queue("testJSONQueue");
    }

    @Bean
    public Queue workQueue() {
        return new Queue("work_queue", true);
    }

}
