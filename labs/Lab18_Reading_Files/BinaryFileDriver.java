import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BinaryFileDriver {

	public static void main(String[] args) {
		try
		{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("plates.data"));
			
			LicensePlate l1 = new LicensePlate("CO", "ABC-123");
			LicensePlate l2 = new LicensePlate("NC", "XYZ-6789");
			LicensePlate l3 = new LicensePlate("MT", "15-5432");
			
			outputStream.writeObject(l1);
			outputStream.writeObject(l2);
			outputStream.writeObject(l3);
			
			outputStream.close();
			
			System.out.println("Data sent to file.");
			
		}
		catch(IOException e)
		{
			System.out.println("Problem with file output.");
		}
		
		try
		{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("plates.data"));
			
			LicensePlate read1 = (LicensePlate) inputStream.readObject( );
			LicensePlate read2 = (LicensePlate) inputStream.readObject( );
			LicensePlate read3 = (LicensePlate) inputStream.readObject( );
			
			System.out.println(read1.toString());
			System.out.println(read2.toString());
			System.out.println(read3.toString());
	
			inputStream.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find plates.data");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Problems with file input.");
			System.exit(0);
		}
		catch(EOFException e)
		{
			System.out.println("Cannot find file plates.data");
		}
		catch(IOException e)
		{
			System.out.println("Problem with input from file plates.data");
		}
	}
}




