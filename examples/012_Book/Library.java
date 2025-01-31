/**
 * Example 012: Book
 * Filename: Library.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Library class and contains
 * an arry of Book objects and private variables. Library is a public class 
 * that can be called by the Test Driver. The public class has an array of 
 * Book objects and two private variables for myNumberOfBooks, mySpaceAvailable. 
 * The public constructor does not take in any variables as input.
 *
 */

public class Library {
	// Private variables for Library object
    private Book[] myBooks;
	private int myNumberOfBooks;
	private int mySpaceAvailable;
	// Public constructor method
	public Library() {
		// Sets available space in array to 10
        mySpaceAvailable = 10;
		myBooks = new Book[ mySpaceAvailable ];
		myNumberOfBooks = 0;
	}
	// Add method to append Book object to array
    public void add( Book theBook) {
		// If space is available add Book object
        if( myNumberOfBooks < mySpaceAvailable){
            myBooks[myNumberOfBooks] = theBook;
            myNumberOfBooks++;
		}
		// Else if no space available, double the mySpaceAvailable variable
        else{
			mySpaceAvailable = 2* mySpaceAvailable;
			// Create new array of double the size
            Book[] shelf = new Book[ mySpaceAvailable ];
			// Copy old books to new array
            for( int i = 0; i< myNumberOfBooks; i++) {
				shelf[i] = myBooks[i];
			}
			// Reassign the reference
            myBooks = shelf;
			// Add new book and increment count
            myBooks[myNumberOfBooks] = theBook;
			myNumberOfBooks++;
		}
	}
    // Print method to print books with a specified rating
    public void printAllBookWithRating(int rating){
		for( Book someBook: myBooks ){
			if( someBook != null && someBook.getRating() == rating ){
				System.out.println( someBook );
            }	
		}
	}
}
		