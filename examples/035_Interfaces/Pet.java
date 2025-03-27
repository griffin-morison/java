
/**
 * Class for basic pet records: name, age, and weight.
 */
public class Pet implements Comparable, Cloneable {
    private String name;
    private int age;// in years
    private double weight;// in pounds
    private Person owner;

    // toString method
    public String toString() {
        return ("Name: " + name + " Age: " + age + " years"
                + "\nWeight: " + weight + " pounds\n Owner: " + owner.getName());
    }

    // Parameterized constructor
    public Pet(String initialName, int initialAge, double initialWeight) {
        name = initialName;
        // Edge case to check age and weight are greater than zero
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        // Else set age and weight
        else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    // Set method for name, age, and weight
    public void set(String newName, int newAge, double newWeight) {
        name = newName;
        // Edge case to check age and weight are greater than zero
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        // Else set age and weight
        else {
            age = newAge;
            weight = newWeight;
        }
    }

    // Parameterized constructor for name
    public Pet(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    // Set name method
    public void setName(String newName) {
        name = newName;
    }

    // Parameterized constructor for age
    public Pet(int initialAge) {
        name = "No name yet.";
        weight = 0;
        // Edge case to check age greater than zero
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        // Else set age
        else {
            age = initialAge;
        }
    }

    // Set age method
    public void setAge(int newAge) {
        // Edge case to check age greater than zero
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        // Else set age
        else {
            age = newAge;
        }
    }

    // Parameterized constructor for weight
    public Pet(double initialWeight) {
        name = "No name yet";
        age = 0;
        // Edge case to check weight greater than zero
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } 
        // Else set weight
        else {
            weight = initialWeight;
        }
    }

    // Set weight method
    public void setWeight(double newWeight) {
        // Edge case to check weight greater than zero
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        // Else set weight
        else {
            weight = newWeight;
        }
    }

    // Default constructor
    public Pet() {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    // Get name method
    public String getName() {
        return name;
    }

    // Get age method
    public int getAge() {
        return age;
    }

    // Get weight method
    public double getWeight() {
        return weight;
    }

    // Compare Pet object method
    public int compareTo(Object other) {
        Pet otherPet = (Pet) other;
        // return name.compareTo(otherPet.name);
        // If age is greater than otherPet
        if (age > otherPet.age) {
            return 1;
        } 
        // If age is less than otherPet
        else if (age < otherPet.age) {
            return -1;
        } 
        // Else if equal
        else {
            return 0;
        }
    }

    // Clone object method
    public Object clone() {
        try {
            // return super.clone();
            // Create copy of Pet
            Pet copy = (Pet) super.clone();
            // Set owner 
            copy.owner = (Person) this.owner.clone();
            return copy;
        } 
        // Catch exception for clone not supported
        catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Get owner method
    public Person getOwner() {
        return owner;
    }
    
    // Set owner method
    public void setOwner(Person newOwner) {
        owner = newOwner;
    }
}
