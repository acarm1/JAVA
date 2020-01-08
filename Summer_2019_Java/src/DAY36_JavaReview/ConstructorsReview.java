package DAY36_JavaReview;

public class ConstructorsReview {

	/*
	 
	 Constructors: special method, used when we create an object of a class.
	 			Every class MUST have constructor.
	 			If we dont create any constructor, then compiler will give default (no-arg) constructor.
	 			
	 creating object: 
	 		ClassName obj = new ExistingConstructor;
	 		
	 
	 declaration of constructor : 
	 			
	 			default constructor:
	 				access-modifier className(){
	 				}
	
	
	constructor with arg:
	
		access-modifier className(parameter){
		
		}
		
		
	
	constructors name MUST be same with class name
	in constructors method singature, there is no return type and specifier
	
	We can create multiple constructors by overloading the constructor
	
	We can give mulitple paramaters in the constructor.
	
	constructor calls: 
	 
	 */
	
	
	
	/// it must match with the class name
	public ConstructorsReview() {
		
		System.out.println("default constructor");
		
	}
	
	public ConstructorsReview(int a) {
		
		System.out.println("Constructor with argument int : " + a ) ;
		
	}
	
	
	public static void main(String[] args) {
		
		
		ConstructorsReview obj = new ConstructorsReview();
		// ChromeDriver driver = new ChromeDriver()
		
	//// 	ConstructorsReview obj = new ConstructorsReview("Batch12"); /// compile error
		
									/// the constructor with arg of String is not exist
		
		ConstructorsReview obj2 = new ConstructorsReview(10);
		

		
		
		
	}
	
	
	
}
