package Day54_Polymorphisim;


abstract class AbstractClass {
	

	public static void ByLinkText() {
		
		System.out.println("Link Text Super");
		
	}
	
	public void get() {
		System.out.println("Chrome");
	}
	
}






public class Test extends AbstractClass {

	
	public void get() {
		System.out.println("FireFox");
	}
	
	
	public static void ByLinkText(int a) {
		
		System.out.println("Link Text sub");
		
	}
	
	
//	public statuc void Test() { }
	
	public static void main(String[] args) {
		
		
	 	
		
		
		
//	AbstractClass obj = new AbstractClass();
		
	
//	AbstractClass obj= new AbstractClass();
		// we cant create object from abstract class
	
	
	AbstractClass obj2 = new Test(); 
	//reference type
	
	obj2.ByLinkText();
		/// method not overridden method, reference method will print
	obj2.get();
	
	Test obj3 = new Test();
	obj3.ByLinkText(10);
	
	
	}
	
	
}
