import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class PrintStars {

	public static void main(String[] args) throws FileNotFoundException {
		/*this program uses a loop within a loop to print a user-specified number of stars */
		
		Scanner key = new Scanner(System.in);
		int star;
		char a = 'y';
			
		
		while (a == 'y') {
			
			System.out.println("Would you like to see stars? Y/N");
			a = key.findWithinHorizon(".",0).charAt(0);
		if (a != 'y') {
			break; //breaks out of the loop to the next method, 'ok, see you later'. I understand this is
					//viewed as 'bad form', but is used here for educational purposes. 
		}
			System.out.println("How many stars would you like to see?");
			star = key.nextInt();
		
			while (star > 0) {
				System.out.print('*');
				star --;
		
			}	
		}
		
		System.out.println("ok, see you later");
		
		key.close();
		
	}
}
