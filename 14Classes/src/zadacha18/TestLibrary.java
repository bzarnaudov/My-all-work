package zadacha18;

public class TestLibrary {
	public static void main(String[] args) {
		Library library1 = new Library();
		
		
		library1.addBook("Ga me hvanesh", "Gosho", "fer", 2001, "B255503");
		library1.addBook("Ga me hvanesh20", "Peter", "fer", 2001, "B255503");
		library1.addBook("Ga me hvanesh35", "Gosho", "fer", 2001, "B255503");
		library1.addBook("Ga me hvanesh45", "Peter", "fer", 2001, "B255503");
		library1.addBook("Ga me hvanesh50", "Peter", "fer", 2001, "B255503");
		library1.addBook("Ga me hvanesh55", "Gosho", "fer", 2001, "B255503");
		
		
		System.out.println(library1.searchForBookWithAuthor("Peter"));
		System.out.println(library1.infoForBook("Ga me hvanesh"));
		System.out.println(library1.removeBook("Ga me hvanesh20"));
		System.out.println(library1);
		System.out.println(library1.removeBooksWithAuthor("Peter"));
	
		System.out.println(library1);
		library1.allBooks();
		library1.allBooksRemove("Gosho");
		System.out.println(library1);

	}
}
