import java.util.Scanner;
public class SwtichMoneyProg {

	public static void main(String[] args) {
		/* simple switch program to determine the value of a coin/bill */
		
		Scanner key = new Scanner(System.in);
		int denom = 0;
		System.out.print("How many cents is the coin/bill worth?");
		denom = key.nextInt();
		
		switch (denom) {
		
		case 1: System.out.println("This is a US cent");
		break;
		
		case 5: System.out.println("This is a US nickel");
		break;
		
		case 10: System.out.println("This is a US dime");
		break;
		
		case 25: System.out.println("This is a US quarter");
		break;
		
		case 50: System.out.println("This is a US half-dollar");
		break;
		
		case 100: System.out.println("This is a US dollar coin/bill");
		break;
		
		default: 
			System.out.println("This is not US currency");
		break;
		
		}
		
		System.out.println("Thanks for using the program!");
		key.close();
	}

}
