
public class EncryptionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // Create Encrypter object and set shift to 7
        Encrypter e = new Encrypter(7);
        
        //Create message "hello there"
        String message = "Hello There";
        // Encrypt message
        String encrypted = e.encrypt(message);
        // Decrypt message
        String decrypted = e.decrypt(encrypted);
        // Print original, encrypted, and decrypted
        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
        
        // Create String foo and encrypt "hi there"
        String foo = e.encrypt("hi there");
        System.out.println(foo);
        // Decrypt foo
        System.out.println(e.decrypt(foo));
    }

}
