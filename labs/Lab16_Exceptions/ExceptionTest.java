import java.text.ParseException;

public class ExceptionTest {

	public static void main(String[] args) {
		// Question #1
		int waitTime = 46;
		try {
			System.out.println("Try block entered Q1");
			if (waitTime > 30) {
				throw new Exception("Time Limit Exceeded Q1");
			}
			System.out.println("Leaving try block Q1");
		} catch (Exception e) {
			System.out.println("Exception Q1: " + e.getMessage());
		}
		System.out.println("After catch block Q1");
		// Question #2
		int waitTime2 = 12;
		try {
			System.out.println("Try block entered Q2");
			if (waitTime2 > 30) {
				throw new Exception("Time Limit Exceeded Q2");
			}
			System.out.println("Leaving try block Q2");
		} catch (Exception e) {
			System.out.println("Exception Q2: " + e.getMessage());
		}
		System.out.println("After catch block Q2");
		// Question #3
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 2;
		}
		try {
			System.out.println(numbers[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught Q3");
		}
		// Question #4
		int[] numbers2 = new int[5];
		for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = i * 2;
		}
		try {
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught Q4");
		}
		// Question #5
		// a.
		int dividend = 1;
		int divisor = 0;
		try {
			int quotient = dividend / divisor;
			System.out.println(quotient);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException / by zero caught Q5a");
		}

		// b.
		int[] listOfInts = new int[6];
		try {
			System.out.println(listOfInts[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught Q5b");
		}

		// c.
		String[] listOfStrings = new String[6];
		try {
			System.out.println(listOfStrings[6].length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught Q5c");
		}

		// d.
		String[] listOfStrings2 = new String[6];
		try {
			System.out.println(listOfStrings2[5].length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught Q5d");
		}

		// e.
		String s = "abc";
		try {
			System.out.println(s.charAt(3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught Q5e");
		}

		// f.
		String s2 = "12.XXX";
		try {
			Double d = Double.parseDouble(s);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException caught Q5f");
		}

		// g.
		Object o = new Object();
		try {
			String s3 = (String) o;
		} catch (ClassCastException e) {
			System.out.println("ClassCastExceptioncaught Q5g");
		}
	}
}
