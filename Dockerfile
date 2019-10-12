FROM openjdk:8-alpine as builder
WORKDIR /home/gradle/src
COPY . /home/gradle/src
RUN ./gradlew build

FROM adoptopenjdk/openjdk11-openj9:jdk-11.0.1.13-alpine-slim
WORKDIR /app
COPY  --from=builder /home/gradle/src/build/libs/learningmicronauts-*-all.jar /app/learningmicronauts.jar
EXPOSE 8080
CMD java -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar /app/learningmicronauts.jar