package Day31_JAVARECAP;

import java.util.Arrays;
import java.util.Scanner;

public class warmUp {

	/*
	 
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		// ask user to enter 3 numbers and find the maximum and the minimum numbers
		
		
		
		/// Ask user to enter how many number to add and find the min and the max after number inputs
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers would you like to add");
		
		int number = scan.nextInt();
		
		
		int [] arr= new int [number];
		
	for (int i=0; i<arr.length; i++) {
		
		System.out.println("Enter a number");

		arr[i]= scan.nextInt();
		
		
	}
		
		
		/*
		
		System.out.println("Enter a number");
		arr[0]= scan.nextInt(); // user input
		
		System.out.println("Enter a number");
		arr[1]= scan.nextInt(); // user input
		
		System.out.println("Enter a number");
		arr[2]= scan.nextInt(); // user input
		
		
		System.out.println(Arrays.toString(arr));
		
		*/
		
		
		// Get Minimum and Maximum Value
		
		Arrays.sort(arr);
		
		
		System.out.println("Minimum Value: "+arr[0]);
		System.out.println("Maximum Value: "+ arr[arr.length-1]);
		
		
		
		
	}
	
	
}
