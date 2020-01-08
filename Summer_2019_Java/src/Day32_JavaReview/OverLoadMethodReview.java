package Day32_JavaReview;

public class OverLoadMethodReview {

	/*
	 overload methods : improves the reusability
	 					improves readability
	 					flexible during runtime
	 		
	 		same method names, different parameters
			
			return type of the overload doesnt matter
	 
	 */
	public static void main(String[] args) {
		
		sum(10.5,20.7);  // it will execute double when you pass double.
						// it will execute integer when you pass int number.
		
		sum(30,40,50);
		
		sum(0.5, 10L, false);
		
		int total = sum (10,10.5,10);
		System.out.println(total);
		
		
	}
	
	public static void sum(int a, int b) {
		System.out.println("int sum is: " + (a+b));
	}
	
	public static void sum (double a, double b ) {
		
		System.out.println("doble sum is: " + (a+b));
		
	}
	
	public static void sum (int a , int b, int c) {
		
		System.out.println("int sum is: " + (a+b+c));

	}
	
	public static void sum (double a, long b, boolean c) {
		
		System.out.println("You have entered "+a+" "+b+" "+c);
		
	}
	
	//// using return type method
	
	public static int sum (int a, double b, int c) {
		
		
		int sum= a+ (int)b+c; /// we can use double value as an int by casting method
		
		
		return sum;
	}
	
	
}
