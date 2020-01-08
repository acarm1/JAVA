package Day43_JavaRecap;

public class Static_VS_Ins_VS_Constructor {

	static {
		
		System.out.println("Static Block");
		/// executed asap the class is loaded, only once
	}
	
	
	{
		
		System.out.println("Instance Block");
		
	}
	/// executed when the object is created in the main
	
	public  Static_VS_Ins_VS_Constructor(){
		
		System.out.println("Constructor");
		
	}
	/// executed when the object is created in the main
	
	public static void main(String[] args) {
		
		Static_VS_Ins_VS_Constructor obj= new Static_VS_Ins_VS_Constructor();
		
		Static_VS_Ins_VS_Constructor obj2 = new Static_VS_Ins_VS_Constructor();
		
		System.out.println("hello");
		
	}
	
}
