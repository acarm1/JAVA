package Day47_JavaRecap;


class Cinthya{
	
	public Cinthya (int a) {
		
		this(5.5);

		System.out.println("A");
	}
	
	public Cinthya(double b) {
		
	}
	
	public Cinthya (String str) {
		System.out.println("C");
	}
	
}



public class Constructors2 extends Cinthya {

	public Constructors2() {
		
		super("A"); //C
		
	}
	
	public static void main(String[] args) {
		
		Constructors2 obj = new Constructors2();
	}
	
	
}
