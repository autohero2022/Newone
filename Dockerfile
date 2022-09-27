FROM openjdk:8
ADD target/autoheroback-0.0.1-SNAPSHOT.jar autoheroback-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "autoheroback-0.0.1-SNAPSHOT"]