public class FruitDriver {

	public static void main(String[] args) {
		// Creates GoldenDelicious (Fruit) object
        Fruit fruit = new GoldenDelicious();
		// Creates Orange object
        Orange orange = new Orange();
		// Create Macintosh (Apple) object
        Apple apple = new Macintosh();
		
		// Question 1: Is the object fruit an instance of Fruit?
		System.out.println(fruit instanceof Fruit); //returns true or Yes
		// Question 2: Is the object fruit an instance of Orange?
		System.out.println(fruit instanceof Orange); //returns false or No 
		// Question 3: Is the object fruit an instance of Apple?
		System.out.println(fruit instanceof Apple); //returns true or Yes
		// Question 4: Is the object fruit an instance of GoldenDelicious?
		System.out.println(fruit instanceof GoldenDelicious); //returns true or Yes
		// Question 5: Is the object fruit an instance of Macintosh?
		System.out.println(fruit instanceof Macintosh); //returns false or No
		// Question 6: Is the object orange an instance of Orange?
		System.out.println(orange instanceof Orange); //returns true or Yes
		// Question 7: Is the object orange an instance of Fruit?
		System.out.println(orange instanceof Fruit); //returns true or Yes
		// Question 8: Suppose the method makeAppleCider() is defined only in the Apple class. 
        // Can fruit invoke this method? Can apple invoke this method? 
        // Fruit cannot invoke this method, but apple can.
		//fruit.makeAppleCider(); //doesn't work because method not in Fruit class
		apple.makeAppleCider(); 
		// Question 9: Does it make sense to add a makeAppleCider() method to the Fruit class? Why or why not?
		// No, because you can't make AppleCider with any type of Fruit, only type Apple
		// Question 10: Now suppose the method makeAppleCider() is defined in the Apple, GoldenDelicious, and Macintosh classes. 
        // Identify the class of the method that is invoked when apple invokes the makeAppleCider() method.
		apple.makeAppleCider(); // Apple class
		// Question 11: Suppose the method makeOrangeJuice is defined in the Orange class. 
        // Can orange invoke this method? Can fruit invoke this method?
		orange.makeOrangeJuice(); // Orange class can invoke the method, but not Fruit class cannot.
		//fruit.makeOrangeJuice(); // Doesn't work because method not in Fruit class 
		// Question 12: Is the statement Orange p = new Apple() legal?
		//Orange p = new Apple(); // Doesn't work because Apple is not of type Orange
		// Question 13: Is the statement Macintosh p = new Apple() legal?
		//Macintosh p = new Apple(); // Doesn't work because Macintosh is of type Apple
		// Question 14: Is the statement Apple p = new Macintosh() legal?
		Apple p = new Macintosh(); // Works and creates new Macintosh object named p
	}

}
