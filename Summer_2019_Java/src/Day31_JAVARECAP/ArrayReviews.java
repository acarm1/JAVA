package Day31_JAVARECAP;

import java.util.Arrays;

public class ArrayReviews {
	
	/*
	  
	  Array: Store multiple data to a variable
	  			
	  		====	Array's size is fixed====
	  
	 */
	
	
	public static void main(String[] args) {
		
		
		/////THERE ARE TWO METHODS OF INITIALIZING THE SIZE
		
		
		int num=10;
		
		////Declaration of Array:
		
		int [] arr = {10}; // array has size of 1:  and includes [10].
		
	//// 	arr[1]= 20; /// [10,20] arrays size is fixrd so it wont work
		////System.out.println(arr[1]);
		
		
		/// initializing the arrays size:
		
		int [] arr2 = new int[2];  /// [0,0] so the size is 2 as initialized., maximum capacity of arry is 2
		
		System.out.println(arr2[1]); // 0, default value of int is fixed.
		
		//System.out.println(arr2[2]);  /// 0
		
		String [] cars = new String[5]; /// this array can contain 5 string values
		
		//// { Tesla, Audi , Toyota, Jeep, Subaru}
		
		
		cars [4] = "Subaru";
		cars [2] = "Toyota";
		cars [1] = "Audi";
		cars [3] = "Jeep";
		cars [0]= "Tesla"; 
		
		for (int i=0; i<=cars.length-1 ; i++) {
			
			System.out.print(cars[i]+" ");
		}
		
		
		/// Another Method
		
		cars=  new String [10]; /// reinitialize the size to 10 .-- ALL VALUES WILL BE GONE WHEN RESIZE THE ARRAY----
		
		//{  Tesla, Audi , Toyota, Jeep, Subaru ,"Ford" , "Honda", "BMW", "Volvo", "Volkswagen"} 
		
		cars[5]= "Ford";
		
		System.out.println();
		//// new array
		
		
		boolean[] bool = { true,false, 10==10};
		
		boolean b1 = bool[2];
		
		System.out.println(b1);
		
		// print the entire array 
		/// We will use Arrays.toString --- // converts 1d array to string and returns string
		
		System.out.println(bool); // will print hascode
		
		String str = Arrays.toString (bool);
		
		System.out.println(str); /// [true,false,true]
		
		
		///Arrays.sort(VariableName): sorts array in ascending order
		
		double [] dArray = { 1000,900,800,700,600 } ; 
		
		System.out.println(Arrays.toString(dArray));
		
		/// expected : {600, 700, 800 , 900, 1000 }
		
		Arrays.sort(dArray); /// {600, 700, 800 , 900, 1000 }
	
		System.out.println(Arrays.toString(dArray));
		
		// one moreee array
		
		///print giving array in descending order
		int [] numbers = {200,300,20,7890, 40 , -9, -100};
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		String result= "";
		
		for (int i= numbers.length-1; i>=0; i--) {
			
			Arrays.toString(numbers);
			
			result += numbers[i]+", ";
			
			//result = result.trim();
			
			///result = result.substring(0,result.lastIndexOf(", "));
			
			result = result.replace("-100," , "-100");
			
			System.out.println(result);
			
			///System.out.print(numbers[i]+ ", ");
			
		}
		
		
		
		
		
		
		
		
	}

}
