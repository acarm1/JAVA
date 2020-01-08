package Day43_JavaRecap;

public class LogIn {
	
	
	public static void main(String[] args) {
		
		Credentials Fatih= new Credentials();
		
//		obj.username="Fatih"; // instance variable username is private
//		obj.passsword="Mansur"; /// instance variable password is private
		
	//	System.out.println(obj.username); // private
	//	System.out.println(obj.passsword); // private
		
		
		// read :
		
		System.out.println(Fatih.getUsername());
		System.out.println(Fatih.getPassword());
		
		
		// modify :
		
			Fatih.setUsername("Fatih");
			Fatih.setPassword("Mansur");
		
		System.out.println(Fatih.getUsername());
		System.out.println(Fatih.getPassword());
			
		
	}
	
	

}
