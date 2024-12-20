package entity;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int id;
	private String name;
	private String email;
	private List<Book> borrowedBooks;

	public Member(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.borrowedBooks = new ArrayList<>();
	}

	public Member() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	// Borrow a book
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
		System.out.println(name + " borrowed " + book.getTitle());
	}

	// Return a book
	public void removeBook(Book book) {
		borrowedBooks.remove(book);
		System.out.println(name + " returned " + book.getTitle());

	}

	public void borrowedBooks() {
		System.out.println("Borrowed Books ");
		for (Book book : borrowedBooks) {
			book.getBookDetails();
		}
	}

}
