package com.jk.kafkaapi.kafka.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@Slf4j
public class KafkaTopicConfig {

    ///create topic from code or expose the api
    ///for producers
    @Bean
    public NewTopic newTopic() {
        return TopicBuilder.name("demo").compact().build();
    }

    public void createRestTopic(String name) {
        log.info("topic creation");
        TopicBuilder.name(name).compact().build();
        log.info("topic created");
    }


}
