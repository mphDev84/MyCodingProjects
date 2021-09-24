
public class DisplayAllArrayElements {

	public static void main(String[] args) {
		//Simple program that initializes an array, then using a 'for' loop, prints each element found at
		//each index of the array to console

		int arr [] = {19,21,16,14,99,86,31,19,0,101};
		
		for (int x = 0; x < arr.length ; x+=1) {
			
			System.out.println("At index "+ (x) + " Found element "+ arr[x]);
			 
			
			
		}
	}

}
