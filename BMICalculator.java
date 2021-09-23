import java.util.Scanner;
public class BMICalculator {

	public static void main(String[] args) {
		//Simple BMI Calculator based on user input values 
		
		Person p = new Person();
		Scanner key = new Scanner(System.in);
		Double BMI;
		
		System.out.print("Enter your weight: ");//user inputs weight in Kg
		p.weight = key.nextDouble();
		
		System.out.print("Enter your height: ");//user inputs height in meters 
		p.height = key.nextDouble();
		
		BMI = p.weight/(Math.pow(p.height, 2));
		
		System.out.println("Your BMI is: "+BMI);//caluclated BMI is printed to console
	
		

	}

}
