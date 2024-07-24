# Use a Java base image
FROM openjdk:17-alpine

# Set the working directory to /app
WORKDIR /EDF-LMS

# Copy the Spring Boot application JAR file into the Docker image
COPY target/LMS-0.0.1-SNAPSHOT.jar /EDF-LMS/LMS-0.0.1-SNAPSHOT.jar

# Set environment variables
ENV SERVER_PORT=8080
ENV LOGGING_LEVEL=INFO

# Expose the port that the Spring Boot application is listening on
EXPOSE 8080

# Run the Spring Boot application when the container starts
CMD ["java", "-jar", "mobile-app-ws-0.0.1-SNAPSHOT.jar"]
