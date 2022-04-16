//Addiction.java
//an addiction program that input two numbers than dsplays their sum.
import java.util.Scanner;

//program uses class Scanner

public class Addiction {

	// main method begins execution of java application
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter fisrt interger: "); //prompt
	int number1 = input.nextInt(); // reads first number from user
	
	System.out.print (" Enter second interger:"); //prompt
	int number2 = input.nextInt(); //reads second number from user
	
	int sum = number1 + number2; // this adds the two inputed number from the user, than store total sum 
	System.out.printf("Total Sum id %d%n", sum); // displays total sum
	
	}//ends method method

}//ends class addiction