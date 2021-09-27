import java.text.NumberFormat;
import javax.swing.JOptionPane;


public class MoreMoney {

	public static void main(String[] args) {
		
		/* this program uses the 'javax.swing.JOptionPane' import to produce an 'option pane', or small 
		 * window, to take user input, and '1' to it and format the resulting double into dollar 
		 * currency */
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String inputString = JOptionPane.showInputDialog("Enter an amount"); //take user input
		double inputAmount = Double.parseDouble(inputString);//convert 'string' into 'double'
		
		double oneMore = inputAmount+1;
		String oneMoreMoney = currency.format(oneMore);//format the double to show Dollar currency
		
		String message = "One more than that amount is "+oneMoreMoney+ ".";
		JOptionPane.showMessageDialog(null, message);//output message in a dialogue box

	}

}
