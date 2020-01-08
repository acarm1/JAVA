package Day47_JavaRecap;

/*
 JAVA REVIEW
 
 1. Inheritance
 2.	this & super keywords
 3.	Constructor
 
 
 Inheritance: super and sub classes
 		
 		class Sait extends khurshed
 		//	  sub		   super
 		 
 		class Oleaxender extends khurshed
 		//	  sub		   super
 		
 		
 		class Ibrohim extends Olexander
 		///	  sub	          super
 		
 		
 		sub class: gets more richer, inherits all visible and protected
 		features from the super class.
 		
 				private access modifier is not inheritable
 				
 				default access modifier is only inheritable to the
 				classes that are in the same package
 		
 		
 		super class: super class can't inherit any feature from the sub class.
 		
 		a class can be extended by multiple ( can have multiple sub classes)
 		
 		super : refers to the object instance
 			
 			super. : used for calling instance variables and instance methods
 					MUST be used in the sub class
 					
 				Cannot be used in static methods or static block
 				
 			super() : used for calling constructors from the super class
 				 	MUST be used in the sub class

 				
 				
 			
 			
 		this: refers to the object instances
 		
 		this. : used for calling instance variables for the class itself
 		
 		this() : calling the constructor
 		
 		SUPER AND THIS SHOULD ONLY BE USED TO CALL OBJECT INSTANCES, NOT THE STATICS
 		
 		constructor : parent class constructor MUST be called in the sub class
 					at least one of them
 					
 					
 					super class default constructor is called in the sub class
 					by default
 	
 		
 		
 		
 		
 
 
 */





class A{
	
	public String name1= "Ayaz";
	
	public void mmm() {
		/// super.name1= "Hakan"; /// super keyword in sub class
	}
	
	public static void N () {
		
	}
	
	
}

class B extends A{
 // public String name1= "Ayaz";
	public String name2= "Sukran";
	public String name3= "Erhan";
	
	public static void J() {
		
	}
	
	
	
	public void method1() {
		super.name1= "Feride"; /// it wall call from Class A. 
		super.mmm();
		super.N();
		this.J();
		
		
	}
	
	
}



public class A_Inheritance extends B {

	
	
// public String name1= "Ayaz";
//	public String name2= "Sukran";
//	public String name3= "Erhan";
	
	public String name4= "Mehmet";
	public String name5= "Mahribana";
	
	

	
	public static void main(String[] args) {
		
		A_Inheritance obj = new A_Inheritance();
		
		System.out.println(obj.name1);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		B obj2 = new B();
		
		System.out.println(obj2.name1);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
	//	System.out.println(obj2.name4); // super class cannot inherit anything
	//	System.out.println(obj2.name5); // super class cannot inherit anything
		
		System.out.println("===============================================");
		
		A obj3 = new A();
		
		System.out.println(obj3.name1);
	//	System.out.println(obj3.name2); // super class cannot inherit anything
	//	System.out.println(obj3.name3); // super class cannot inherit anything
	//	System.out.println(obj3.name4); // super class cannot inherit anything
	//	System.out.println(obj3.name5);  // super class cannot inherit anything


		
		
		
	}
	
	
}


