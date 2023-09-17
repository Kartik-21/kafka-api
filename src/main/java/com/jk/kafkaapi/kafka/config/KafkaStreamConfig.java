package com.jk.kafkaapi.kafka.config;

import org.apache.kafka.common.serialization.Serdes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.KafkaStreamsConfiguration;

import java.util.HashMap;
import java.util.Map;

import static org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG;
import static org.apache.kafka.streams.StreamsConfig.*;

@Configuration
public class KafkaStreamConfig {

    //    @Value(value = "${spring.kafka.bootstrap-servers}")
//    private String bootstrapAddress;
    private String bootstrapAddress = "localhost:9092";


    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    KafkaStreamsConfiguration kStreamsConfig() {
        Map<String, Object> props = new HashMap<>();
        props.put(APPLICATION_ID_CONFIG, "streams-app");
        props.put(BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());

        return new KafkaStreamsConfiguration(props);

        //KTable is used for stateful processing, such as aggregation, and materialized views
        ////ktable -> it is used for get the perticuler topic data
        ///Ktable -> deal with one partition at a time
        ///globalktable -> deal with entrire topic (all partition)

//        KStream is used for stream processing
        ///after getting the data we can perform opertions on that ktable object
    }
}
