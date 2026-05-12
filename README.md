# Library Checkout System

## Sprint 1 Checklist

- Are you in a Group?  
  No, I am working individually.

- If so, who else is in your group?  
  Not applicable.

- What programming language are you selecting? Which version?  
  Java. I am using Java 21.0.4.

- Do you have your GitHub account set up?  
  Yes.

- Do you have a public repository for your Project?  
  Yes.

- What is the link to your GitHub repository?  
  https://github.com/Hishammrahmath/LibraryCheckoutSystem.git

- If you are in a group, does everyone have access to the github repo?  
  Not applicable.

- Do you have a “Hello World” program that compiles and runs?  
  Yes.

- Where is the entry point to your project?  
  `src/main/Main.java`

## Project Idea

My project idea is to create a Library Checkout System. The system will allow a library to manage books, members, checkouts, and returns. Users will be able to view available books, check out books, return books, and track the current status of each book.

This project is large enough to later demonstrate six custom design patterns because it can include different responsibilities such as managing books, handling checkout rules, creating different user roles, tracking transactions, and organizing the library system in a modular way.

## Planned Features

- Add and store book information
- View all books in the library
- Track whether a book is available or checked out
- Register library members
- Allow a member to check out a book
- Allow a member to return a book
- Display checkout status clearly
- Build the project using object-oriented programming principles

## Possible Libraries and Utilities

I may use the following libraries or Java utilities as the project develops:

- JUnit 5 for unit testing
- Java Collections Framework for storing books, members, and checkout records
- Java Scanner for console input
- JavaFX or Swing if I decide to add a graphical interface later
- Optional file handling utilities if I decide to save library records to a file

## Sprint 2 Progress

For Sprint 2, I selected my project idea, listed possible libraries, and started adding working code toward the Library Checkout System. I created basic classes for books, members, and library operations. I also plan to make at least four meaningful commits toward the project.

## Sprint 3 Progress

For Sprint 3, I made progress by refactoring the Library Checkout System to use two custom design patterns from class while preserving the basic checkout and return functionality.

The first design pattern implemented is the Builder Pattern. `Book` is the product, `IBookBuilder` defines the builder steps, and `BookBuilder` is the concrete builder. `Main.java` now creates books through the builder by setting the title, author, book ID, genre, and year published instead of directly calling a long constructor.

The second design pattern implemented is the Strategy Pattern. `CheckoutPolicy` is the strategy interface, and `StandardCheckoutPolicy` and `StudentCheckoutPolicy` are concrete strategies. `Library` depends on the `CheckoutPolicy` interface instead of a specific policy class. The policy controls checkout rules by limiting how many books a member can check out. `Main.java` demonstrates using the standard policy first and then switching to the student policy.

## Final Submission Plan

For the final submission, I plan to demonstrate adding books, registering members, checking out books, returning books, and showing how the design patterns make the system easier to extend. I will explain that the Builder Pattern makes book creation cleaner when book details grow, and the Strategy Pattern makes checkout rules easier to change without rewriting the main library checkout code.

## Sprint 3 Problems or Risks

Everything currently compiles and runs. The main challenge was refactoring the original simple code to use design patterns without making it too complicated for the project size. A possible risk is that future features, such as due dates or fines, may require adding more checkout tracking logic.
