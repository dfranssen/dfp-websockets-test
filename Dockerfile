FROM openjdk:8u111-jdk-alpine
ADD ./target/demochat-*.jar chat.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /chat.jar" ]