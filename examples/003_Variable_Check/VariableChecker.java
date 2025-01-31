/*
* Examples 003: Variable Check
* Filename: VariableChecker.java
* Description: This java file will demonstrate how to check if a String variable 
* name is valid or not using booleans, for loops and if statements.
* VariableChecker is a public class that can be called by the MainTestDriver.
* The boolean method variableCheck is a part of the VariableChecker class and 
* will take in a string arugment and return true if that string is a valid 
* variable name or return false if that string is not a valid name.
*/

public class VariableChecker {
    // Constructor of VariableChecker class
    public VariableChecker() {
    }

    // Boolean method that takes String input name
    public boolean variableCheck(String name) {
        // Creates String variable with numbers
        String theNumbers = "0123456789";
        // Creates String varible with letters, numbers, and signs
        String theSigns = "$_abcdefghijklmnopqrstuvwxyz0123456789";
        // For loops to iterate through theNumbers String
        for (int i = 0; i <= 9; i++) {
            // If char at index 0 of name input equals char at index i of theNumbers
            if (name.charAt(0) == theNumbers.charAt(i)) {
                return false;
            }
        }
        // For loop to interate through the name input variable
        for (int i = 1; i < name.length(); i++) {
            // Boolean variable to return true if found
            boolean found = false;
            // For loop to iterate through theSigns String
            for (int j = 0; j < theSigns.length(); j++) {
                // If char at index i of name input equals 
                // char at index j of theSigns
                if (name.charAt(i) == theSigns.charAt(j)) {
                    // Change boolean value to true
                    found = true;
                }
            }
            // If boolean value found is true
            if (found == true) {
                // Keep going
            } 
            // Else
            else {
                return false;
            }
        }
        return true;
    }
}
