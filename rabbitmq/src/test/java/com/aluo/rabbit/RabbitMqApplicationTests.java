package com.aluo.rabbit;

import com.aluo.rabbit.controller.FanoutSender;
import com.aluo.rabbit.controller.HelloSender;
import com.aluo.rabbit.controller.TestJsonSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqApplication.class)
public class RabbitMqApplicationTests {

    @Autowired
    private HelloSender helloSender;

    @Autowired
    private FanoutSender fanoutSender;

    @Autowired
    private TestJsonSender testJsonSender;

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

}
