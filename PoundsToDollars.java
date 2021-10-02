import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

public class PoundsToDollars {
	/* a simple currency-converter program for pounds to dollars. A better program to write in the future 
	 * would utilize the creation of a new class that stored conversion rates for multiple currencies */

	public static void main(String[] args) {
		double pound;
		double dollar;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat currency2 = NumberFormat.getCurrencyInstance(Locale.UK);
		
		System.out.print("Pounds"+"\t"+"Dollars");//the "\t" puts a tab between the words 
		System.out.println();
		
		for (pound = 1; pound <=9; pound++) {
			
			dollar = pound*1.25;
			
			String dollarTotal = currency.format(dollar);
			String poundTotal = currency2.format(pound);

			
			System.out.println(poundTotal+"\t"+ dollarTotal);
		
}
}
}