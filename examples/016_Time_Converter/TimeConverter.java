/**
 * Example 016: Time Converter
 * Filename: TimeConverter.java
 * @author Griffin Morison
 *
 * Description: This java file represents the TimeConverter class and contains
 * public static final variables, indicating that the values won't change. TimeConverter
 * is a public class that can be called by the TimeTestDriver. The public class has 
 * three public static final double variables for SECONDS_IN_MINUTE, MINUTES_IN_HOURS,
 * and HOURS_IN_DAY. In this file we also declare three double functions that convert 
 * minutesToSeconds, hoursToMinutes, and daysToHours, which can be called in the 
 * TimeTestDriver, with the necessary input.
 *
 */

public class TimeConverter {
    // Public final variables for TimeConverter object
    public static final double SECONDS_IN_MINUTE = 60.0;
	public static final double MINUTES_IN_HOURS = 60.0;
	public static final double HOURS_IN_DAY = 24.0;
	
	// Double method to convert minutes to seconds
	public static double minutesToSeconds( double minutes ) {
		return SECONDS_IN_MINUTE * minutes;
	}
	// Double method to convert hours to minutes
    public static double hoursToMinutes( double hours ) {
		return MINUTES_IN_HOURS * hours;
	}
	// Double method to convert days to hours
    public static double daysToHours( double days ) {
		return HOURS_IN_DAY * days;
	}
}
