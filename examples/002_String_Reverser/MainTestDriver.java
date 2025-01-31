/*
* Examples 002: String Reverser
* Filename: MainTestDriver.java
* Description: This java file will demonstrate how to use a Main Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class MainTestDriver {
	public static void main( String[] args) {
		// Calls StringReverser class and names it theRev
		StringReverser theRev = new StringReverser();
		// Creates string type variable called word
		String word;
		// Initialzes word variable to be equal to "Griffin"
		word = "Griffin";
		// If word variable length is less than or equal to 3
		if(word.length() <= 3)
		{
			// Prints the word value
			System.out.println(word);
		}
		// Else if word varibale is larger than 3
		else
		{
			// Creates string variable answer and calls StringReverser reverser method
			String answer = theRev.reverser(word);
			// Prints string answer
			System.out.println(answer);
		}
	}
}



