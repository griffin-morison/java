public class Encrypter {
    // Character array with alphabet lowercase
    private char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z' };
    // Character array for code
    private char[] code;

    // Parameterized constructor
    public Encrypter(int shift) {
        // Creates new character array the length of alphabet
        code = new char[alphabet.length];
        // For loop to iterate code array and shift by input number
        for (int i = 0; i < code.length; i++) {
            // Stores shifted letters in code array
            code[i] = alphabet[(i + shift) % alphabet.length];
        }
    }

    // Encrypt method for string
    public String encrypt(String words) {
        // String placeholder to store result
        String result = "";
        // For loop to iterate word length and encrypt each letter
        for (int i = 0; i < words.length(); i++) {
            result = result + encrypt(words.charAt(i));
        }
        return result;
    }

    // Encrypt method for character
    public char encrypt(char aChar) {
        // For loop to iterate alphabet length
        for (int i = 0; i < alphabet.length; i++) {
            // If alphabet letter is equal to input character
            if (alphabet[i] == aChar) {
                // Return code at index i
                return code[i];
            }
        }
        // Otherwise return input character
        return aChar;
    }

    // String decrypt method
    public String decrypt(String words) {
        // String placeholder to store result
        String result = "";
        // For loop to iterate word length and decrypt each letter
        for (int i = 0; i < words.length(); i++) {
            result = result + decrypt(words.charAt(i));
        }
        return result;
    }

    // Decrypt method for character
    public char decrypt(char aChar) {
        // For loop to iterate code length
        for (int i = 0; i < code.length; i++) {
            // If code letter is equal to input character
            if (code[i] == aChar) {
                // Return alphabet at index i
                return alphabet[i];
            }
        }
        // Otherwise return input character
        return aChar;
    }
}
