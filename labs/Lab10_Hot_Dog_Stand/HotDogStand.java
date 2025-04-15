public class HotDogStand {
    // Private variables
    private int hotDogID;
    private static int numOfHotDogsSold = 0;

    // Default constructor
    public HotDogStand() {
        // Set id to 0
        hotDogID = 0;
    }

    // Parameterized constructor
    public HotDogStand(int num) {
        // if num is less than 0
        if (num < 0) {
            // Set id and sold to 0
            hotDogID = 0;
            numOfHotDogsSold = 0;
        }
        // Else
        else {
            // Set id and sold to num
            hotDogID = num;
            numOfHotDogsSold += num;
        }
    }

    // Sold method
    public void justSold() {
        // Increment id and sold
        hotDogID++;
        numOfHotDogsSold++;
    }

    // Get id method
    public int getNumber() {
        return hotDogID;
    }

    // Get sold method
    public static int getTotal() {
        return numOfHotDogsSold;
    }
}
