# Spring Boot User Management Demo

## Overview
A simple Spring Boot project to manage users in-memory. Demonstrates basic CRUD operations, RESTful API design, and layered architecture using Spring Boot.

## Prerequisites
- Java 17+ (or compatible with your Spring Boot version)
- Gradle (included via wrapper)
- Git (optional, for cloning)

## Getting Started

### Clone the Repository
```bash
git clone <repo-url>
cd spring-boot-user-demo
```

### Run the Application
```bash
./gradlew bootRun
```
The app will start on `http://localhost:8080` by default.

## API Endpoints

### Add User (POST)
- **Endpoint:** `/user/{name}/{surname}`
- **Method:** POST
- **Description:** Adds a new user with the given name and surname.
- **Example:**
  ```bash
  curl -X POST http://localhost:8080/user/John/Doe
  ```

### Add User (GET)
- **Endpoint:** `/user/add/{name}/{surname}`
- **Method:** GET
- **Description:** Adds a new user with the given name and surname (alternative GET endpoint).
- **Example:**
  ```bash
  curl http://localhost:8080/user/add/Jane/Smith
  ```

### Run Tests
```bash
./gradlew test
```

## Project Structure
- **Model:** `User.java` – Represents the User entity.
- **Repository:** In-memory repository (e.g., `FakeRepo`) – Stores users during runtime.
- **Service:** `UserServiceImpl` – Handles business logic for user operations.
- **Controller:** `UserController` – Exposes REST API endpoints.
- **Tests:** `UserServiceTests.java` – Unit tests for service logic.

## Usage
Interact with the API using tools like `curl`, Postman, or your browser. Example:
```bash
curl -X POST http://localhost:8080/user/John/Doe
```

## Contributing
Contributions are welcome! Please open issues or submit pull requests for improvements.

## Contact
For questions or support, please contact the repository maintainer.
