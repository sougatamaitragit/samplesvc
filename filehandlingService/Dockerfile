FROM openjdk:8-jdk-alpine
LABEL maintainer="sougata_62@yahoo.com"
VOLUME /tmp
EXPOSE 8080
ADD target/filehandlingService-1.jar filehandlingService-1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","filehandlingService-1.jar"]
