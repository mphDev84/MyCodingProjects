import java.util.Scanner;
public class NestedState {

	public static void main(String[] args) {
		// This program introduces nested statements
		
		System.out.print("Input your age: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if (age >=18) {
			System.out.println("What is your favorite food? ");
			String food = sc.nextLine();
			if (food.equals("pizza")) {	//here we cannot use ==, as this is for numerical only
				System.out.println("mine too!");//'food' is a string, so we use '.equals'
			}
			else {
				System.out.println("not mine!!");
			}
		}
		else if (age >=13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are not an adult OR teenager");
			
		}
		sc.close();
	}

}
