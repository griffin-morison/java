
public class Encrypter {
    // Private char array for alphabet
    // private char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f',
    //         'g', 'h', 'i', 'j', 'k', 'l',
    //         'm', 'n', 'o', 'p', 'q', 'r',
    //         's', 't', 'u', 'v', 'w', 'x',
    //         'y', 'z' };
    private char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
    // Private char array for code
    private char[] code;

    // Encrypter constructor with shift input
    public Encrypter(int shift) {
        // Set code array to size of alphabet array
        code = new char[alphabet.length];
        // For loop to iterate code array
        for (int i = 0; i < code.length; i++) {
            // If char is UpperCase
            if(Character.isUpperCase(alphabet[i])){
                // Set letter at index i equal to (i + shift) % 26
                code[i] = alphabet[(i + shift) % 26];
            }
            // Else char is LowerCase
            else{
                // Set letter at index i equal to ((i + shift) % 26) + 26
                code[i] = alphabet[((i + shift) % 26) + 26];
            }
        }
    }
    // String function to encrypt word(s)
    public String encrypt(String words) {
        // String result value
        String result = "";
        // For loop to iterate the word(s) length
        for (int i = 0; i < words.length(); i++) {
            // Set result equal to encrypted word(s) index i value
            result = result + encrypt(words.charAt(i));
        }
        return result;
    }
    // Char function to encrypt a char
    public char encrypt(char aChar) {
        // For loop to iterate alphabet length or 26
        for (int i = 0; i < alphabet.length; i++) {
            // If alphabet i index equals char return coded value
            if (alphabet[i] == aChar) {
                return code[i];
            }
        }
        // Else return char
        return aChar;
    }
    // String function to decrypt word(s)  
    public String decrypt(String words) {
        // String result value
        String result = "";
        // For loop to iterate the word(s) length
        for (int i = 0; i < words.length(); i++) {
            // Set result equal to decrypted word(s) index i value
            result = result + decrypt(words.charAt(i));
        }
        return result;
    }
    // Char function to decrypt a char
    public char decrypt(char aChar) {
        // For loop to iterate alphabet length or 26
        for (int i = 0; i < code.length; i++) {
            // If alphabet i index equals char return coded value
            if (code[i] == aChar) {
                return alphabet[i];
            }
        }
        // Else return char
        return aChar;
    }
}
