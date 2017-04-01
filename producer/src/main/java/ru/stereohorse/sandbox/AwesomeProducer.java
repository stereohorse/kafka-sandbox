package ru.stereohorse.sandbox;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;

import static java.lang.Thread.sleep;

public class AwesomeProducer {

    public static void main(String[] args) throws InterruptedException {

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Random r = new Random();

        try (KafkaProducer<String, String> producer = new KafkaProducer<>(props)) {

            //noinspection InfiniteLoopStatement
            for (;;) {
                producer.send(new ProducerRecord<>("topic1", String.valueOf(r.nextInt())));
                sleep(100);
            }
        }
    }
}
