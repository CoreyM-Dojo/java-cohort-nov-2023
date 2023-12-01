# Week 5 Day 3 - Adding Encryption and Authentication

## Office Hour
- Spring review continued
- Q & A

## Lecture

### Objectives
- Understand encryption on a basic level
- Create our LoginUser model
- Encrypt passwords using Bcrypt
- authenticate users before allowing access to our website
- protect our routes using session
- conditional rendering

### Encryption
- Making our information unreadable unless we have a key
- Used to secure sensitive information
- the algorithms are NOT known and thats on purpose
- using jBcrypt
    - import Bcrypt
    - BCrypt.hashpw([passwordFromForm], BCrypt.generateSalt() ) -> Hashes our password before we save to the db

### Authentication
- Making sure only the people with proper permission can access information
    - findByEmail
    - BCrypt.checkpw([passwordFromLoginForm], [passwordOfUserInDB])

### Route protection
- Logic inside of the controller that will redirect the user if they dont have the proper permissions

### Conditional Rendering
- Logic within our template which will only appear if the proper user is logged in
- jstl helps with this: c:if, c:choose

## Wrap-up
- Were ready!
- Next week: Many to many relationships and more!
