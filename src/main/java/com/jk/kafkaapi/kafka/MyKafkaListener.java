package com.jk.kafkaapi.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {


    @KafkaListener(topics = "k",groupId = "myGroup")
    void listner(Object data) {
        System.out.println("MyKafkaListener.listner");
        System.out.println(data);
        System.out.println("MyKafkaListener.listner");
    }


//    @KafkaListener(topics = "k",groupId = "myGroupq")
//    void listnerq(Object data) {
//        System.out.println("MyKafkaListener.listner");
//        System.out.println(data);
//        System.out.println("MyKafkaListener.listner");
//    }

}
