package com.aluo.rabbit.common;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置
 *
 * @author LZ
 * @date 2021-06-22 18:52
 */
@Configuration
public class RabbitConfig {

    /**
     * 消息过期时间(5分钟的消息放入死信队列)
     */
    public static final String MESSAGE_TTL = "300000";

    /**
     * YC 死信队列
     */
    private static final String YC_RETRY_QUEUE = "YC_RETRY_QUEUE";

    /**
     * YC 死信交换机
     */
    public static final String YC_RETRY_EXCHANGE = "YC_RETRY_EXCHANGE";

    /**
     * YC 死信路由
     */
    public static final String YC_RETRY_ROUTING_KEY = "YC_RETRY_ROUTING_KEY";


    /**
     * 声明实现队列
     *
     * @author LZ
     * @date 2021年06月23日
     */
    @Bean
    public Queue queueRetry() {
        return new Queue(YC_RETRY_QUEUE, true);
    }

    /**
     * 声明死信交换机
     *
     * @return DirectExchange
     */
    @Bean
    public DirectExchange exchangeRetry() {
        return new DirectExchange(YC_RETRY_EXCHANGE);
    }

    /**
     * 绑定死信队列到死信交换机
     *
     * @return Binding
     */
    @Bean
    public Binding bindingRetry() {
        return BindingBuilder.bind(queueRetry()).to(exchangeRetry()).with(YC_RETRY_ROUTING_KEY);
    }
}
