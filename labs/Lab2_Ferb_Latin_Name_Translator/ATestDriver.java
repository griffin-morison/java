/*
* Lab 2: Ferb Latin Name Translator
* Filename: ATestDriver.java
* Description: This java file demonstrates how to use A Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class ATestDriver {
	public static void main(String[] args) {
		// Calls FerbTranslator class and names it theTran
		FerbTranslator theTran = new FerbTranslator();
		// Creates string type variable called word
		String word;
		// Initialzes word variable to be equal to "Justin"
		word = "Justin";
		// If word variable length is less than or equal to 3
		if(word.length() <= 3) 
		{
			// Prints the word value
			System.out.println(word);
		}
        // Else if word varibale is larger than 3
		else
        {
			// Creates string variable answer and calls FerbTranslator translator method
			String answer = theTran.translator(word);
			// Prints string answer
			System.out.println(answer);
		}
	}
}