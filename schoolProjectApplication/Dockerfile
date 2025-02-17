# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY . .

# Build the project
RUN ./mvnw clean install

# Expose the port your app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/schoolProjectApplication-0.0.1-SNAPSHOT.jar"]