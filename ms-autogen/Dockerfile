FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom ${JAVA_OPTIONS:--Xmx512m} -jar /app.jar