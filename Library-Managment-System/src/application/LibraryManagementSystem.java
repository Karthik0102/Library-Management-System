package application;

import java.util.List;
import java.util.Scanner;

import entity.Book;
import entity.Library;
import entity.Member;

public class LibraryManagementSystem {

	public static void main(String[] args) {

		Library library = new Library();
		initializeLibrary(library);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			printMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter book title to search: ");
				String title = scanner.nextLine();
				List<Book> books = library.searchBookByTitle(title);
				if (books.isEmpty()) {
					System.out.println("No books found.");
				} else {
					for (Book book : books) {
						String bookDetails = book.getBookDetails();
						System.out.println(bookDetails);
					}
				}
				break;
			case 2:
				System.out.println("Enter Book Id: ");
				int bookId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter book title: ");
				String bookTitle = scanner.nextLine();
				System.out.print("Enter author name: ");
				String author = scanner.nextLine();
				System.out.print("Enter publisher name: ");
				;
				String publisher = scanner.nextLine();
				Book newBook = new Book(bookId, bookTitle, author, publisher);
				library.addBook(newBook);
				System.out.println("Book added successfully.");
				break;
			case 3:
				System.out.println("Enter member Id: ");
				int memberId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter member name: ");
				String name = scanner.nextLine();
				System.out.print("Enter member email: ");
				String email = scanner.nextLine();
				Member newMember = new Member(memberId, name, email);
				library.registerMember(newMember);
				System.out.println("Member registered successfully.");
				break;
			case 4:
				System.out.println("Enter book ID to issue: ");
				int issueBookId = scanner.nextInt();
				System.out.println("Enter member Id: ");
				int issueMemberId = scanner.nextInt();
				library.issueBook(issueBookId, issueMemberId);
				break;
			case 5:
				System.out.print("Enter book ID to return: ");
				int returnBookId = scanner.nextInt();
				System.out.print("Enter member ID: ");
				int returnMemberId = scanner.nextInt();
				library.returnBook(returnBookId, returnMemberId);
				break;
			case 6:
				System.out.println("Listing all available books:");
				List<Book> avBooks = library.getBookList();
				if (avBooks.isEmpty()) {
					System.out.println("No books available in the library.");
				} else {
					for (Book book : avBooks) {
						String bookDetails = book.getBookDetails();
						System.out.println("Books Available are : " + bookDetails);
					}
				}
				break;
			case 7:
				System.out.println("Exiting program.");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}

		}
	}

	private static void initializeLibrary(Library library) {
		library.addBook(new Book(1, "Java Programming", "Karthik", "Sun Publishers"));
		library.addBook(new Book(2, "Python Programming", "Pallavi", "Sun Publishers"));
		library.addBook(new Book(3, "JavaScript Programming", "Sreekar", "Sun Publishers"));
		library.addBook(new Book(4, "JQuery Programming", "Pallavi", "Sun Publishers"));
		library.addBook(new Book(5, "HTML & CSS Programming", "Harshitha", "Sun Publishers"));

		library.registerMember(new Member(1, "Gadud1v", "Gadud@gmail.com"));
		library.registerMember(new Member(2, "Gandi1p", "Gandi@gmail.com"));

	}

	private static void printMenu() {
		System.out.println("\nLibrary Management System");
		System.out.println("1. Search Book by Title");
		System.out.println("2. Add New Book");
		System.out.println("3. Register Member");
		System.out.println("4. Issue Book");
		System.out.println("5. Return Book");
		System.out.println("6. List all available books");
		System.out.println("7. Exit");
		System.out.print("Enter your choice: ");
	}

}
