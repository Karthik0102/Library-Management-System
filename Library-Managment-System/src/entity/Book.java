package entity;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private boolean isAvailable;

	public Book() {
		super();
	}

	public Book(int id, String title, String author, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.isAvailable = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	// get the details of the book
	public String getBookDetails() {
		return "Book Id: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher
				+ "\nIs Available: " + isAvailable;
	}

	// to check if book is available
	public boolean checkAvailability() {
		return isAvailable;
	}

}
