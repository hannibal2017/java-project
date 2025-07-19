package com.aluo.rabbit;

import com.aluo.rabbit.common.constants.DelayTypeEnum;
import com.aluo.rabbit.controller.FanoutSender;
import com.aluo.rabbit.controller.HelloSender;
import com.aluo.rabbit.controller.TestJsonSender;
import com.aluo.rabbit.controller.WorkQueueSender;
import com.aluo.rabbit.mq.sender.DelayMessageSender;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Objects;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqApplication.class)
@Slf4j
public class RabbitMqApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private FanoutSender fanoutSender;

    @Autowired
    private TestJsonSender testJsonSender;

    @Autowired
    private WorkQueueSender workQueueSender;

    @Autowired
    private DelayMessageSender delayMessageSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }

    /**
     * exchange fanout类型，绑定的多个队列都能消费
     * @throws Exception
     */
    @Test
    public void fanout() throws Exception {
        fanoutSender.send();
    }

    @Test
    public void testJsonMessage() throws Exception {
        testJsonSender.send();
    }

    @Test
    public void testWorkQueueMessage() throws Exception {
        for (int i = 0; i < 6; i++) {
            workQueueSender.send();
        }
    }

    /**
     * 延时消息：队列TLL + 死信队列
     */
    @Test
    public void testDelayMessage(){
        String msg = "test";
        Integer delayType = 1;
        log.info("当前时间：{},收到请求，msg:{},delayType:{}", new Date(), msg, delayType);
        delayMessageSender.sendMsg(msg, Objects.requireNonNull(DelayTypeEnum.getDelayTypeEnumByValue(delayType)));

    }

}
