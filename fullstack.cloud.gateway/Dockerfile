FROM openjdk:11
EXPOSE 9000
COPY /target/fullstack.cloud.gateway-0.0.1-SNAPSHOT.jar gateway-server.jar
ENTRYPOINT ["java","-jar","gateway-server.jar"]