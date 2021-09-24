import java.util.Scanner;
public class ParallelArrays {

	public static void main(String[] args) {
		/* This program uses 2 arrays to create a simple cipher/code system - the user inputs a letter 
		 * from the 'cipher' array. This letter is checked against the 'cipher' array index; the index at 
		 * which the letter (or 'element') is found is compared with the corresponding index in array
		 *  'plain'. The corresponding letter in 'plain' is printed to the console.   */ 
		
		Scanner key = new Scanner(System.in);
		
		char [] cipher = {'s','f','k','l','d','o','h','z','m','b','t','a','n','g',
						  'u','v','i','q','x','w','y','c','j','r','p','e'};
		
		char [] plain = {'e','q','s','f','i','n','h','u','r','k','g','z','c','y','x','l',
						 'm','d','w','a','b','t','p','j','v','o'};
		
		
		char a;
		
		System.out.println("Enter a letter from the cipher: ");
		a = key.findWithinHorizon(".",0).charAt(0);
		
		for (int x = 0; x < cipher.length ; x+=1) { //stuff inside the brackets is the condition of the 'for' loop
			if (a ==cipher[x]) {
			System.out.print("The new letter is: ");	
			System.out.print(plain[x]); 
			
		}
		}
		//the above 'for' loop utilizes an 'if' loop within it to compare input data with the 2 arrays
		key.close();
		}
	}


