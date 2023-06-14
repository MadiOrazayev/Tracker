FROM openjdk:17-oracle
MAINTAINER Madi
COPY Tracker/Tracker-0.0.1-SNAPSHOT.jar Tracker/tracker.jar
ENTRYPOINT ["java", "-jar", " tracker.jar"]
