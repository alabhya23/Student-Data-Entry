# Student-Data-Entry
Student Management System – Java Console Application
Description
This is a Java-based console application to manage student records efficiently. It allows adding, displaying, searching, updating, and deleting student details using an object-oriented approach. The system uses custom exceptions for error handling and ensures clean, maintainable code.

Features
Add new student details

Display all student records

Search by:

PRN (Permanent Registration Number)

Name

Branch

Batch

CGPA

Position

Update CGPA of a student

Delete a student record

Exception handling using:

InvalidStudentDataException

StudentNotFoundException

File Structure
pgsql
Copy
Edit
/StudentManagementSystem
│
├── Main.java                        # Entry point with menu-driven UI
├── Student.java                     # Student class with attributes & display method
├── StudentOperations.java           # Handles all CRUD and search operations
├── InvalidStudentDataException.java # Custom exception for invalid input
└── StudentNotFoundException.java    # Custom exception for not found cases
Requirements
Java 8 or above

Command line or any Java IDE (e.g., IntelliJ, Eclipse, BlueJ)

How to Run
Compile all .java files:

bash
Copy
Edit
javac *.java
Run the program:

bash
Copy
Edit
java Main
Follow the on-screen menu to perform operations.

Sample Student Attributes
PRN: 22CS1234

Name: John Doe

Branch: Computer Science

Batch: 2022

CGPA: 8.5

Position: 1

Notes
Input validation is handled via custom exceptions.

Position is 0-based index as per ArrayList storage.

Future scope includes file handling, GUI, and database integration.

Author
Alabhya Sharma
