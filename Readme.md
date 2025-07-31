# Sprint 1, Task 8: Lambdas
This repository implements the solutions of the exercises about Lambda functions in Java.

## 📁 Project Structure
The project is implemented in Java, organized into packages by topic. Each class demonstrates a specific language feature, emphasizing modularity and clarity through functional programming constructs.

## 💻 Technologies
Java 21+  
IntelliJ IDEA (Recommended)  
No external libraries (pure Java)  

## Project Overview

### 📘 Level 1

#### Exercise 1
A method that, given a list of String elements, returns a new list containing only the strings that include the letter 'o' was implemented. 
The logic uses Java Streams and filter() to perform the operation concisely. The filtered result is printed to the console.

#### Exercise 2
An additional constraint was added to the previous exercise: the strings must contain the letter 'o' and be longer than 5 characters.
This is achieved using stream chaining with multiple conditions. The result is displayed using a terminal operation.

#### Exercise 3
A list of month names is created using List.of(). Each month is printed using a lambda expression via forEach().

#### Exercise 4
The same list of months is printed using a method reference (System.out::println) instead of a lambda, demonstrating alternative syntax for readability.

#### Exercise 5
A Functional Interface named PiValueProvider containing a method getPiValue() that returns a double was defined. The interface is implemented using a lambda expression inside main(), returning the value 3.1415.
The method is invoked and the result is printed to the console.

#### Exercise 6
A List<Object> containing numbers and strings was created. The list is filtered to include only the string elements, which are then sorted by length in ascending order.

#### Exercise 7
The same string list is sorted again, but this time in descending order based on string length, demonstrating usage of Comparator.reverseOrder() in combination with lambdas.

#### Exercise 8
A custom Functional Interface named StringReverser is declared with a method reverse(String input).
In main(), a lambda expression is used to define the method body, which returns the reversed version of the input string.
The method is then tested with a sample input, and the result is printed.

## ✅ Best Practices Followed
- Functional programming with lambdas and method references  
- Stream API usage for filtering, mapping, and sorting  
- Clear separation of logic into dedicated methods  
- Use of custom functional interfaces for enhanced expressiveness  
- Modular and testable code design  

## ▶️ How to Run
- Clone the repository  
- Open the project in IntelliJ IDEA  
- Run Main.java to see console output for all exercises  
- No additional dependencies or configuration is required  

## 👨‍💻 Author
Developed by Daniel Caldito Serrano as part of the Java Back-end Development Bootcamp at the IT Academy.