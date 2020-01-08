package Day30_WrapperClass_ArrayList;

public class WarmUp {

	/*
	 * 
	 * 1. Write a return method that accepts a String and removes 
	 * duplicate values from the String,
	 * 
	 * Ex: RemoveDuplicate("aaabbbccc") ==> "abc"
	 * 
	 * 
	 * 2. write a return method that accepts String and returns unique values 
	 * from the String
	 * 
	 * Ex: 
	 * 		Unique ("AABBCDEEE") ==> "CD"
	 * 
	 *
	 */
	
	public static void main(String[] args) {
		
		String str = RevDup("aaBBBCCCDDDD");
		System.out.println(str);
	}
	
	
	///task01
	public static String RevDup( String str ) {
								/// "aabbc" ==>"abc"
		
	String result = ""; /// to store non duplicate values
	
	for (int i=0; i<str.length();i++) {
		
		if( ! result.contains(str.substring(i, i+1))) {
			
			result+=str.substring(i,i+1);
			
		}
	
	}

		
	return result;
		
	}
	
	//task02
	
	public static String UniqueValue(String str) {
									//"AABBCDEEE" ==> "CD"
		
		String result=""; /// to store unique values
		
		
		for (int i)
		
		
		
		
		
		
		
		return result;
		
		
		
		
	}
	
	
}
