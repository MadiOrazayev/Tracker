FROM openjdk:17-oracle
MAINTAINER Madi
COPY Tracker-0.0.1-SNAPSHOT.jar tracker.jar
ENTRYPOINT ["java", "-jar", "tracker.jar"]
