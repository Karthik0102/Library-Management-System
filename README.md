Library Management System
Overview
The Library Management System** is a Java-based application designed to manage a library's basic operations, such as book management, member registration, and borrowing/returning books. It is a console-based application demonstrating object-oriented programming principles.
Features
1. Search Book by Title
   Users can search for books in the library by entering a part or full title of the book.
2. Add New Book  
   Librarians can add new books to the library's collection.
3. Register Member
   Allows registration of new library members.
4. Issue Book  
   Members can borrow books if available.
5. Return Book
   Allows members to return borrowed books.
6. List All Available Books 
   Displays all books currently in the library's collection.
7. Exit 
   Closes the application.
Prerequisites
- Java Development Kit (JDK) 8 or later.
- An IDE like Eclipse or IntelliJ IDEA or a text editor with Java support.
- Basic knowledge of Java programming.
How to Run
1. Clone this repository:
   ```bash
   git clone <repository_url>
   ```
2. Open the project in your preferred IDE or editor.
3. Compile and run the `LibraryManagementSystem.java` file.
Folder Structure
```
LibraryManagementSystem/
├── src/
│   ├── application/
│   │   └── LibraryManagementSystem.java    # Main application logic
│   ├── entity/
│   │   ├── Book.java                       # Book entity class
│   │   ├── Library.java                    # Library entity class
│   │   └── Member.java                     # Member entity class
├── README.md                               # Project documentation
└── .gitignore                              # Git ignore rules
```
Sample Data
The application comes preloaded with sample books and members. You can modify the `initializeLibrary()` method in the `LibraryManagementSystem.java` file to customize the data.

Sample Books
- Java Programming by Karthik
- Python Programming by Pallavi
- JavaScript Programming by Sreekar
- JQuery Programming by Pallavi
- HTML & CSS Programming by Harshitha
Sample Members
- Gadud1v (Gadud@gmail.com)
- Gandi1p (Gandi@gmail.com)
Usage
1. Run the application.
2. Use the menu to perform various library operations.
3. Follow on-screen instructions to complete tasks.
Example Output
```
Library Management System
1. Search Book by Title
2. Add New Book
3. Register Member
4. Issue Book
5. Return Book
6. List all available books
7. Exit
Enter your choice: 6
Listing all available books:
ID: 1, Title: Java Programming, Author: Karthik, Publisher: Sun Publishers
ID: 2, Title: Python Programming, Author: Pallavi, Publisher: Sun Publishers
...
```
Contributing
Feel free to contribute to this project by:
- Adding new features
- Improving existing code
- Reporting bugs or suggesting enhancements
  
To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with detailed information.
