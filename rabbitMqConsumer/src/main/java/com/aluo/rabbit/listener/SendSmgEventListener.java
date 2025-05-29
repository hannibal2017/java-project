package com.aluo.rabbit.listener;

import com.alibaba.fastjson.JSON;
import com.aluo.rabbit.common.AmqpExchanges;
import com.aluo.rabbit.common.RabbitConfig;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.rabbit.listener
 * @date 2025/5/24 22:06
 */

@Slf4j
@Component
public class SendSmgEventListener {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = AmqpExchanges.SEND_MSG_EVENT + "_QUEUE", arguments = {
                    @Argument(name = "x-message-ttl", value = RabbitConfig.MESSAGE_TTL, type = "java.lang.Long"),
                    @Argument(name = "x-dead-letter-exchange", value = RabbitConfig.YC_RETRY_EXCHANGE),
                    @Argument(name = "x-dead-letter-routing-key", value = RabbitConfig.YC_RETRY_ROUTING_KEY)
            }),
            exchange = @Exchange(value = AmqpExchanges.SEND_MSG_EVENT, type = ExchangeTypes.FANOUT)
    ))
    public void smsNotify(Object msgBody) {
        System.out.println("消费的消息：" + msgBody);
        log.info("消息体：{}", JSON.toJSONString(msgBody));
    }
}
