//EnergyCalculation
//program to calculate the energy needed to heat water from iniatial temperature

import java.util.Scanner; //this import the Scanner class
 
//start of program here

public class EnergyCalculation {
	// start of main method here
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the amount of water in kilograms:");
		int amount = input.nextInt();
		
		System.out.print ("Enter the Initial Temperature:"); 
		int initialTemperature = input.nextInt();
		
		System.out.print ("Enter the final temperature:");
		int finalTemperature = input.nextInt();
		
		int energy = amount * (finalTemperature - initialTemperature) * 4184; //calculating energy used
		
		System.out.print("The Energy Needed is" + energy +"Q");
				
	}
	
}