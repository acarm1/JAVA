package Day47_JavaRecap;



class Mehmet{
	
	public Mehmet() {
		System.out.println("Mehmet");
	}
	
	
}

class Resul extends Mehmet{
	
	public Resul() {
		System.out.println("Resul ");
	}
	
}

class Viktoria extends Resul{
	
	
	public Viktoria()
	{
		super();
		System.out.println("Viktoria");
	}
}




public class Constructors {

	
	public static void main(String[] args) {
		
		Viktoria obj= new Viktoria();
		
		
	}
	
	
	
}
