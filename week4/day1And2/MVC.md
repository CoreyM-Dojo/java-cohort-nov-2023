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

# Week 4 Day 3 - Edit and Delete

## Office Hour
- Other uses of form:form
- Q & A

## Lecture

### Objectives
- Add Edit & Delete functionality to our project

### RESTFul routing
- convention agreed upon by the developer industry
- meant to help a person recognize the purpose of a route on sight
- Usually attached to the actions performed on a resource in our database
- GET -> (ALL) Used when getting data/info from database
// /pizzas
- GET -> (ONE)
// /pizzas/{id}
- POST -> Used when creating or adding to a database
// /pizzas
- PUT -> Used when updating current data in a database
// /pizzas/{id}
- DELETE -> Used when removing data from the database
// /pizzas/{id}
- PATCH -> Similar to PUT but while a put request



### Edit
- uses repo.save()
- Looks for "id" as one of the properties in the modelattribute
- needs a special flag on the page to show validations

### Delete
- Pass the id of the item you want to delete from the database
- @DeleteMapping

## Wrap-up
- Break week next week - NO INSTRUCTION SUPPORT
- Week 5: Relationships and Login/Registration