public class HotDogStandDriver {

    public static void main(String[] args) {

        // Prints id and sold
        System.out.println("StandID		Number Sold");
        System.out.println("**************");

        // Creates new HotDogStand objects
        HotDogStand stand1 = new HotDogStand();
        HotDogStand stand2 = new HotDogStand();

        // For loop to run 10 times
        for (int i = 0; i < 10; i++) {
            // Calls sold method for stand1
            stand1.justSold();
            // Inner for loop to run 3 times
            for (int a = 0; a < 3; a++) {
                // Calls sold method for stand2
                stand2.justSold();
            }
        }

        // Prints output for stand1 and stand2
        System.out.println("Denver01:	" + stand1.getNumber());
        System.out.println("Denver02:	" + stand2.getNumber());

        // Creates new HotDogStand stand3 object
        HotDogStand stand3 = new HotDogStand();
        // Calls sold method for stand3
        stand3.justSold();
        // Prints output for stand3
        System.out.println("Aurora01:	" + stand3.getNumber());

        // Prints total sold for all stands
        System.out.println("Total sold =	" + HotDogStand.getTotal());
    }
}
