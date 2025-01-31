/*
* Examples 001: Hello World
* Filename: Greeting.java
* Description: This java file will demonstrate how to initialze 
* variables and print lines. It will also use the Scanner utility
* to save user input.
*/

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        // Creates variable greeting "Hello"
        String greeting = "hello";
		// Prints greeting
        System.out.println(greeting);
        //Prints index of 'h' in greeting
        System.out.println(greeting.indexOf("h"));
		// Creates variable n "myName"
        String n = "myName";
		// Prints character at index 2 of "myName"
        System.out.println(n.charAt(2));
        
        // Scanner utility stdIn
        Scanner stdIn = new Scanner(System.in);
        // Character variable entry
        char entry;
        do
        {
            // Print line to prompt user to enter eithe 'y' or 'n'
            System.out.println("Please enter either: y or n");
            // Saves scanner character at index 0
            entry = stdIn.next().charAt(0);
    }
    // While scanner entry doesn't equal 'y' or 'n' continue to print
    while(entry != 'y' && entry != 'n');
    // Close scanner
    stdIn.close();
	}
}
