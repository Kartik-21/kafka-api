package com.jk.kafkaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

/**
 * also we can configure kafka properties in application.yml file. then no need of create config class
 */
@SpringBootApplication
@EnableKafkaStreams
@EnableKafka
public class KafkaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApiApplication.class, args);
    }
}

//new version of kafka no need of zookeeper

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