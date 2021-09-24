import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TimesTable {

	public static void main(String[] args) {
		/* this program creates a 'Times-Table' given user input*/
		
		Scanner key = new Scanner(System.in);
		
		int num, num2;
		
		System.out.print("Enter a number:");
		num = key.nextInt();
		
		
		for (int x=1; x<=num; x++) { //introducing the variable 'x' and giving it value=1, we can now
									//use the 'for' loop to print the numbers beginning at '1'. 
			System.out.print(x+"\t");
		
	
			for (int y=1; y<=num; y++) { //here we add new variable 'y' and use that with 'x' to multiply
										//out the times table 
			System.out.print(y*x +("\t"));
				
			}
			System.out.println();
		}
		
		key.close();
}
	}


