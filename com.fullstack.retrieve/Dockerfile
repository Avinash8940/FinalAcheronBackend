FROM openjdk:11
EXPOSE 8082
COPY /target/com.fullstack.retrieve-0.0.1-SNAPSHOT.jar retrieve-server.jar
ENTRYPOINT ["java","-jar","retrieve-server.jar"]