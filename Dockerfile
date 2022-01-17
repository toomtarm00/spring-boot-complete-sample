FROM openjdk:8-jdk-alpine
EXPOSE 8082
ADD target/spring-boot-sample.jar spring-boot-sample.jar
ENTRYPOINT ["java","-jar","/spring-boot-sample.jar"]