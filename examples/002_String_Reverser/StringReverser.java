/*
* Examples 002: String Reverser
* Filename: StringReverser.java
* Description: This java file will demonstrate how to create a class and method.
* StringReverser is a public class that can be called by the MainTestDriver.
* The method reverser is a part of the StringReverser class and will take in a
* string arugment and return a modified version of that string as follows: 
* Capitialized second charcter, first charcter moved to the end of the string arugment,
* and "erb" added to the end. 
*/

public class StringReverser {
	// Constructor of StringReverser class
	public StringReverser() {
	}
	// reverser method of StringReverser that takes in a string argument, 
	// and returns a string
	public String reverser( String inString) {
		// Creates string varible theResult which is "" blank ending in "erb"
		String theResult = "" + "erb";
		// Modifies string theResult using substring method which returns part of 
		// the string
		theResult = 
				// Adds index from 1,2 to theResult and makes upper case
				inString.substring(inString.length() + 1 - inString.length(),
				inString.length() - inString.length() + 2).toUpperCase()
				// Adds index 2 through the end of the string length
				+ inString.substring(2, inString.length())
				// Adds index 0 and makes lower case
				+ inString.substring(0,1).toLowerCase() 
				// Adds "erb"
				+ theResult;
		
				// Prints true is char is upper case
				System.out.println( Character.isUpperCase( 'A' ) );
				// Prints false is char is not upper case
				System.out.println( Character.isUpperCase( 'a' ) );
				// Returns theResult of reverser method
				return theResult;
	}
}