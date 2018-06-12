FROM openjdk:8
ADD target/motd-code-sample-1.0-SNAPSHOT.jar motd-code-sample-1.0-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "motd-code-sample-1.0-SNAPSHOT.jar"]