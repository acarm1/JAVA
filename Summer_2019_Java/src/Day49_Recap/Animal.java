package Day49_Recap;

public abstract class Animal {

	
	public abstract void eat();
	
	public abstract void sleep();
	
	public static void main(String[] args) {

		
	}
	
	
	
	
}

//concrete

class Cat extends Animal {
	
	
	@Override
	public void eat() {
		
		System.out.println("cat eats fish");
		
	}
	
	@Override
	public void sleep() {
		
		System.out.println("cat sleeps 14 hours");
		
	}
	
	class KingKong extends Animal{
		
		@Override
		public void eat() {
			
			System.out.println("Humans");
			
		}
		@Override
		public void sleep() {
			
			System.out.println("King kong sleeps 5 hours");
			
		}
		
			
		}
	
	

	}
	
	
		
		
	
	
	
	
	
	 
