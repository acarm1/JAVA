package Day32_JavaReview;

public class WrapperClassReview {
	
/*
 
 primitives						Wrapper Classes: java.lang
 
 byte							Byte
 short	Auto Boxing				Short
 int	     =====>					Integer
 long							Long
 float				unboxing		Float
 double				<=====		Double
 boolean							Boolean
 char							Character
 
		1. default values:
 	 primitives: byte,short,int,long ===> 0
 				 float,doble ==> 0
 				 boolean ==> false
 				 char==> space
 				 
 	 All wrapper class: null
 			
 		2. wrapper class only accepts it's own primitive values
 
 		3. wrapper class has method, primitives don't
 
 		4. wrapper class takes object, primitives takes values
 
 
methods: Max_values,MIN_values, parse metohds, valueof methods
			max_values: returns the maximum value of the data-type
			min_value: return the minimum value of the data type
			parse methods: Converts String to primitives
			valueOf methods: converts string to wrapper class
 
 
 
 */
	public static void main(String[] args) {
		
		int a= 10;
		Integer b=10;
		byte c=20;
	////	Integer b2=c; /// Integer only accepts int primitive values
		
		long L = b; // Integer is within the range of long.
		
		
		///Auto boxing example
		
		boolean result = 9 > 0+1;
		
		Boolean result2 = result; /// auto boxing
		
		boolean result3 = result2;// un-boxing
		
		Boolean result4= result2; //none
		
		boolean result5= result3;
		
		/*
		 
		 methods:
		 
		 	max_value
		 	min_value
		 	parse methods
		 	valueof methods
		 
		 */
		
		
		
		
		int max= Integer.MAX_VALUE;
	//// 	int max2 = Double.MIN_VALUE; //// int is not equals to double
		System.out.println(max);
		
		
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Byte.MAX_VALUE); ///127
		
		
		int min = Byte.MIN_VALUE; /// -128
		int min2 = Integer.MIN_VALUE;
		
		System.out.println(min);
		System.out.println(min2);
		
		
		
		///parse methods: returns primitives, ignores the case sensitivity.
		
		short s1 = Short.parseShort("1234");
		
		System.out.println(s1+1);
		
		double d1= Double.parseDouble("78.5") ; //none
		
		Double d2= Double.parseDouble("78.5"); ///auto-boxing
		
		
				boolean r1= Boolean.parseBoolean("true"); /// none
				System.out.println(r1);
		
		//ValueOf methods: returns wrapper class,
			Integer num= Integer.valueOf("123"); //none
			System.out.println(num);
			
			int num2 = Integer.valueOf("123"); /// unboxing
		
			byte num3 = Byte.valueOf("12");
			
				boolean R1= Boolean.valueOf("true");
				System.out.println(R1);
				
				
	
	}
	
	
	

}
