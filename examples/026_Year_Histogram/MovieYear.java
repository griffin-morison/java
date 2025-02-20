import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class MovieYear {	
    // Private int array of 2010 values
    private int[] theYears = new int [2010];
    // Private Scanner object
    private Scanner theScanner = null;
		
    // Default constructor
    public MovieYear() {
}
// Void function to load data from a string path
public void loadData(String aString) {
	
    // Try block which creates new Scanner object and reads in string input
    try {
		theScanner = new Scanner( new FileInputStream( aString ));
	} 
    // Catch block to handle if the file cannot be found
    catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// While loop to iterate through file
    while( theScanner.hasNextLine() ){
		// Store next line as string
        String aLine = theScanner.nextLine();
		// Creates a string array of values before and after '##'
        String[] theInfo = aLine.split( "##");
        // Stores int value for year as index 1 or after '##'
		int theYear = Integer.parseInt(theInfo[1]);
		// Increments theYear index in int array
        theYears[theYear] += 1;
	}
    // Closes the Scanner object
    theScanner.close();
}

// Void function to print Movie year and number of occurances
public void printMovieYear(){
	System.out.println( "Year  		  " + "		Occurance");
	for( int i = 1927; i < 2010; i++ ){
			System.out.println( i + "		" + "		"	+ theYears[i]);
		}
    }
}
