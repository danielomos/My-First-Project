//ConvertPoundsToKilograms
//program to convert pounds to kilograms

import java.util.Scanner;

//begings class

public class ConvertPoundsToKilograms {
	//main method begins
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + "pounds is" + kilograms + "kilograms" );
		
		
	}// ends main method
	
	
	
	
} // ends class