package Day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		int [] number = {100,200,300};
		
		try {
			System.out.println(number[5]);
			System.out.println("Trye block, Checked exception");

		} catch (ArrayIndexOutOfBoundsException e) { 
			
			System.out.println("catch block , Unchecked Exception");
			
		}

		System.out.println("=========================");
		
		
		try { /// try will compile if it is checked exception
			Thread.sleep(2000);
			
			System.out.println("Trye block, checked exception");
			
		} catch (InterruptedException e) { /// catch will compile if it is unchecked exception
			
			System.out.println("catch block, unchecked exception");
			
		}
		
		System.out.println("Work Done");
		
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.addAll(Arrays.asList(1,2,3));
		
		try {
			System.out.println(list.get(10));
			
			System.out.println("Checked Exception occured in arraylist");
			
		} catch(IndexOutOfBoundsException e) {
			
			System.out.println("Unchecked Exception occured in arraylist");
			
		}
		
		
	}
	
	
	public void method (String kfc) {
		
		
		
		
	}
	
	
	
	
	
}
