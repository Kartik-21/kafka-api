package com.jk.kafkaapi.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaSender {

    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;

    public void sentMsg(KafkaReq kafkaReq) {
        kafkaTemplate.send(kafkaReq.getName(), kafkaReq.getData());
    }

}
