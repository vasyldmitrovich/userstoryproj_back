# User Story Project

<img src="back01.png" style="width: 600px; height: 350px;"><br>
<br>

## Project Overview

This project serves as the back-end component of the User Story, a web application that allows users to create projects, join them, and manage tasks related to specific stories.

### Key Features

1. **Authentication and Registration:** Users can log in and create an account.

2. **Projects and Stories:** Users can join existing projects, which include various stories - significant events or tasks.

3. **Task Management:** Users can assign and complete tasks (cards or tasks) associated with a specific story.

### Technical Details

- **Programming Language back-end:** Java
- **Database:** MariaDB
- **Required Tools:** Java 17, Maven 3.6.3

## Running the Project

1. **Clone the Repository:**
```bash
git clone [repository URL]
```
2. **Build the Project:**

    Execute the following command in the project's root directory:
```bash
mvn clean package
```

3. **Run the Project:**

After successful building, run the .jar file in the ./target folder:

```bash
java -jar target/[file-name.jar]
```
```text
   The application will start on 8080 port.
```

* **Database Configuration**

In the application's configuration file (application.properties), the path and connection data to the database are obtained from the following environment variables:

    DB_USERSTORYPROJ_URL
    DB_USERSTORYPROJ_USER
    DB_USERSTORYPROJ_PASSWORD

Before running, ensure that the MariaDB database contains a database named userstory and a table named projects with the fields:

```sql
CREATE TABLE projects (
id bigint not null auto_increment,
description varchar(255),
name varchar(255),
primary key (id)
);
```

Notes

    The project is at an early development stage, and currently, only CRUD operations for the Project entity are implemented.

Wishing you success with the "User Story" project!
