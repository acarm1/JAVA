package DAY36_JavaReview;

public class ConstructorCalls {
	
	/*
	 constructor calls:
	 
	 1. only a constructor can call another constructor.
	 
	 2. constructor cannot called by constructor name
	 
	 3. we use "this()" keyword to call the constructor.
	 
	 4. Constuctor call MUST be the first step in a constructor.
	 
	 5. One constructor cam only call one constructor. ( cannot call more than one)
	 
	 
	 this keyword: used for calling object instances ( anything that belongs the object)
	 
	 
	 */
	
	
	
	public ConstructorCalls() {
		System.out.println("A");
		
	}
	
	public ConstructorCalls(int a ) {
		
	// ConstructorCalls(); we cant call by its name we have to use  " this() "  
		
		
	///	System.out.println("B"); ///   it gives compile error because constructor call has to be he first step in the constructor
		
		this(); /// A    .  if there is an argument in the default constructor we have put () inside it
		
		System.out.println("B");
		
		
	}
	
	public ConstructorCalls(double a) {
		
	///	this();  // it will call the default constructor. and  we can only one constructor.
		
		this(10);// will call th esecond one
		
		System.out.println("C");
		
	}
	
	
	public static void main(String[] args) {
		
		method1();
		//ConstructorCalls();
		
		ConstructorCalls obj = new ConstructorCalls(10);  // it will execute second one 
		
		ConstructorCalls obj2 = new ConstructorCalls(10.5);  // it will execute second one 

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void method1() {
		
	}

public static void method2() {
		
	method1();
	
	}
	
}
