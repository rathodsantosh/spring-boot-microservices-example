FROM anapsix/alpine-java:8
EXPOSE 8088
ADD target/item-catalog-service-0.0.1-SNAPSHOT.jar item-catalog-service.jar
ENTRYPOINT exec java $JAVA_OPTS -jar item-catalog-service.jar