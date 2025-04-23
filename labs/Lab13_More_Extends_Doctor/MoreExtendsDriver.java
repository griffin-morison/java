public class MoreExtendsDriver {
    public static void main(String[] args) {

        // Creates Person objects and tests class
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("Steve");
		System.out.println(p2);
		p1.setName("Steve");
		System.out.println(p1.sameName(p2));
        
        // Creates Doctor objects and tests class
        Doctor d1 = new Doctor();
        System.out.println(d1);
        Doctor d2 = new Doctor("Dr. Spock", "Pediatrician", 50);
        System.out.println(d2);
        Doctor d3 = new Doctor("Dr. Spock", "Pediatrician", 50);
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        d1.setName("Dr. Spock");
        d1.setSpecialty("Pediatrician");
        d1.setOfficeVisitFee(50);
        System.out.println(d1.equals(d2));

    }
}
