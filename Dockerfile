FROM openjdk:23

COPY target/welcome-api.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "welcome-api.jar"]
