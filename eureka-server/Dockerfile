FROM anapsix/alpine-java:8
EXPOSE 8761
ADD target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENTRYPOINT exec java $JAVA_OPTS -jar eureka-server.jar