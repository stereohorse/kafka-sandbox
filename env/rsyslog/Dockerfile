FROM alpine:3.5
MAINTAINER Nguyen Viet <inbox@dev-forge.ru>

RUN apk add --update --no-cache \
  rsyslog

ENTRYPOINT [ "rsyslogd", "-dn" ]
