FROM openjdk:8-alpine
WORKDIR /app
COPY target/bookapp-0.0.1-SNAPSHOT.jar bookapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker", "bookapp-0.0.1-SNAPSHOT.jar"]