FROM openjdk:11
EXPOSE 8888
COPY /target/fullstack.config.server-0.0.1-SNAPSHOT.jar config-server.jar
ENTRYPOINT ["java","-jar","config-server.jar"]