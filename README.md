# Employee Management System

A Java-based console application for managing employee records using **Java, Hibernate ORM, and MySQL**.

## 📌 Overview

The Employee Management System is a console-based application that performs basic employee management operations through a command-line interface.

The application uses **Hibernate ORM** to interact with a MySQL database and follows a simple DAO-based structure for database operations.

## 🚀 Features

* Add a new employee
* View employee details
* Update employee information
* Delete an employee
* Store employee records in MySQL
* Perform database operations using Hibernate
* Manage database transactions

## 🛠️ Technologies Used

* **Java**
* **Hibernate ORM**
* **MySQL**
* **Maven** *(remove if you did not use Maven)*
* **Eclipse IDE**

## 🏗️ Project Structure

```text
Employee_Management/
│
├── src/
│   ├── entity/
│   │   └── Employee.java
│   │
│   ├── dao/
│   │   └── EmployeeDAO.java
│   │
│   ├── util/
│   │   └── HibernateUtil.java
│   │
│   └── main/
│       └── Main.java
│
├── hibernate.cfg.xml
└── README.md
```

> The structure above should be adjusted to match the actual structure of the project.

## 🔄 Application Workflow

```text
User
  ↓
Console Menu
  ↓
Main Application
  ↓
EmployeeDAO
  ↓
Hibernate ORM
  ↓
MySQL Database
```

The user selects an operation from the console menu. The application passes the operation to the DAO layer, which uses Hibernate to perform the corresponding database operation.

## 💾 Database Operations

The application supports CRUD operations:

| Operation | Description                 |
| --------- | --------------------------- |
| Create    | Add a new employee          |
| Read      | Retrieve employee records   |
| Update    | Modify employee information |
| Delete    | Remove an employee          |

## 🔧 Hibernate

Hibernate ORM is used as the persistence layer between the Java application and MySQL.

The application uses:

* Entity mapping
* `SessionFactory`
* `Session`
* Transactions
* HQL/CRUD operations *(include only if actually used)*

## ▶️ How to Run

### Prerequisites

* Java JDK
* MySQL
* Eclipse IDE or another Java IDE
* Required Hibernate dependencies

### Setup

1. Clone the repository.
2. Create the required database in MySQL.
3. Configure the database connection in `hibernate.cfg.xml`.
4. Update the database username and password.
5. Import the project into Eclipse.
6. Add/configure the required Hibernate dependencies.
7. Run the main Java class.
8. Use the console menu to perform employee operations.

## 🖥️ Sample Console Output

```text
===== Employee Management System =====

1. Add Employee
2. View Employee
3. Update Employee
4. Delete Employee
5. Exit

Enter your choice:
```

Add screenshots of the actual console output here if you have them.

## 📚 Java Concepts Used

This project demonstrates practical use of:

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Exception Handling
* Collections *(only if actually used)*
* Interfaces *(only if actually used)*
* Database connectivity
* CRUD operations

## 🎯 Purpose

This project was developed to gain practical experience with **Java database applications and Hibernate ORM**, while understanding how Java applications interact with relational databases.

## 👨‍💻 Author

Aryan Kulkarni
