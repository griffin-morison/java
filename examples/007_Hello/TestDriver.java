/*
* Examples 007: Hello
* Filename: TestDriver.java
* Description: This java file will demonstrate how to use a Test Driver file,
* which acts more as a wrapper/mechanism that organizes the tests, runs them, and 
* handles the output.
*/

public class TestDriver {
    public static void main(String[] args) {
        // Creates String varible
        String word;
        // Assigns value to String variable "word"
        word = "notebook";
        // Creates char variables for value at index 0 of "word"
        char firstLetter = word.charAt(0);
        // Creates String variable for value at index 1 of "word"
        String secondLetter = word.substring(1, 2);
        // Creates String variable for remaining index values of "word"
        String remainder = word.substring(2);
        // Demonstrates String can also be used for index 0
        String FirstLetter = word.substring(0, 1);
        // If index 0 is lowercase and "word" length greater than three
        if (Character.isLowerCase(firstLetter) && (word.length() > 3)) {
            // Print index 1 + remainder + index 0 + "erb"
            System.out.println(secondLetter +
                    remainder + firstLetter + "erb");
        }
        // If "word" length is less than or equal to three
        if (word.length() <= 3) {
            // Print "word"
            System.out.println(word);
        }
        // If index 0 is uppercase 
        if (Character.isUpperCase(firstLetter) && (word.length() > 3)) {
            // Print index 1 in uppercase + remainder + index 0 in lowercase + "erb"
            System.out.println(secondLetter.toUpperCase() +
                    remainder + FirstLetter.toLowerCase() + "erb");
        }
    } 
}
