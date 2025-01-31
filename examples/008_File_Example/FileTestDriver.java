/*
* Examples 008: File Example
* Filename: FileTestDriver.java
* Description: This java file will demonstrate how to use a read text files.
*
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileTestDriver {
    public static void main(String[] args) {
        // Try block to read text file
        try {
            Scanner theScanner = new Scanner(new FileInputStream("people.txt"));
            // While text file has a next line
            while (theScanner.hasNextLine()) {
                // String variable to store first String
                String firstName = theScanner.next();
                // String variable to store second String
                String lastName = theScanner.next();
                // Integer variable to store first integer
                int birthYear = theScanner.nextInt();
                // Integer variable to store second integer
                int deathYear = theScanner.nextInt();
                // Creates Person object and inputs variables from text file
                Person p = new Person(firstName, lastName, birthYear, deathYear);
                // Prints Person object
                System.out.println(p);
            }
        }
        // Catch exception if file is not found
        catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex.getMessage());
        }
    }
}
