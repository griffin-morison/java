/*
* Examples 009: File Example 2
* Filename: FileTestDriver.java
* Description: This java file will demonstrate how to write to text files.
*
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTestDriver {
    public static void main(String[] args) {
        // Try block to write to text file
        try {
            // Create PrintWriter and output results.txt file
            PrintWriter theWriter = new PrintWriter(new FileOutputStream("results.txt"));
            // Write "Hello World!" to text file
            theWriter.println("Hello World!");
            // CLose PrintWriter
            theWriter.close();
        } 
        // Catch block for handing exceptions with input and output to a file
        catch (IOException ex) {
            System.err.println("An error occurred during file operations: " + ex.getMessage());
        }
    }
}
