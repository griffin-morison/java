/*
* Examples 003: Variable Check
* Filename: MainTestDriver.java
* Description: This java file will demonstrate how to use a Main Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class MainTestDriver {

    public static void main(String[] args) {
        String theVariableName = "Foo";
        VariableChecker theChecker = new VariableChecker();
        boolean isValid = theChecker.variableCheck(theVariableName);
        System.out.println("The Variable " +
                theVariableName + " is valid? " + isValid);
    }
    
}
