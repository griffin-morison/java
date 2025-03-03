/*
* Lab 5: Static Distance Converter
* Filename: DistanceTestDriver.java
* Description: This java file demonstrates a Test Driver file to test the different
* static methods of the DistanceConverter class. These methods include functions such
* as converting feet to miles, miles to feet, miles to kilometers, and kilometers to miles.
*/

public class DistanceTestDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Converts miles to feet
        System.out.println(DistanceConverter.milesToFeet(26.2)); // prints 138336.0
        // Converts miles to kilometer
        System.out.println(DistanceConverter.milesToKilometers(26.2)); //prints 42.164708
        // Prints KILOMETERS_IN_A_MILES double
        System.out.println(DistanceConverter.KILOMETERS_IN_A_MILES); //prints 1.60934

         // Creates DistanceConverter object
         DistanceConverter theConverter = new DistanceConverter();
         // Calls the feetToMiles function
         System.out.println( theConverter.feetToMiles(10560)); // prints 2.0
         // Calls the kilometersToMiles function
         System.out.println( theConverter.kilometersToMiles(42.164708)); // prints 26.2
    }

}
