import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		/*Simple BMI Calculator based on user input values
		 * This program holds the class information in 'Person.java' */ 
		
	
		Scanner key = new Scanner(System.in);
	
		double w;
		double h;
		
		System.out.print("Enter your weight: ");//user inputs weight in Kg
		w = key.nextDouble();
		
		System.out.print("Enter your height: ");//user inputs height in meters 
		h = key.nextDouble();
		
		Person matt = new Person(w,h); //a new instance of 'Person' is created as an object

		System.out.println(matt.getBMI());//Calculated BMI is printed to console
	
		
		key.close();
	}

}
