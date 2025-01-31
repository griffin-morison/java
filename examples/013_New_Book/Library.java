/**
 * Example 013: New Book
 * Filename: Library.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Library class and contains
 * an ArrayList of Book objects and private variables. Library is a public class 
 * that can be called by the Test Driver. The public class has an ArrayList of 
 * Book objects. The class four methods, add to the ArrayList, getNumberOfBooks from
 * the ArrayList, printAllBookWithRating which prints all book objects with a specified
 * rating, and printAllBooks which prints all book objects in the ArrayList.
 *
 */

// Imports the java ArrayList library
import java.util.ArrayList;

public class Library {
	// Private ArrayList that contain Book objects
    private ArrayList<Book> myBooks;
	// Public constructor method
	public Library() {
		// Creates new ArrayList
        myBooks = new ArrayList<Book>();
	}
	// Add method to append Book object to ArrayList
    public void add( Book aBook) {
		myBooks.add( aBook );
	}
	// Get method that returns the number of Book objects in ArrayList
    public int getNumberOfBooks(){
		return myBooks.size();
	}
	// Print method to print books with a specified rating
    public void printAllBookWithRating(int rating){
		for( Book someBook: myBooks ){
			if( someBook.getRating() == rating ){
				System.out.println( someBook );	
			}
		}
	}
	// Print method to print all books in ArrayList
    public void printAllBooks() {
		for(int i = 0; i < myBooks.size(); i++) {
			System.out.println(myBooks.get(i).toString() );
        }		
	}			
}
		

		
			
		

