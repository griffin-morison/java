/*
* Lab 5: Static Distance Converter
* Filename: DistanceConverter.java
* Description: This java file represents the DistanceConverter class and contains
* public static final variables, indicating that the values won't change. DistanceConverter
* is a public class that can be called by the DistanceTestDriver. The public class has 
 * two public static final double variables for FEET_IN_A_MILE, and KILOMETERS_IN_A_MILES.
 * In this file we also declare four double functions that convert feetToMiles, 
 * milesToFeet, kilometersToMiles, and milesToKilometers, which can be called in the 
 * TimeTestDriver, with the necessary input.
 *
 */

public class DistanceConverter {
    // Public final variables for DistanceConverter object
    public static final double FEET_IN_A_MILE = 5280.0;
    public static final double KILOMETERS_IN_A_MILES = 1.60934;

    // Double method to convert feet to miles
    public static double feetToMiles(double feet) {
        return feet / FEET_IN_A_MILE;
    }

    // Double method to convert miles to feet
    public static double milesToFeet(double miles) {
        return FEET_IN_A_MILE * miles;
    }

    // Double method to convert kilometers to miles
    public static double kilometersToMiles(double kilometers) {
        return kilometers / KILOMETERS_IN_A_MILES;
    }

    // Double method to convert miles to kilometers
    public static double milesToKilometers(double miles) {
        return KILOMETERS_IN_A_MILES * miles;
    }
}
