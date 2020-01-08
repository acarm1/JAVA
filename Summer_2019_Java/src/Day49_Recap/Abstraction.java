package Day49_Recap;

/*
 
 Abstraction: concentrating on essentials/important things, not worrying about
 the details/implementation.
 
 				hiding the implementation details
 
 
 car:
 	
 	start(){
 			// it doesnt care about the details
 			 // cares about the start
 			put the key
 			turn the engine on
 			start driving
 	
 			}
 	
 abstract method : a method wihout body/implementation
 
 	public abstract start(); == > generic
 	
 	it's a method that's meant to be override ( cannot be final,private), in
 	the regular sub class.
 	
 	Only the instance methods can be override and can be abstract 
 	
 	abstract method can only be declared in abstract class and interface
 	
 	
 		
 		ex:
 		Pontanic car: 
 				
 				start(){
 				call the mechanic
 				put the key in 
 				start the engine
 				jump start
 				drive
 				}
 				
 		Tesla car:
 		
 			start(){
 			say "start"
 			driver
 			}
 			
 	abstract class: abstract is something not concrete.
 					we cannot create object from.
 					
 					a class meant to be extended
 	
 					abstract class cannot be final
 					
 					if the subclass is regular class , the sub class MUST override
 					the abstract methods
 					
 					if the sub class is abstract, no need to override
 				
 			why we cannot create object from abstract class?
 					abstraction is something not concrete, object is conctrete
 					
 			
 
 */
public abstract class Abstraction {

	public  abstract void startTheCar();
	
	
	
}

class A extends Abstraction{
	
//	public abstract void startTheCar();
	
	
	@Override
	public void startTheCar() {
		
		System.out.println("Brake");
		System.out.println("Push the start button");
		System.out.println("Release the brake");
	}
	
	public static void main(String[] args) {
		
	//	Abstraction obj = new Abstraction();
		
		
	}
	
class Tesla extends Abstraction {
				// regular class MUST implement the abstract 
				//		methods from the abstration
	
	public void startTheCar() {
		
		System.out.println("voice control");
		System.out.println("driver");
	}
	
	
}
	
}

