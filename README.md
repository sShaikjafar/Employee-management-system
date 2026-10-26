Employee-management-system
A RESTful Employee Management System developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. The application provides CRUD (Create, Read, Update, Delete) operations to manage employee records, including employee names, departments, and salaries. It follows a layered architecture with separate controller, service, repository, and entity components, making the application modular and maintainable.
Employee Management REST API built with Java 17, Spring Boot, Spring Data JPA, Hibernate, and MySQL, supporting CRUD operations for employee records.
Employee Management System

Overview

The Employee Management System is a backend REST API application developed using Java and Spring Boot. It helps manage employee information through standard CRUD operations. The application uses Spring Data JPA and Hibernate for database interaction and MySQL for persistent data storage.

Features

- Add Employee: Create employee records with name, department, and salary.
- View All Employees: Retrieve a list of all employees.
- View Employee by ID: Fetch individual employee details using an employee ID.
- Update Employee:Modify existing employee information.
- Delete Employee: Remove employee records from the database.
- RESTful API:Provides HTTP endpoints for interacting with employee data.
- JPA Integration: Uses Spring Data JPA for database operations.

Technologies Used

- Java 17
- Spring Boot 3.5.0
- Spring Web
- Spring Data JPA
- Hibernate ORM
- MySQL
- Maven
- Springdoc OpenAPI / Swagger UI

Project Architecture

The project follows a layered architecture:

- Entity:Represents the Employee database entity.
- Controller: Handles incoming HTTP requests and API responses.
- Service: Contains the business logic for employee operations.
- Repository: Performs database operations using Spring Data JPA.

API Endpoints

Base URL: `/api/emp`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/emp` | Add a new employee |
| GET | `/api/emp` | Retrieve all employees |
| GET | `/api/emp/{id}` | Retrieve an employee by ID |
| PUT | `/api/emp/{id}` | Update an employee |
| DELETE | `/api/emp/{id}` | Delete an employee |

Example Employee JSON

```json
{
  "name": "Rahul",
  "department": "IT",
  "salary": 45000
}
```

Setup and Installation

1. Clone the repository.
2. Install Java 17 or later and Maven.
3. Install MySQL and create a database named `nec`.
4. Configure your database URL, username, and password in `application.properties` using your own local credentials.
5. Run the application using Maven:

```bash
mvn spring-boot:run
```

6. The application runs on port `9070` by default.

Learning Outcomes

This project demonstrates practical knowledge of Java backend development, REST API design, Spring Boot application structure, dependency injection, CRUD operations, ORM concepts, and relational database integration.

Future Enhancements

- Add input validation and centralized exception handling.
- Implement proper HTTP status codes.
- Add employee search and pagination.
- Integrate Spring Security and role-based authentication.
- Add automated unit and integration tests.
