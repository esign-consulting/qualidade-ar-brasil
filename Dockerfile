FROM maven:alpine AS builder
WORKDIR /qualidadearbrasil
COPY pom.xml .
COPY src ./src
RUN mvn install

FROM openjdk:alpine
COPY --from=builder /qualidadearbrasil/target/qualidadearbrasil-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
CMD ["java", "-jar", "qualidadearbrasil-0.0.1-SNAPSHOT.jar"]