package com.jk.kafkaapi;

import com.jk.kafkaapi.kafka.KafkaReq;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApiApplication.class, args);
    }

    KafkaReq kafkaReq=new KafkaReq();


}


//zookeeper-server-start.bat ..\..\config\zookeeper.properties
//
//		kafka-server-start.bat ..\..\config\server.properties
//
//		kafka-topics.bat --create --topic jk --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3
//
//		kafka-console-producer.bat --broker-list localhost:9092 --topic jk
//
//		kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic k --from-beginning

/*
 *
 *  expose api for making topics
 *
 * make db driven topic
 *
 * */