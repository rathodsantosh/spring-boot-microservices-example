FROM anapsix/alpine-java:8
EXPOSE 8089
ADD target/edge-service-0.0.1-SNAPSHOT.jar edge-service.jar
ENTRYPOINT exec java $JAVA_OPTS -jar edge-service.jar