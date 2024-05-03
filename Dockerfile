FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} /joblisting.jar

ENTRYPOINT ["java" , "-jar" , "/joblisting.jar"]

EXPOSE 8080

