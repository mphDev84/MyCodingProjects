import java.util.Scanner;

public class AreWeThereYet {

	public static void main(String[] args) {
		// another example of a while loop
		
		Scanner key = new Scanner(System.in);
        char ans;
        
        System.out.println("Are we there yet? y/n");
        ans = key.findWithinHorizon(".",  0).charAt(0);
        
        
        while (ans != 'Y' && ans !='y') {        //simple while loop that checks user input against 'y/Y'
        	System.out.println("Are We There Yet?");//if y or Y is input, loop is broken, otherwise, the loop continues
        	ans = key.findWithinHorizon(".",  0).charAt(0); 
        	
        }
        System.out.println("We're there!!");
        System.out.println();
        key.close();
		
	}

}
