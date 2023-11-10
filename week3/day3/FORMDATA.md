# Week 3 - Day 3 - Forms & Session

## Office Hour
- Q & A

## Lecture

### Objectives 
- Use session to allow data to persist even after a redirect
- Send form data throught a post request and handle that data in the controller
- use flashAttributes to show temporary messages after redirect

### Session
- Used to store data that persists over multiple requests without using a database
- HttpSession class
- session.getAttribute(key)
- session.setAttribute(key, value)
- session.isNew() -> returns true if the session has not been established yet
- session.invalidate() -> destroys the session and all key/value pairs associated with it (should happen when you logout)

### Forms
- name attribute
- @RequestParams
- redirect

### Flash 
- RedirectAttributes
- addFlashAttribute

### Wrap Up
- Assignments
- DQs
- Next Week:
  - Database implementation
  - JPA & CrudRepository
  - Full CRUD Java