package Day43_JavaRecap;

/*
 
 import: 
 		import PackageName.className; ===> to import single class

 
 */

public class Practice {

	public static void main(String[] args) {
		
		staticKeyword.printName();  //Nurzat
		
		// static methods can be called through class name
		
		
	//	staticKeyword.printName2();  
				//		instance method cannot called through class name	
		
		
		Practice.printName();  /// semra
		
		printName();   /// semra
		
		
		staticKeyword obj = new staticKeyword();
			obj.printName2(); /// in order to call none static we must create object
		
		System.out.println(staticKeyword.StaName);// static features can be called
												// from the class name
		
///		System.out.println(staticKeyword.Insname);
			/// instance variables belong to the object, can't called thorough class name
		
		
		
		
		
		
	}
	
	
	public static void printName() {
		
		System.out.println("Semra");
		
	}
	
	
	
	
}
