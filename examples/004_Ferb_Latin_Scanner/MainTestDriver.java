/*
* Examples 004: Ferb Latin Scanner
* Filename: TestDriver.java
* Description: This java file will demonstrate how to use a Main Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

import java.util.Scanner;

public class MainTestDriver {
    public static void main(String[] args) {
        // Scanner utility theScanner
        Scanner theScanner = new Scanner(System.in);
        // String varaible
        String word = "NotQuit";
        // While word does not equal "quit" loop
        while (!word.equalsIgnoreCase("quit")) {
            // Print line to prompt user to enter a name
            System.out.println("Please enter a name: ");
            // Saves scanner input in String
            word = theScanner.next();
            // If word does not equal "quit"
            if (!word.equalsIgnoreCase("quit")) {
                // Store word in new String variable
                String theFirstName = word;
                // Prints line to user
                System.out.println("You entered:" + theFirstName);
                // Calls FerbTranslator class and names it translator
                FerbTranslator translator = new FerbTranslator();
                // Prints line to user applying ferbLatinName String method
                System.out.println("Ferb Translation is: " + translator.ferbLatinName(theFirstName));
            }
        }
        // Close Scanner
        theScanner.close();
        // Prints line to user
        System.out.println("Thank you for using the Ferb Translator");
    }
}
