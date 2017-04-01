# Kafka playground

## Run

### Kafka && Zookeeper

```bash
$ docker-compose up
```

### Producer

```bash
$ ./gradlew run
```

### Consumer

```bash
$ docker exec -it env_kafka_1 bash
$ bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic topic1 --from-beginning
```
