//YearsInMinutes
// program to finds numbers of years and days in a given minutes

import java.util.Scanner;

// class begins here

public class YearsInMinutes{
	
	//Main method to begins here
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the Number of minutes: "); // user to enters minutes
		int minutes = input.nextInt();
		
		int years = minutes/525600;
		int minutesleft  = minutes % 525600;
		int days = minutesleft/1440;
		
		System.out.println (minutes + "minutes is approximately" + years + "years and" + days + "days");
		//main method ends		
	}
		
}