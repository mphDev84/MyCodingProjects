import java.util.Scanner;
public class DisplayEvenElements {

	public static void main(String[] args) {
		//this program uses an 'if' loop nested within a 'for' loop to display the elements located
		//at even-numbered indices within an array.  
		
		
		int nums [] = {19,21,16,14,99,86,31,19,0,101};
		
		for (int x = 0; x<nums.length; x++) {

		
		if (x%2==0) { // here we use the '%' operator to determine whether the value is even or odd
			System.out.println("At index "+ (x) + " Found a "+ nums[x]);
		}	
	}
	}
	}



