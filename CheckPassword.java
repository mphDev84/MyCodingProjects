/*
 * This program works!
 */
import java.util.Scanner;
import static java.lang.System.out;

class CheckPassword {
	
	/*simple program to check user entered password - note that we cannot use '==' here to compare
	 * strings like we do with int, or double etc. We must use '.equals() for strings */

    public static void main(String args[]) {
        Scanner key = new Scanner(System.in);
        String password = "swordfish";
        String userInput;
        
        out.print("What's the password?: ");
        userInput = key.next();
        
        if (password.equals(userInput)) { 
        	out.println("You're ok!");
        } else {
        	out.println("Wrong, better luck next time!");
        }
        key.close();
    }
}
