# Week 5 Day 2 - Login Page

## Office hour

- Q&A
- Java Spring Review Part 2

## Lecture

### Objectives
- create a login page for our project
- Understand why we separate User model and LoginUser model
- Create a relationship from our user to our pizza
- use conditional rendering to show pizzas owned by the logged in user

### User Model
- simple model for registration
- @Transient

### LoginUser
- Only needs email/username and passwords to login
- Separate model from the User model (Why do you think that is?)

### Validations

#### Registration
- unique email
- password matches confirm password
- length checks and null checks

#### Login
- Make sure user exists in the db
- If they exist, make sure the password inputted matches that of the one in our db

## Wrap-up
- Tommorow we add encryption with jBcrypt!
