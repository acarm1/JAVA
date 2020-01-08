package DAY36_JavaReview;

public class ConstructorCalls2 {

	/*
	 
	 6. Constructor cannot call itself.
	 7.	Constructor cannot contain itself
	 
	 
	 Next week topics: instance methods, instance variables, class variables
	 
	 
	 */
	
	public ConstructorCalls2() {
		/// this(); will give compile error. You cannot call constructor itself
		
	//	this(true); // constructor cannot contain itself. we already call itself in the stated constructor.
		
		System.out.println("default");
		
	}
	
	public ConstructorCalls2(boolean a) {
	
		/// 	this(true); cannot call itself
		 
		this();
		
	// 	this(false); compile error
		
		System.out.println("boolean");
		
		
		}
	
	public ConstructorCalls2(String name) {
		
	//	this("Hello"); compile error.
		
		this('a'); // boolean default char
		 
	///	ConstructorCalls2(); you cant call constructors like methods.
		
		System.out.println("String");
		
		
	}
	
	public ConstructorCalls2(char ch) {
		
	//	this("Mansur"); // compile error. it cannot contain itself as being called by the string one.
		
	}
	
	
	public static void main(String[] args) {
		
		ConstructorCalls2 obj = new ConstructorCalls2(true);
		ConstructorCalls2 obj2 = new ConstructorCalls2("SA KARDESSHSHS");
	}
	
	
	
}
