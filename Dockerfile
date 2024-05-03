FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Copy only the executable JAR file into the image
COPY target/joblisting-0.0.1-SNAPSHOT.jar /app/joblisting.jar

# Expose the port the application listens on
EXPOSE 8080

# Define the command to run the application
ENTRYPOINT ["java", "-jar", "/app/joblisting.jar"]
