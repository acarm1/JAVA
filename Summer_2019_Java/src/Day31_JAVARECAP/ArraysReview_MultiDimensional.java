package Day31_JAVARECAP;

import java.util.Arrays;

public class ArraysReview_MultiDimensional {
	
	/*
	 
	 n dimensional array: contains (n-1) dimensional arrays.
	 
	*/
	
	public static void main(String[] args) {
		
		int [] arr1D = {1,2,3};
		
		
		//index             0 1 2     0 1 2
		int [][] arr2D = { {1,2,3} , {4,5,6}  };
		//index              0          1
		
		
		
		System.out.println(arr2D.length); // will print 2
		/// [index num of 1D arrays] [index num of each values]
		
		/// print 2:
		
		System.out.println(arr2D[0][1]);/// will print 2 because we selected 0 which first [] and then selected the index of the number
		
		/// print {4,4,6}:
		
		System.out.println(Arrays.toString(arr2D[1])); /// because we selected the entire second column
		
		
		/// print the whole array
		
		System.out.println(Arrays.toString(arr2D));/// we cant use arrays to string method on 2 dimensional arrays. It will print hashcodes
		
		System.out.println(Arrays.deepToString(arr2D)); /// we will use deepToString method to convert to String.
		
		/////
		
		char [] ch = {'a','b','c','d','e'};
		
		for (char each : ch) {
			
			if(each=='c') {
				continue;
			}
			
			
			System.out.print(each+" ");
			
		}
		
		System.out.println(); /// To start from the new line
		
		
		
	String [][] names = {  {"Erhan", "Holy", "Denis","John","Tarzan"},  {"Muhtar","Mike","Ariya","Dilyar","Nadira"} };
	///								0								1
	
		for (String[] each1d : names) {
			
		///	System.out.println(Arrays.toString( each1d ));
		
		for (String eachValue : each1d) {
			
			
			/// If we dont want to print Holy stament
			if(eachValue.equals("Holy") ||eachValue.equals("Tarzan")) {
				continue;
			}
			
			
			System.out.println(eachValue);
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
