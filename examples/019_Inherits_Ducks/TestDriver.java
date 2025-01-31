/*
* Examples 019: Inherits Ducks
* Filename: TestDriver.java
* Description: This java file will test the Duck, Flock, MallardDuck, and PintailDuck
* classes. This test driver creates a Flock ArrayList and Duck objects and tests 
* the methods associated with those objects and prints outputs to the console.
*/

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creates an ArrayList of 5 Duck objects
        Flock theFlock = new Flock( 5 ); // Print Duck General Constructor 5 times
		// Calls quack method for ArrayList
        theFlock.quack(); // Prints Duck type and quack method
		
        // Creates Duck object and assigns it the value of the oldest Duck
        Duck oldest = theFlock.oldestDuck();
		System.out.println( oldest );
        // Sets age of Duck object to 5
        oldest.setAge(5);
        // Prints Duck object
        System.out.println( oldest );
        // Add Duck object to Flock
        theFlock.add(oldest);
		
        // Prints the oldest duck in the Flock ArrayList
        System.out.println( theFlock.oldestDuck() );
		// Prints the Flock ArrayList
        System.out.println( theFlock );
		
		// Creates new Duck object daffy
        Duck daffy = new Duck();
		// Prints daffy
        System.out.println(daffy);
		// Calls Duck method fly
        daffy.fly();
		// Calls Duck method quack
        daffy.quack();
		
		// Creates new Duck object donald
        Duck donald = new Duck( "donald", 5, 3, 2, 0);
		// Prints donald
        System.out.println(donald);
		// Calls Duck method fly
        donald.fly();
		// Calls Duck method quack
        donald.quack();
		
		// Creates new MallardDuck object howard
        MallardDuck howard = new MallardDuck( "howard", 1,3,5,10);
		// Prints howard
        System.out.println(howard);
		// Calls MallardDuck method fly
        howard.fly();
		// Calls MallardDuck method quack
        howard.quack();
		// Calls MallardDuck method drink
        howard.drink();
		
        // Creates new PintailDuck object foo
        PintailDuck foo = new PintailDuck( "Foo", 2, 4, 6, 0);
		// Prints foo
        System.out.println( foo );
		// Calls PintailDuck method fly
        foo.fly();
		// Calls PintailDuck method quack
        foo.quack();
		
		// Creates ArrayList of Duck objects
        ArrayList<Duck> theList = new ArrayList<Duck>();

        // Adds daffy to ArrayList
        theList.add(daffy);
        // Prints the ArrayList
        System.out.println( theList );
        // Calls Duck method quack
        // Doesn't work since ArrayList doesn't have method quack
        // theList.quack(); 
	}
}