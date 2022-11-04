FROM maven:3.8.6-openjdk-11-slim AS builder
WORKDIR /qualidadearbrasil
COPY pom.xml .
COPY src ./src
RUN mvn install

FROM openjdk:11.0.9.1-jre-slim
COPY --from=builder /qualidadearbrasil/target/qualidadearbrasil-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
CMD ["java", "-jar", "qualidadearbrasil-0.0.1-SNAPSHOT.jar"]