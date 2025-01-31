/*
* Examples 013: New Book
* Filename: TestDriver.java
* Description: This java file will test the Book, Library, and Person classes.
* This test driver creates objects for each of the classes, Library, Person, and Book 
* and tests the methods of the classes to show how they interact together.
*/

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creates new Library object
        Library theLibrary = new Library();
		
		// Creates new Person objects
		Person kermit = new Person( "Kermit", "The Frog", 1980, 2010);
		Person clarke = new Person( "Arthur", "Clarke", 1991, 2020);
		
        // Creates new Book objects
        Book theBook;
		theBook = new Book( "It's Not Easy Being Green", 2001 , kermit, 3);
		Book theOtherBook = new Book( "2010", 1995, clarke, 5);
		
		// Adds Book objects to Library 
        theLibrary.add( theBook );
		theLibrary.add( theOtherBook );
		
		// Tests Library method to print all books
        theLibrary.printAllBooks();
		// Tests Library method to print all books with ratings of 5
        theLibrary.printAllBookWithRating(5);
		 
	}
}


