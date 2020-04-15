FROM openjdk:10
ARG JAR_FILE=target/*.jar
EXPOSE 14500
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
