package entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> bookList;
	private List<Member> memberList;

	public Library() {
		super();
		this.bookList = new ArrayList<>();
		this.memberList = new ArrayList<>();
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void registerMember(Member member) {
		memberList.add(member);
	}

	public List<Book> searchBookByTitle(String title) {
		List<Book> matchingBooks = new ArrayList<Book>();

		String lowerCaseTitle = title.toLowerCase();

		for (Book book : matchingBooks) {
			if (book.getTitle().toLowerCase().contains(lowerCaseTitle)) {
				matchingBooks.add(book);
			}
		}
		return matchingBooks;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public Book findBookById(int id) {

		for (Book book : bookList) {
			if (book.getId() == id)
				return book;
		}
		return null;
	}

	public Member findMemberById(int id) {
		for (Member member : memberList) {
			if (member.getId() == id) {
				return member;
			}
		}
		return null;
	}

	public void issueBook(int bookId, int memberId) {

		Book book = findBookById(bookId);
		Member member = findMemberById(memberId);

		if (book != null && book.isAvailable() && member != null) {
			member.borrowBook(book);
			book.setAvailable(false);
			System.out.println("Book issued successfully.");
		} else {
			System.out.println("Book cannot be issued. Check Details.");
		}
	}

	public void returnBook(int bookId, int memberId) {
		Book book = findBookById(bookId);
		Member member = findMemberById(memberId);

		if (book != null && member != null && member.getBorrowedBooks().contains(book)) {
			member.removeBook(book);
			book.setAvailable(true);
			System.out.println("Book returned successfully.");
		} else {
			System.out.println("Return Failed. Check details!");
		}
	}
}
