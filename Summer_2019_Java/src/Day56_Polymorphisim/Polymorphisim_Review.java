package Day56_Polymorphisim;

class A {
	
	protected void methodA() {
		System.out.println("method A from A class");
	}
	
	public static void methodC() {
		
		System.out.println("Method C from A class");
		
	}
	
	
}

class B extends A{
	
	public void methodB() {
		
		System.out.println("method B");

			
		}
	
	public void methodA(){

		System.out.println("Method A from B Class");
	}
	
	public static void methodC() {
	
		System.out.println("Method C from B class");
		
	}
	
}






public class Polymorphisim_Review {
	
	public static void main(String[] args) {
		
		A obj = new A();
		
		A obj2= new B();
			obj2.methodA();
			
	//	B obj3 = new A();
	// only parent can be the reference type
			
	//	C obj4 = new C(); obstract class cant concrete
	
		C obj5 = new D();   //sub class must be non abstract
		
		E obj6 = new D();
		
	//	D obj7 = new E(); we cant create object from the interface
		
		A obj11 = new B();
		obj11.methodA();  // from overriden method
		
		
		
		obj11.methodC(); 
		
	// if the method is not being overriden, then the reference type -
			// - method will be executed.
		
	}
}

abstract class C {
	

}

 class D extends C implements E {
	
}


interface E{
	
}

abstract class F implements E{
	
}
