#FROM alpine:latest
#ENV JAVA_HOME="/usr/lib/jvm/default-jvm/"
#RUN apk add openjdk11
#ENV PATH=$PATH:${JAVA_HOME}/bin
FROM openjdk:11-jdk-slim

LABEL maintainer=“zhar.feda@yandex.cu”
EXPOSE 8080

ADD ./excursions-places/build/libs/PlacesApplication-1.0-SNAPSHOT.jar ./

ENTRYPOINT ["java","-jar","./PlacesApplication-1.0-SNAPSHOT.jar"]