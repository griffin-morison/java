/**
 * Example 012: Book
 * Filename: Book.java
 * @author Griffin Morison
 *
 * Description: This java file represents the Book class and contains
 * private variables. Book is a public class that can be called by
 * the Test Driver. The public class has four private variables for 
 * myTitle, myPublishYear, myAuthor (belongs to Person class), and myRating. 
 * The public constructor takes in those variables as input.
 *
 */

public class Book {
	// Private variables for Person object
    private String myTitle;
	private int myPublishYear;
	private Person myAuthor;
	private int myRating;
	// Public constructor method which takes variables as inputs
    public Book( String title, int year, Person author, int rating ) {
		myTitle = title;
		myPublishYear = year;
		myAuthor = author;
		myRating = rating;
	}
	// Get method for book title
    public String getTitle() {
		return myTitle;
	}
    // Get method for book publish year
	public int getPublishYear() {
		return myPublishYear;
	}
	// Get method for person author
    public Person getAuthor() {
		return myAuthor;
	}
	// Get method for book publish year
    public double getRating() {
		return myRating;
	}
	// To String method for printing Book
    public String toString() {
		return myTitle + " " + myPublishYear + " " + myAuthor + " " + myRating;
	}
}
