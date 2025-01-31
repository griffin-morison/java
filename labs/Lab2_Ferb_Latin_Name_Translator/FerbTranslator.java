/*
* Lab 2: Ferb Latin Name Translator
* Filename: FerbTranslator.java
* Description: This java file will demonstrate how to create a class and method.
* FerbTranslator is a public class that can be called by ATestDriver.
* The method translator is a part of the FerbTranslator class and will take in a
* string arugment and return a modified version of that string as follows: 
* Capitialized second charcter, remaining string, first charcter moved to the end 
* of the string arugment, and "erb" added to the end. 
*/

public class FerbTranslator {
	// Constructor of StringReverser class
	public FerbTranslator() {
	}
	// translator method of FerbTranslator that takes in a string argument, 
	// and returns a string
	public String ferbLatinName( String inString) {
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
		// Returns theResult of reverser method.
		return theResult;
	}
}