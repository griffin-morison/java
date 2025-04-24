import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileDriver extends Exception {

	public static void main(String[] args) {
		
		Scanner inputStream = null;
		try
		{
			inputStream = new Scanner(new FileInputStream("Advice.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.print("Error opening the file Advice.txt");
		}

		String myAdvice = inputStream.nextLine();
		
		System.out.println("My advice is: " + myAdvice);
		inputStream.close();

		Scanner keyboard = new Scanner(System.in);
		String yourAdvice;
		
		System.out.println("Enter your advice: ");
		yourAdvice = keyboard.nextLine();
		  
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(new FileOutputStream("Advice.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.print("Error opening the file Advice.txt");
			System.exit(0);
		}
		outputStream.println(yourAdvice);
		System.out.println("My advice is: " + yourAdvice);
		outputStream.close();
	}

}