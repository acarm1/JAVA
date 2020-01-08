package Day39_JavaReview;

/*
  JAVA Review
  
  1. instance variables
  2.instance methods
  3.this keywords ( this. vs this() )
  4. Decimal formatter class
============================================
 /// Warmup: 
 
 Create a custom class for CellPhones
 
 instance variable : brand,Screensize,color,price
 
 
 instance methods: calls,message,takePhoto
 
===================================================================  
  
 instance variable: created outside the methods, within the class.(object)
 					
 					its also called fields.
 					
 instance methods:  methods that doesnt have static specifier. 
 					You must have return type. (object)
 
 local variable: created within the methods. not visible to outside methods.
 					can only be used within the method
 
 this. : used for calling instance variables, we use when local and instance
 variables have the same names.
 
 */

public class CellPhone {
	
	
	///instance variables:
	
	String brand;
	double price;
	String color;
	double screensize;
	String model;
	
	public CellPhone() { /// setup default values for attributes of the class
		
		brand = "iPhone";
		model = "10";
		screensize = 5.8;
		color = "White";
		price= 700;	
	}
	
	public CellPhone(String brand, double price, String color, double screensize, String model) {
		
		this.brand=brand;
		this.price=price;
		this.color= color;
		this.screensize=screensize;
		this.model=model;
	}
	
	
	
	
	public void call(long PhoneNumber) {
		
		System.out.println(brand +" "+model+ " is calling "+PhoneNumber);
		
	}
	
	public void SendMessage(long PhoneNumber) {
		
		System.out.println("Sending messages to "+PhoneNumber);
	}
	
	public void getInfo() {
		
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
	}
	
	
	
	
	

}
