import java.util.Scanner;

public class DateConverter {
	public static void main(String[] args) {	
		
		Scanner keyboard = new Scanner(System.in);
		   String answer;
		   do
		   {
		       System.out.println("Enter an integer representing the month: ");

		       int month = keyboard.nextInt();

		       System.out.println("Enter an integer representing the day: ");

		       int day = keyboard.nextInt();

		       DateConverter.convert(month, day);

		       System.out.println();

		       System.out.println("Do you want to convert another date? Enter Y or N");

		       answer = keyboard.next();

		   } while (answer.equalsIgnoreCase("Y"));
		}
	
	public static void convert(int month, int day)
	{
		try{
		if(month > 12 || month < 1)
		{
			throw new MonthException("Month is not valid" + "\n" + "Cannot convert this date");
		}
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
		if(day > 31 || day < 1)
			{
			throw new DayException("Day is not valid" + "\n" + "Cannot convert this date");
			}	
		}
		if(month == 4 || month == 6 || month == 9 || month == 11)
		{
		if(day > 30 || day < 1)
			{
			throw new DayException("Day is not valid" + "\n" + "Cannot convert this date");
			}	
		}
		if(month == 2)
		{
		if(day > 28 || day < 1)
			{
			throw new DayException("Day is not valid" + "\n" + "Cannot convert this date");
			}	
		}
		}
		catch(MonthException e)
		{
			System.out.println(e.getMessage());
		}
		catch(DayException e)
		{
			System.out.println(e.getMessage());
		}
		switch(month)
		{
		case 1: if(month == 1 && day <= 31 && day >= 1)
		{	
		System.out.println("January " + day);
		}
		case 2: if(month == 2 && day <= 28 && day >= 1)
		{
		System.out.println("Febuary " + day);
		}
		case 3: if(month == 3 && day <= 31 && day >= 1)
		{
		System.out.println("March " + day);
		}
		case 4: if(month == 4 && day <= 30 && day >= 1)
		{
		System.out.println("April " + day);
		}
		case 5:	if(month == 5 && day <= 31 && day >= 1)
		{
		System.out.println("May " + day);
		}
		case 6: if(month == 6 && day <= 30 && day >= 1)
		{
		System.out.println("June " + day);	
		}
		case 7:	if(month == 7 && day <= 31 && day >= 1)
		{
		System.out.println("July " + day);
		}
		case 8: if(month == 8 && day <= 31 && day >= 1)
		{
		System.out.println("August " + day);
		}
		case 9: if(month == 9 && day <= 30 && day >= 1)
		{
		System.out.println("September " + day);
		}
		case 10: if(month == 10 && day <= 31 && day >= 1)
		{
		System.out.println("October " + day);
		}
		case 11: if(month == 11 && day <= 30 && day >= 1)
		{
		System.out.println("November " + day);
		}
		case 12: if(month == 12 && day <= 31 && day >= 1)
		{
		System.out.println("December " + day);
		}
		break;
		}
	} 
}




