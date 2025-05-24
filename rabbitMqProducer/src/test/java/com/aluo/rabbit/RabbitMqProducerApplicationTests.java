package com.aluo.rabbit;

import com.aluo.rabbit.producer.service.SmsProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMqProducerApplication.class)
public class RabbitMqProducerApplicationTests {

    @Autowired
    private SmsProducer smsProducer;

    @Test
    public void send() throws Exception {
        Object message = "hello";
        smsProducer.send(message);
    }

}
