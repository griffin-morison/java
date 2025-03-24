public class InstrumentDriver {

	public static void main(String[] args) {
	    // Instrument v = new Instrument("Violin"); // Cannot instantiate an abstract class
        // Instrument v = new Violin(); // Proper way

        // Creates an array of Instruments
        Instrument[] band = new Instrument[3];
		// Creates Instruments in array
        band[0] = new ElectricGuitar(6);
		band[1] = new Violin();
		band[2] = new ElectricGuitar(8);
		
		// For loop to iterate array length
        for (int i = 0; i < band.length; i++)
		{
			// Call play method for each Instrument
            band[i].play();
		}
		
	}

}
