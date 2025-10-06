FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY target/payment-service.jar app.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "app.jar"]