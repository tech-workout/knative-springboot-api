FROM adoptopenjdk/openjdk8:jdk8u412-b08-ubi
WORKDIR /app
COPY target/hello-world-api-1.0-SNAPSHOT.jar ../app/
EXPOSE 8080
CMD ["java","-jar","hello-world-api-1.0-SNAPSHOT.jar"]
