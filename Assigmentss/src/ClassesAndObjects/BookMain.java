package ClassesAndObjects;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("Java","Atif",400);
		book.getDetails();
		
		book.checkBookType();
		
		Book book1 = new Book("Java Advance","Atif",800);
		
		System.out.println("-----------------");
		book1.getDetails();
		book1.checkBookType();
		
	}

}
