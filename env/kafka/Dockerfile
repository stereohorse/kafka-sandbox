FROM openjdk:8u121-jre-alpine
MAINTAINER Nguyen Viet <inbox@dev-forge.ru>

ENV KAFKA_VERSION 2.12-0.10.2.0

ADD kafka_$KAFKA_VERSION.tgz /opt

RUN mv /opt/kafka_$KAFKA_VERSION /opt/kafka

RUN apk add --no-cache --update \
  curl \
  netcat-openbsd \
  bash

WORKDIR /opt/kafka

ENTRYPOINT ["bin/kafka-server-start.sh", "config/server.properties"]
