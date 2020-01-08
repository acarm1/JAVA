package Day39_JavaReview;

import java.text.DecimalFormat;

public class FormattingDecimals {

	
/*
 
 DecimalFormatter class: presented in "java.text"
 

 
 */

	public static void main(String[] args) {
		
		DecimalFormat format= new DecimalFormat("0.000");
		
			
		double b = 23.12345233231213;
		
		//format( double):  formats the decimals and returns string value
		
		String num1 = format.format(b);
			
			System.out.println(num1);
			
			double c = 45.5689;  // 45.57
			
			System.out.println(  format.format(c) + 1 );  // converts to string in order to print like 0.00
												//// +1 will concate because it is in string format
			
			c = Double.parseDouble( format.format(c) );  /// to convert again to double
			
			System.out.println(c+1);
		
		
		
		
	}
	
	
	
	
}
