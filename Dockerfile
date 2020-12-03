FROM openjdk:11
ADD mondodb-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080 27017
ENTRYPOINT ["java", "-jar", "demo.jar"]