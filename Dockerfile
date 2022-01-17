FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} spring-boot-complete-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-complete-0.0.1-SNAPSHOT.jar"]