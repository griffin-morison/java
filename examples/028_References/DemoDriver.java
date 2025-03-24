
public class DemoDriver {

	public static void main(String[] args) {
		
        // Creates Pet object 'aDog'
        Pet aDog = new Pet("Peaches", 7, 40);
		System.out.println(aDog); // Prints 'aDog' (name: Peaches, age: 7, weight: 40.0)
		
		// Creates copy of 'aDog'
        Pet anotherDog = aDog;
		// Compares Pet objects
        System.out.println(anotherDog == aDog); // Prints true since copy reference
		
		// Creates Pet object 'thirdDog'
        Pet thirdDog = new Pet("Peaches", 7, 40);
		System.out.println(thirdDog == aDog); // Prints false since different references
		System.out.println(thirdDog.equals(aDog)); // Prints true since variables are equal
		
		int age = 21;
        Pet.changer(age); // Tests changer int method 
		System.out.println(age); // Prints 21, since only a copy of age was passed
		
		Pet.changer(thirdDog); // Tests changer Pet method 
		System.out.println(thirdDog); // Prints 'thirdDog' with changed age
        // (name: Peaches, age: 8, weight: 40.0)
	
		// Creates Neighbor object
        Neighbor myNeighbor = new Neighbor("The Smiths", 0 , aDog);
		// Creates copy Neighbor object
        Neighbor anotherNeighbor = new Neighbor(myNeighbor);
		// Sets name to "The Millers"
        anotherNeighbor.setName("The Millers");
		// Creates Pet 'p' object equal to 'anotherNeighbor' Pet
        Pet p = anotherNeighbor.getPet();
		// Sets Pet 'p' name to "Fido"
        p.setName("Fido");
		System.out.println(myNeighbor); // Prints 'myNeighbor' (name: The Smiths, children: 0, 
        // pets: (name: Peaches, age: 7, weight: 40.0))
		System.out.println(anotherNeighbor); // Prints 'anotherNeighbor' (name: The Millers, children: 0, 
        // pets: (name: Fido, age: 7, weight: 40.0))

	}

}
