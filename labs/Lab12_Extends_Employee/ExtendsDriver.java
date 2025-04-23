public class ExtendsDriver {
	public static void main(String[] args) {
		// Creates Person objects and tests class
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("Steve");
		System.out.println(p2);
		p1.setName("Steve");
		System.out.println(p1.sameName(p2));
		
		// Creates Student objects and tests class
		Student s1 = new Student();
		System.out.println(s1);
		Student s2 = new Student("Alex", 12345);
		System.out.println(s2);
		s1.set("John", 54321);
		System.out.println(s1);
		s2.setName("John");
		s2.setStudentNumber(54321);
		System.out.println(s1.sameStudent(s2));
		
		// Creates Employee objects and tests class
		Employee e1 = new Employee();
		System.out.println(e1);
		Employee e2 = new Employee("George", "12345ABC", 200000);
		System.out.println(e2);
		e1.setName("Bob");
		e1.setEmployeeID("CBA54321");
		e1.setSalary(400000);
		System.out.println(e2);
		System.out.println(e1.sameEmployee(e2));
		
	}
}
