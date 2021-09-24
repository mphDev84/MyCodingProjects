import java.util.Scanner;
public class Plumber {

	public static void main(String[] args) {
		
		/* a simple program to calculate the amount owed to a plumber for work carried out */
		
		double a = 75;// initial charge of $75 for turning up ;)
		double b;
		double totalhours;
		double totalcost;
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many hours did the plumber work? ");
		b = key.nextDouble();
		
		totalhours = b*125; //$125 per hour worked
		totalcost = totalhours+a;
		
		System.out.println("Total cost of plumber: "+totalcost);

		key.close();
	}

}
