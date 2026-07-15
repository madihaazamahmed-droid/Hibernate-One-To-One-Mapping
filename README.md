# Hibernate-One-To-One-Mapping
A Java Hibernate ORM project demonstrating One-to-One entity mapping using JPA annotations, MySQL, and Maven.
# Hibernate One-To-One Mapping

A Java Hibernate project demonstrating **One-to-One Mapping** between `Person` and `Pancard` entities using JPA annotations and MySQL database.

## Features

- One-to-One Entity Mapping
- Hibernate ORM
- JPA Annotations
- MySQL Database Integration
- Maven Project
- CRUD Data Persistence

## Technologies Used

- Java
- Hibernate ORM
- JPA (Jakarta Persistence)
- MySQL
- Maven
- Eclipse IDE

## Project Structure

```
src
├── main
│   ├── java
│   │   └── hibernateproject2
│   │       ├── Person.java
│   │       ├── Pancard.java
│   │       └── MainClass.java
│   └── resources
│       └── META-INF
│           └── persistence.xml
```

## Entity Relationship

```
Person
-------
p_id
p_name
ph_no
pan_no (Foreign Key)

        |
        | One-To-One
        |

Pancard
--------
pan_no (Primary Key)
```

## JPA Annotations Used

- @Entity
- @Id
- @Column
- @OneToOne
- @JoinColumn

## Database

MySQL

Database Name:

```
project1
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse or IntelliJ IDEA.
3. Configure MySQL in `persistence.xml`.
4. Update Maven dependencies.
5. Run `MainClass.java`.
6. Verify the records in the MySQL database.

## Learning Outcomes

- Hibernate Configuration
- Entity Creation
- One-to-One Mapping
- EntityManager
- EntityTransaction
- Persisting Objects
- MySQL Integration

## Author

**Madiha Azam Ahmed**

GitHub: https://github.com/madihaazamahmed-droid
