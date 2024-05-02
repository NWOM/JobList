# JobListing Backend

The JobListing Backend repository hosts a comprehensive backend solution for managing job listings. Built on the Spring Boot framework in Java, this application offers a robust set of features tailored for efficient job post management.

## Key Features:

- **RESTful API Endpoints**: Easily perform CRUD operations on job listings through well-defined API endpoints.
- **Interactive API Documentation**: Utilize Swagger for interactive API documentation, simplifying API exploration and testing.
- **MongoDB Integration**: Seamlessly integrate MongoDB as the database backend for efficient data storage and retrieval.
- **Docker Support**: Facilitate deployment with Docker support, enabling seamless containerization and scalability.

## Structure:

- **Controller Directory**: Houses controller classes responsible for handling HTTP requests and defining API endpoints.
- **Model Directory**: Contains model classes representing job listings and other relevant entities.
- **Repository Directory**: Includes repository interfaces for interacting with the MongoDB database.
- **Resources Directory**: Holds application properties files for configuring database connections and other settings.

## Configuration:

To configure the application:

1. Create an `.env` file based on the provided `.env.example` and fill in the MongoDB credentials.
2. Update the `application.properties` file with the appropriate MongoDB URI and database name.


## Usage:

Get started with the application:

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Build the application using Maven.
4. Run the application and access the Swagger UI documentation at `http://localhost:8080/swagger-ui.html` to explore the API endpoints.
