package zadacha18;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int yearOfPublish;
	private String isbnNmber;
	
	public Book(String title, String author, String publisher,
			int yearOfPublish, String isbnNmber) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublish = yearOfPublish;
		this.isbnNmber = isbnNmber;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publisher="
				+ publisher + ", yearOfPublish=" + yearOfPublish
				+ ", isbnNmber=" + isbnNmber + "]\n";
	}
	
}
