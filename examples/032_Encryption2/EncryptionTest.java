
public class EncryptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Create new Encrypter object
        Encrypter e = new Encrypter( 7 );
        
        //Create message "hello there"
        String message = "hello there";
        // Encrypt message
        String encrypted = e.encrypt(message); // olssv aolyl
        // Decrypt message
        String decrypted = e.decrypt(encrypted); // 
        // Print original, encrypted, and decrypted
        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
	}

}
