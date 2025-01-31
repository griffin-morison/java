/*
* Examples 014: Animal
* Filename: TestDriver.java
* Description: This java file will test the Animal class. This test driver 
* creates Animal objects and tests printing those Animal objects to the console.
*/

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Creates Animal objects
        Animal a = new Animal();
		Animal b = new Animal("Smokey");
		Animal c = new Animal("Roger", "Rabit");
		Animal d = new Animal("Rocky", "Tiger", "Yellow");
		
		// Prints Animals to console
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}