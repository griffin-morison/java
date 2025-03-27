import java.util.Arrays;

public class InterfaceDemoDriver {

	public static void main(String[] args) {
		
		Pet myDog = new Pet("Peaches", 7, 40.0);
		Person owner = new Person("Susanne");
		myDog.setOwner(owner);
		Pet twinDog = (Pet) myDog.clone();
		Person twinOwner = twinDog.getOwner();
		twinOwner.setName("Evil Owner");
		System.out.println(myDog); // Print Pet Peaches
		System.out.println(twinDog); // Print Clone Pet Peaches

        // Createa Array of Pets object
        Pet[] p = new Pet[5];
		p[0] = new Pet("Foxy", 5, 47.5);
		p[1] = new Pet("Fluffy", 8, 19);
		p[2] = new Pet("Flipper", 35, 360);
		p[3] = new Pet("Tiny", 2, 5.5);
		p[4] = new Pet("Bowser", 6, 52.5);

        // Creates Array of Person objects
        Person[] o = new Person[5];
        o[0] = new Person("Fiona");
        o[1] = new Person("Hagrid");
        o[2] = new Person("Finn");
        o[3] = new Person("Crash");
        o[4] = new Person("Mario");
		
		// For loop to assign owners and print Pets
        for(int i = 0; i < p.length; i++)
		{
		    p[i].setOwner(o[i]);
            System.out.println(p[i]);
		}
	}

}
