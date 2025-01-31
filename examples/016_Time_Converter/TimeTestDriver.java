/*
* Examples 016: Time Converter
* Filename: TimeTestDriver.java
* Description: This java file will test the TimeConverter class. This test driver 
* creates a TimeConverter object and tests the functions of the class by printing
* results to the console.
*/

public class TimeTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Converts days to hours
        System.out.println( TimeConverter.daysToHours(1)); // prints 24.0
		// Prints MINUTES_IN_HOURS double 
        System.out.println( TimeConverter.MINUTES_IN_HOURS); // prints 60.0
		
        // Illegal call since MINUTES_IN_HOURS is a final variable
        // TimeConverter.MINUTES_IN_HOURS = 100.0;
		
		// Creates TimeConverter object
        TimeConverter theConverter = new TimeConverter();
		// Calls the minutesToSeconds function
        System.out.println( theConverter.minutesToSeconds( 10)); // prints 600.0
		
		
	}

}