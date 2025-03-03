/*
* Lab 4: Cascading Constructors
* Filename: TestDriver.java
* Description: This java file demonstrates a Test Driver file to test the different
* types of contructors for the Animals object class.
*/

public class TestDriver {

    public static void main(String[] args) {
        // Creates default Animals object
        Animals a = new Animals();
        // Creates Animals object with name input
        Animals b = new Animals("Smokey");
        // Creates Animals object with name and species input
        Animals c = new Animals("Roger", "Rabit");
        // Creates Animals object with name, species, and color input
        Animals d = new Animals("Rocky", "Tiger", "Yellow");
        // Prints Animals objects
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
