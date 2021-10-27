import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
public class MilesPerGallonApp {

	public static void main(String[] args) {
		
	/* this program includes a method to check the validity of the data entered by the user - in this case whether it is a numerical 'double' value*/
		
		Scanner sc = new Scanner(System.in);
		
		double miles = getDouble(sc, "Enter the number of miles travelled: ");
		
	
		double gas = getDouble(sc, "Enter how many gallons of gas used: ");
		

		BigDecimal BigMiles = new BigDecimal(miles);
		BigDecimal BigGas = new BigDecimal(gas);
		MathContext mc = new MathContext(10);
		
		
		BigDecimal mpg = BigMiles.divide(BigGas, mc).setScale(3, RoundingMode.HALF_UP);;
		System.out.print("The number of Miles travelled per gallon is: "+mpg);
	}
	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
				
			}else {
				System.out.println("Error! Invalid number. Try again");
			}
			sc.nextLine();
		}
		return d;	
	}
}
