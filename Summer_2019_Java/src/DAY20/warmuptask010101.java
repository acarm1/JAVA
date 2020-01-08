package DAY20;

public class warmuptask010101 {
	
	
	public static void main(String[] args) {
		

	////SUM OF ALL EVEN NUMBERS
	
	
	int sum2=0;
		
	for (int i=0; i<=1000; i+=2) {
	
		sum2+=i;
		
	}	
		
	System.out.println("sum of all even numbers "+sum2);
	
	
	//// SUM OF ALL ODD NUMBERS
	int sum3 =0;
	
	for (int i =1; i<=1000; i+=2) {
		
		sum3+=i;
	}
	System.out.println("sum of all odd numbers"+sum3);
	
	
	
	/// SUM OF ALL ODD NUMBERS 2ND VERSION
	
	int summ3=0;
	
	for (int i=0;  i<=1000; i++) {
		
		if (i%2==1) {
			summ3+=i;
		}
		
		System.out.println("sum off all odd numbers "+summ3);
	}
	
	
	
}
	
}
 