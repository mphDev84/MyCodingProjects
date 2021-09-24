import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Narcissist {

	public static void main(String[] args) {
		/* This is a simple program that takes user input (name) and uses a 'for' loop to print out 
		 * that input a specified number of times */
		
		Scanner key = new Scanner(System.in);
		String name;
		int howMany;
		
		System.out.println("Enter your name:");
		name = key.nextLine(); //users name is stored
		
		System.out.println("How many times would you like to see your name?");
		howMany = key.nextInt(); //user specifies how many times the 'for' loop will repeat
		
		for ( ; howMany > 0 ; ) {
			System.out.println(name);
			howMany --; 
		}
		
		System.out.println("Thanks for playing!");
		key.close();
	}
	

}
