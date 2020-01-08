package Day54_Polymorphisim;

class Animal{
	
	public void Talk() {
		
		System.out.println("Animal is talking");
	}
	
	
}

class Tiger extends Animal {
	
	public void Hunt() {
		
		System.out.println("Tiger is hunting");
		
	}
	
	public void Talk() {
		System.out.println("Tiger is talking ===> Roar");
	}
	
	
}

class Octopus extends Animal{
	
	public void Swim() {
		System.out.println("Octopus is swimming");
	}
	
	
	public void Talk() {
		
		System.out.println("Octopus is talking ===> gologolo");
	}
	
}

public class Zoo {

	public static void main(String[] args) {
		
		Tiger tiger1 = new Tiger();
		
		Tiger[] Tigers = {tiger1,new Tiger() };
		
		Octopus octopus1= new Octopus();
		Octopus[] octopus = {octopus1,new Octopus()};
		
		Animal 	  animal1 		= new Tiger();
//reference type  reference name   object
		animal1.Talk();
		Animal animal2= new Octopus();
		
	//	animal2.Swim(); // animal class(reference type) doesnt have swim method.
		
		animal2.Talk();
	}
	
	
}
