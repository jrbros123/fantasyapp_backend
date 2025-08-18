# Use Eclipse Temurin JDK 22
FROM eclipse-temurin:22-jdk

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom.xml
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Make mvnw executable
RUN chmod +x mvnw

# Download dependencies and build jar
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Expose port your Spring Boot app uses
EXPOSE 8080

# Run the JAR
CMD ["java", "-jar", "target/fantasy_nba-0.0.1-SNAPSHOT.jar"]
