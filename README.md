**Employee-Management-App**

**Project Description**

This Employee-Management-App full-stack application combines a Spring Boot backend  and an Angular frontend  to manage employee data. Users can perform **Create, Read, Update, and Delete (CRUD)** operations on employee information. The backend leverages JPA and Spring Data JPA for seamless data persistence and retrieval from a MySQL database (managed by MySQL Workbench). Added CORS Support enabling secure communication between frontend and backend.

![Screenshot (1042)](https://github.com/viraj-ramdin-dev/Employee-Management-App-/assets/71839277/575a88cb-4c92-412e-8bb0-0cb95e2b8625)

**Key Features**

- **CRUD Operations:** Manage employee data efficiently.
- **Spring Boot Backend:** Leverage the robust features of Spring Boot.
- **JPA and Spring Data JPA:** Simplify data access and manipulation.
- **MySQL Database:** Store and retrieve employee information reliably.
- **Angular Frontend:** Deliver a user-friendly experience for interacting with data.
- **CORS Support:** Enable secure communication between frontend and backend with different origins. 

**Getting Started**

**Prerequisites:** 

- Java 11 or later ☕️
- Maven 
- Angular 
- MySQL Workbench

**1. Setting Up the Database:** ️
   1. Create a MySQL database for your project (e.g., `employeemanager`).

**2. Backend (Spring Boot):** 
   1. Clone this repository. 
   2. Update the `application.properties` file with your database connection details (URL, username, password).
      spring.datasource.url=jdbc:mysql://localhost:3306/employeemanager
      
   4. Run `mvn clean install` in the project directory to build the backend application. ️

**3. Frontend (Angular):**  (Assuming a separate Angular project)

   1. Run 'ng serve' (Employee-Management-App-\employeemanagerapp)
   2. Angular application start running(e.g., `http://localhost:4200/`).

**4. Running the Application:** 

   1. Start the MySQL server.
   2. Run the Spring Boot application.
   3. Run your Angular application following its specific instructions (using `ng serve`).

**CORS Functionality and Usage:** 

CORS (Cross-Origin Resource Sharing) is a security mechanism that governs how web browsers handle requests from different domains (origins) than the one that served the web page. By implementing CORS in your Spring Boot backend, you authorize the Angular frontend (with a different origin) to make requests to your backend APIs. Here's how CORS is typically configured in a Spring Boot application.

CORS is essential for enabling communication between frontend and backend applications on different domains. Without CORS, the browser's security measures would prevent these requests, hindering the functionality of your full-stack application.
