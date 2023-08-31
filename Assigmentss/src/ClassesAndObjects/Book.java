package ClassesAndObjects;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+title);
		System.out.println("Price: "+price);
		
	}
	
	void checkBookType() {
		if(price>500) {
			System.out.println("Premium");
		}else {
			System.out.println("Standard");
		}
	}

}
