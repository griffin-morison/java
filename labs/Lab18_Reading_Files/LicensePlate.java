import java.io.Serializable;

public class LicensePlate implements Serializable{
	private String state;
	private String plateNumber;
	
	public LicensePlate(String place, String number)
	{
		state = place;
		plateNumber = number;
	}
	
	public String toString()
	{
		return state + ": " + plateNumber;
	}
}

