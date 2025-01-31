/*
* Examples 010: File Example 3
* Filename: FileTestDriver.java
* Description: This java file will demonstrate how to read and edit a text file.
*
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTestDriver {
    public static void main(String[] args) {
        try {
            // Create FileReader to read "results.txt" file
            FileReader file = new FileReader("results.txt");
            // Create BufferedReader to read the file
            BufferedReader reader = new BufferedReader(file);

            // String to store each line of text
            String line;
            // Iterate through each line in the file
            while ((line = reader.readLine()) != null) {
                // Perform word manipulation
                char firstLetter = line.charAt(0);
                String remainder = line.substring(1);
                
                // If first letter is lowercase and word is greater than 3 letters
                if (Character.isLowerCase(firstLetter) && line.length() > 3) {
                    // Print word with first letter moved to end + "erb"
                    System.out.println(remainder + firstLetter + "erb");
                } 
                // Else if word is less than or equal to 3 letters
                else if (line.length() <= 3) {
                    // Print unmodified text
                    System.out.println(line);
                } 
                // Else if first letter is uppercase and word is greater than 3 letters
                else if (Character.isUpperCase(firstLetter) && line.length() > 3) {
                    // Print word with first letter moved to end, lowercase,
                    // and second letter capitalized + "erb"
                    String secondLetter = line.substring(1, 2).toUpperCase();
                    String newRemainder = line.substring(2);
                    System.out.println(secondLetter + newRemainder + Character.toLowerCase(firstLetter) + "erb");
                }
            }

            // Close the reader
            reader.close();
        } 
        // Catch block for handing exceptions with input and output to a file
        catch (IOException ex) {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}