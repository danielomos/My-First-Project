// comparison.java
//to compare intergers useing if statemets, relational operators and equility operators.

import java.util.Scanner; //program to use Scanner class

public class comparison {
	
	//main method begins execution  of java application
	
	public static void main (String[] args) {
	//create Scanner to obtain input from commad line
		Scanner input = new  Scanner (System.in);
	
		System.out.print("Enter first interger: ");//prompt
		int number1 = input.nextInt(); // read the first number from user
	
		System.out.print("Enter second intergers: "); //prompt
		int number2 = input.nextInt(); //read the second number from the user
	
		if (number1 == number2) {
			System.out.printf ("%d == %d%n", number1, number2);
		}
		
		if (number1 != number2) {
			System.out.printf("%d ! = %d%n" , number1, number2);
		}
		
		if (number1 < number2) {
			System.out.printf("%d < %d%n" , number1, number2);
		}
		
		if (number1 > number2) {
			System.out.printf("%d > %d%n" , number1, number2);
		}
		
		if (number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2);
		}
		
		if (number1 >= number2) {
			System.out.printf("%d >=%d%n" , number1, number2);
		}
			
	}// this end main method

}//this ends comparison class