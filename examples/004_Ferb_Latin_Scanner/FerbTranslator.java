// This is a comment
/*
 * This is a "c" style comment
 */
/**
 * This is an implementation of Ferb Latin Translation
 * @author Griffin Morison
 *
 */
public class FerbTranslator {
	/**
	 * Default Constructor
	 */
	public FerbTranslator() {
	}

	/**
	 * Method to convert name to Ferb Latin
	 * 
	 * @param aName - Name to be translated into Ferb Latin
	 * @return - converted name
	 */
	// String method that takes a String input
	public String ferbLatinName(String aName) {
		// If input String length is greater than or equal to 3
		if (aName.length() >= 3) {
			// String variable for input String index 0
			String firstLetter = aName.substring(0, 1);
			// String variable for input String index 1
			String secondLetter = aName.substring(1, 2);
			// String variable for input String after index 2
			String remainder = aName.substring(2);

			// Return index 1 uppercase + string after index 2 + index 0 lowercase + erb
			return secondLetter.toUpperCase() +
					remainder +
					firstLetter.toLowerCase() +
					"erb";
		}
		// Else if String length is less than 3
		else {
			// Return the String input
			return aName;
		}
	}
}