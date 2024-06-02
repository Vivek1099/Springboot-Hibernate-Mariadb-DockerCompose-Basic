FROM openjdk:17

COPY target/Docker-Compose.jar composeapp.jar

EXPOSE 8090

ENTRYPOINT ["java","-jar","composeapp.jar"]