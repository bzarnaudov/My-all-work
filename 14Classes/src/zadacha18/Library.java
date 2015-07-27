package zadacha18;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private String name;
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void addBook(String title, String author, String publisher,
			int yearOfPublish, String isbnNmber) {
	    Book newBook = new Book(title, author, publisher, yearOfPublish,isbnNmber);
	    bookList.add(newBook);
	}
	
	public ArrayList<Book> searchForBookWithAuthor(String author) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book b: bookList) {
			if (author.compareTo(b.getAuthor()) == 0) {
				result.add(b);
			}
		}
		return result;
	}
		
	public Book infoForBook(String title) {
		for (Book b: bookList) {
			if (title.compareTo(b.getTitle()) == 0) {
				return b;
			}
		}
		return null;
	}
	
	public String removeBook(String title) {
		for (Book b: bookList) {
			if (title.compareTo(b.getTitle()) == 0) {
				bookList.remove(b);
				return "book is removed";
			}
		}
		return "there is no book with this name";
	}

	public String removeBooksWithAuthor(String author) {
		int[] indexOfList = new int[bookList.size()];
		int i = 0;
		for (Book b: bookList) {
			if (author.compareTo(b.getAuthor()) == 0) {
				indexOfList[i] = bookList.indexOf(b)+1;
				System.out.println("book " + b.getTitle() + " is removed");
				i++;
			}
		}
		for ( int k = 0; k < bookList.size(); k++) {
			if (indexOfList[k] == 0) {
				break;
			}
			bookList.remove(indexOfList[k]-1-k);
		}
		return "There is no books with this author anymore";
	}
	
	public void allBooks() {
		int i = 1;
		for (Iterator<Book> it = bookList.iterator(); it.hasNext();) {
			System.out.println("Book " + i + " is: " + it.next());
			i++;
		}
	}
	
	public void allBooksRemove(String author) {
		for (Iterator<Book> it = bookList.iterator(); it.hasNext();) {
			if (author.equals(it.next().getAuthor())) {
				it.remove();
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Library [name=" + name + "\nbookList=" + bookList + "]";
	}
	
}
