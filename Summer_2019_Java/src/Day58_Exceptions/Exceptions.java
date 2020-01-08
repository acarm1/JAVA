package Day58_Exceptions;

public class Exceptions {

	public static void main(String[] args) {
		
		
		try {
			System.out.println(9/0);
			System.out.println("try block");
			
		}catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("final block");
		}
		
	}
	
	

}


