package Day43_JavaRecap;

public class ATest {

	/*
	 
	 Java Review ;
	 
	 1. static keyword
	 2. initializer blocks ( static vs ins vs cons)
	 3. Encapsulation
	 
	 //// NEXT WEEK ;
	  
	 4. static import
	 5. Multi-class
	 6. Access modifiers: public, private, default
	 
	 
	 local variable : variables that are declared within the method or block.
	 				only accessible within the method or block.
	 
	 instance variable = belong to the object . each object has its own copy
	 					of instance.
	 
	 static variable =  variable thats shared by class and objects, there is only one copy
	 					belongs to the class.
	
	
	static keyword: any feature that has static keyword belongs to the class, also can be called
					through the class. ( class members).
	
	 					
	static members:
	
	 		1.static variables
	 		2.static methods
	 		3.static initializer block
	 		4.static inner class	 (nested class)
	 
	 
	 static variable : variable that shared by class and objects, there is only one copy.
	 
	 static methods : methods that we can call it through the class name. ( belong to class)
	 			Ex: Webdriver driver= WebDriverFactory.getDriver();
	 			
			static methods only accepts class members (static)
			
			none statics can ONLY be called through the object
	 
	 static initializer block: used for initializing static variable
	 				declared in the class outside the method. WITH STATIC KEYWORD
	 				
	 				static{
	 					statements;
	 				}
	 		
	 		it's executed as soon as the class is loaded, ONLY 1 time
	 		
	 instance initializer block: used for initializing the instance variables
	 				
	 				declared in the class outside method
	 				
	 				{
	 				statements;
	 				}
	 				
	 				it's execution depends on the creation of the object.
	 			
	 				instance block runs before the constructor
	 					
	 
	 this() : Calling the constructors
	 		`We can only use in the constructor
	 		
	  
	 this. : used for calling the instance variables this.
	 		We can used in any object instances
	 		
	 		
	 Encapsulation: hiding the instance variable.
	 		1. hide the data by giving private access modifier
	 		2. grants other classes get access to the private instance variable through
	 		public getter/setters
	 		
	 		
	 	private : only visible ( accessible) within the class.
	 	
	 	getter (Read) : instance method, returns the private instance variable
	 		
	 		return-type of the getter MUST watch with the data-type of the instance
	 		variable.
	 		
	 		access modifier needs to be public, because we want to call the method
	 		outside the classes.
	 		
	 	setter(modify) : instance method, return-type is void, passes a parameter
	 				the paramater's data-type must match with instance variable
	 				
	 			
	 		
	 
	 
	 */
	
	
	
	static int a; /* it is shared by objects */  int b; /// it belongs to object
	
	long total =100;  // instance variable ( global)
	
	public ATest() {
		total-=50;
	}
	
	public ATest(int total) {
		this();
		this.total +=total;
		
		///this.b= 50000; 
	}
	
	public static void main(String[] args) {
		
		
	
		
		
		
		
		
		
		ATest obj1 = new ATest();
		obj1.b=10;
		
		obj1.a=20;
		
		
		ATest obj2 = new ATest();
		obj2.b=30;
		obj2.a= 40; /// will make every 'a' 40 because its static.
		
		
		System.out.println(obj1.b); /// 10
		System.out.println(obj2.b); /// 30
		
		System.out.println(obj1.a); //20
		System.out.println(a); //20
		System.out.println(obj2.a); //20
		
		
		
		
		
		
		
	}
	
	
	
	
}
