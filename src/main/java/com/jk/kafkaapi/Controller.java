package com.jk.kafkaapi;

import com.jk.kafkaapi.kafka.KafkaReq;
import com.jk.kafkaapi.kafka.MyKafkaSender;
import com.jk.kafkaapi.kafka.config.KafkaProducerConfig;
import com.jk.kafkaapi.kafka.config.KafkaTopicConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class Controller {

    @Autowired
    KafkaTopicConfig kafkaTopicConfig;

    @Autowired
    MyKafkaSender myKafkaSender;

    @Autowired
    KafkaProducerConfig kafkaProducerConfig;

    @GetMapping("/{name}")
    public void createTopic(@PathVariable String name) {
        kafkaTopicConfig.createRestTopic(name);
    }


    @PostMapping()
    public void createTopic(@RequestBody KafkaReq body) {
        myKafkaSender.sentMsg(body);
    }


}
