package Day32_JavaReview;

public class CustomMethodsReview {

	/*
	 declaration of mehods:
	 	
	 		
	 		Access-modifiers		specifier	return-type	methodName(parameter) {
	 		
	 		method body
	 		
	 		}
	 	
	 	Access modifier: public
	 	specifier: static
	 	return-type: void, all primitives and non primitives
	 	methodName: anyName
	 	parameter: all data type
	
	
	if the return type of the method is void: method doesn't return any value.
	
	if the return type of the method is NOT void: the method MUST return a value.
	
	 methods that passes parameters (with argument) : mehod requires extra informations to perform its task.
	 
	 
	 */
	
	public static void main(String[] args) {
		
		
		method1();
	//	method1();
		
		oneTo100Even();
		
		ReverseStr("Ayhan");
		
		print("Hello");
		
		//you can either assign to a value or print directly
		
		byte num = (byte)largestNumber(12,13); //13   /// converted to byte
	
		System.out.println(num);
		
		
		
		System.out.println(largestNumber(13,20));
		
		System.out.println(Reverse("mansur"));
	}
	
	
	
	public static void method1() {
		
		System.out.println("Hello World");
		
		System.out.println("Hello Cybertek");
		
		System.out.println("Hello Batch12");
		
		
	}
	
	public static void oneTo100Even () {
		for (int i=1; i<=100; i++) {
			
			if (i%2==1) {
				continue;
			}
		System.out.print(i+" ");
		}
		System.out.println();
			}
	
	public static void ReverseStr (String str) {
	
	for (int i= str.length()-1; i>=0; i--) {
		
		System.out.print(str.charAt(i));
		
		
	}
		
	System.out.println();
	}
	
	public static void print(String str) {
		System.out.println(str);
	}	
	
	public static int largestNumber (int a , int b) {
		
		int max=0;
		
		if (a>b)
			max=a;
		else
			max=b;
			
		//System.out.println(max);
	
		return max;

		
	}
	
	
	public static String Reverse(String str) {
		
		String result="";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			result+=str.substring(i,i+1); /// we can also use charAt method
										/// result+=str.charAt(i);
			
		}
		
		
		
		return result;
		
	}

	
	
	
}
