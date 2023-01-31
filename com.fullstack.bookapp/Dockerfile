FROM openjdk:11
EXPOSE 8081
COPY /target/com.fullstack.bookapp-0.0.1-SNAPSHOT.jar bookapp-server.jar
ENTRYPOINT ["java","-jar","bookapp-server.jar"]