import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class PoundsToDollars {
	/* a simple currency-converter program for pounds to dollars. A better program to write in the future 
	 * would utilize the creation of a new class that stored conversion rates for multiple currencies */

	public static void main(String[] args) {
		int pound;
		double dollar;
		
		System.out.print("Pounds"+"\t"+"Dollars");//the "\t" puts a tab between the words 
		System.out.println();
		
		for (pound = 1; pound <=9; pound++) {
			
			dollar = pound*1.25;
			
			System.out.println(pound+"\t"+dollar);
		
}
}
}