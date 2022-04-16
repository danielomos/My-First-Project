//ConvertFeetToMeters.java
//program to convert feet to meter

import java.util.Scanner; //this import the Scanner class


	public class ConvertFeetToMeters {
	
	
	
		//main method begins
		
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a value in feet: ");
		double feet = input.nextDouble();
		double meters = feet * 0.305;
				
			System.out.println( feet + "feet is" + meters + "meters" );
			
	}
	
	
	
}