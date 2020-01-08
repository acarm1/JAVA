package Day39_JavaReview;

public class CellPhoneObjects {
	
	public static void main(String[] args) {
		
		CellPhone phone1 = new CellPhone();
		
			System.out.println(phone1.brand); /// null
		
			System.out.println(phone1.color);; /// null
		
			System.out.println(phone1.model); /// null
		
			System.out.println(phone1.price); /// 0.0
		
			System.out.println(phone1.screensize); /// 0.0
		
		
		CellPhone phone2 = new CellPhone("Motorola",200, "gray", 6.1, "z2 play");  ///I used overload method
		
		phone2.getInfo();		
		
		
		CellPhone phone3 = new CellPhone("Nokia", 20, "black", 3, "3330");
		
		phone3.getInfo();
		
		
		CellPhone phone4 = new CellPhone("Samsung", 700,"red", 6.1, "GT-I7500");
		
		phone4.getInfo();
		
		
		
		CellPhone[] phones = {phone1,phone2,phone3,phone4}; 
		
		/// brand of phone3
		System.out.println(phones[2].brand);
		// get info of phone 3
		phones[2].getInfo();
		
		
	}

}
