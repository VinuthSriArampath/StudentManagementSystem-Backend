# Student Management System Using SpringBoot


A Simple Student Managemet System REST-API for CRUD Operations which allows the user to performe registering,updating ,deleting and serching.
MeanWhile for datastoring it is using mysql with hibernate 

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [API Documentation](#api-documentation) *(if applicable)*
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features

- Registering,Updating,Deleting and Searching students.
- System Automatically appy a unique id for each student.
- Abilitity to store one image(less than 1MB) in the database and update it

## Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/VinuthSriArampath/StudentManagementSystem-Backend.git
    ```
2. **Additional setup instructions:**
    - Create a Database Manually on mysql called 'studentmanagement'.
    - change the username and password in application.yml file accoring to details.
    - for basic testing clone
      ```bash
        git clone https://github.com/VinuthSriArampath/StudentManagementSystem-Frontend.git
      ```

## Screenshots

There are No GUI for this API

## API Documentation

If your project includes an API, detail its usage here.

### Get All Students GET Request
```bash
GET /studnet/all
```
### Get Student By ID GET Request
```bash
GET /studnet/searchbyid/{PASS-STUDENT-ID}
```

### Add a Student POST Request
```bash
POST /student/addstudent
```

### Update a Student PATCH Request
- Make sure to pass the student id (Refer the student management system fromend for example)
```bash
PATCH /student/updatestudent
```

### Delete Student By ID DELETE Request
```bash
DELETE /studnet/deletestudent/{PASS-STUDENT-ID}
```

