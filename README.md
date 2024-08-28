# Book Store Portfolio Project

## Requisitos

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 11 o superior.

## Description
This project is a simple Book Store application built with Spring Boot, MySQL, and JPA. The application allows users to add, edit, and delete books from a MySQL database. Additionally, users can add books to a list called "MyBooks".

## Technologies Used
- Java
- Spring Boot
- MySQL
- JPA (Java Persistence API)

## Features
- Add new books to the database.
- Edit existing books in the database.
- Delete books from the database.
- Add books to a list called "MyBooks".

## Configuration

To run this project, you need to configure the database connection and application settings in the `application.properties` file. Below are the required configurations:

```properties
server.port=1001
spring.application.name=bookStore
spring.datasource.name=book
spring.datasource.url=jdbc:mysql://localhost:3306/book?ServerTimezone=CET
spring.datasource.username=root
spring.datasource.password=your_password_here
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

### Explanation of Configurations:

- **`server.port=1001`**: Specifies the port on which the application will run. In this case, it's set to port 1001.
- **`spring.application.name=bookStore`**: Sets the name of the Spring Boot application to "bookStore".
- **`spring.datasource.name=book`**: Defines the name of the datasource, which is `book`.
- **`spring.datasource.url=jdbc:mysql://localhost:3306/book?ServerTimezone=CET`**: Defines the URL for connecting to the MySQL database. Ensure that the MySQL server is running on `localhost`, and the database name is `book`.
- **`spring.datasource.username=root`**: The username for connecting to the MySQL database. Change `root` if you're using a different MySQL user.
- **`spring.datasource.password=your_password_here`**: The password for the MySQL user. Replace `your_password_here` with your actual MySQL password.
- **`spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`**: Specifies the MySQL JDBC driver.
- **`spring.jpa.hibernate.ddl-auto=update`**: Ensures Hibernate automatically updates the database schema.
- **`spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect`**: Sets the SQL dialect to MySQL.

## Ejecución de la Aplicación

Para ejecutar la aplicación, puedes usar el Maven Wrapper proporcionado en el proyecto. Dependiendo de tu sistema operativo, usa uno de los siguientes comandos:

1. Abre una terminal o línea de comandos en el directorio raíz del proyecto.
2. Ejecuta el siguiente comando:

   ```bash
   .\mvnw spring-boot:run
