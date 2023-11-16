# Week 4 Day 1 - MVC Structure & JPA

## Office Hour
- Q & A
- Bootstrap demo
- MySQL Queries

## Lecture

### Objectives
- connect a database to your project
- recognize, understand and structure projects under MVC design model
- Use annotations to attach validations to model attributes
- Understand the Java Persistance API
- Understand Java Persistance Query Language

### Connecting to the database
- Creating a schema in mysql workbench
- using createDatabaseIfNotExists

### MVC
- Design model made for keeping your project organized and encapsulated. 
- Extremely efficient for Object Oriented Programming
#### Models
- Holds information about tables in your database 
- Used for more advanced processes in the future. 
- Use JPA to setup validations and structure for your database

##### Repository
- Handles query logic and communicating with the database
- CrudRepository

##### Services
- Connects the controller to the repository through surface logic

#### Views
- Contains the templates used to render html
- What is displayed to the user

#### Controllers
- House backend logic used to handle requests
- Centerpoint of your project
- Used to connect the views to the models and the database. 

### Wrap-up
- Tomorrow: Introduce Databinding and the CR of CRUD (Create and Read)

# Week 4 Day 2 - Adding Views & Databinding

## Office Hour
- Q & A
- JPQL Demo

## Lecture

### Objectives
- Handle form data with modelAttribute (Create)
- Display validations with improper user input
- Use jstl to render and display model data
- Use jstl prefix form

### Create Form
- form:form
- path attribute -> linked to your getters and setters
- modelAttribute -> can be set with Model or @ModelAttribute
- form:label
- form:input
- form:errors

### Controller
- @Valid
- @ModelAttribute
- BindingResult
- validations

### Views - (Read)
- Display all Page
- Display One Page

### Wrap-up
- Tomorrow: Edit & Delete (Finishing Full Crud)