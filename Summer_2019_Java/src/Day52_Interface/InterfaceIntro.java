package Day52_Interface;
/*

Two ways to achieve abstractions:

			1. Abstract class
			2.Interface


why do we need interface?
what we can have in interface?
what we cannot have in interface?

Interface :  it's blueprint(template) of class, but it's not a class

	public interface name {
	
	}

we can store abstract methods, and let classes implement abstract methods.

implements keyword: we use implements keyword to implement abstract methods to the class.

why do we need interface?
		A class can implement multiple interfaces
		A class can extend one class only
		
What we can have in Interface?
		methods: Abstract method, static methods , default method
		
		variables: public static final ===> automatically
					variables are public,static and final by default
		
What we cannot have?
	constructor
	Instance Method
	instance variable
	instance block  {}
	static block


*/
public interface InterfaceIntro {

	/*
	{
		
	}				We can t have both instance block and static block
	
	static {}      
	
	*/
	
	//public InterfaceIntro() { }  /// We cannot have constructor
	
	//public void methodB() { } // We cant have instance method
	
	public default void methodC() {}
	
	public static void mm() {} // We can have static method
	
	public abstract void methodA ();
	
	int a=100; // public static final
	
	public static final int b  =200;
	
	public static void main(String[] args) {
		InterfaceIntro.mm();
		System.out.println(a);// variables are static by default
		
	//	a=200; // variables are final by default
		
	}
	

}

interface Data{
	
}

class Test implements InterfaceIntro, Data {
//		sybtype			supertype, 	supertype
	@Override
	
	public void methodA() {
		
		
	}
	
}
