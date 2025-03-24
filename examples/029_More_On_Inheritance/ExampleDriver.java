public class ExampleDriver {
	public static void main(String[] args) {
		
        Person p1 = new Person(); // Creates new Person object with no name
        System.out.println(p1); // Prints Person object with no name
        p1.setName("Mark"); // Sets name to "Bob"
        System.out.println(p1); // Prints Person object with name "Bob"
        Person p2 = new Person("Helly"); // Creates new Person object with name "Helly"
        System.out.println(p2); // Prints Person object with name "Helly"
        System.out.println(p1.sameName(p2)); // Prints false as names not equal
        
        Student s1 = new Student(); // Creates new Student object with no name
		System.out.println(s1); // Prints Student object with no name
		Student s2 = new Student("Dylan", 12345); // Creates new Student object with name and id
		System.out.println(s1.equals(s2)); // Prints false since name and id not equal
		s1.set("Dylan", 12345); // Sets s1's name and id
		System.out.println(s1); // Prints s1 with updated name and id
        System.out.println(s1.equals(s2)); // Prints true since name and id are equal
	
		Employee e1 = new Employee(); // Create new Employee object 'e1' with no name, id, salary
		System.out.println(e1); // Prints 'e1' object with no name, id, salary
		Employee e2 = new Employee("Erving", "12345ABC", 200000); // Creates new Employee 'e2' with name, id, salar
		System.out.println(e2); // Prints 'e2' object
		e2.set("Burt", "CBA54321", 400000); // Sets 'e2' obejct name, id, salary
		System.out.println(e2); // Prints updated 'e2' object
		
		Undergraduate ug1 = new Undergraduate("Fred", 12345, 1); // Creates Undergraduate object 'ug1'
		System.out.println(ug1); // Prints Undergraduate object
		Student s3 = ug1; // Creates Student object equal to 'ug1'
		System.out.println(s3); // Prints Student object
		Person p3 = ug1; // Creates Person object equal to 'ug1'
        System.out.println(p3); // Prints Person object
		
	}
}
