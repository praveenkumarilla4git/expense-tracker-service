# --- Stage 1: Build Phase ---
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy configuration and code
COPY pom.xml .
COPY src ./src

# Compile and package into a JAR
RUN mvn clean package -DskipTests

# --- Stage 2: Runtime Phase ---
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy the compiled JAR artifact from the build container
COPY --from=build /app/target/expense-tracker-service-1.0.0.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]