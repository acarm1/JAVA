package Day04_Variables;

public class PrimitiveDataTypes2 {
	
	
	/*
	
	Primitives :  byte,short,int,long,float,double,boolean,char

		
		boolean: takes all boolean expression, and returns either true or false.
		
		ASCI Table : a universal system that is recognized by all computers. Each character in
			ASCI table have a corresponding number to represent it.
		
		char : Declared with in the sing quote ''; and single character only. " is a MSUT when you give character
		as value.
	*/
	
	
public static void main(String[] args) {
		
	
	// boolean result = Earch is Flat;
	// boolean num1 = 100l it only takes true or false results or expression ex==> 9 > 7
	
	
	boolean result = true;
	
	boolean result2 = false;
	
	boolean result3 = 9 >3; // Returns True
	
	System.out.println(result);
	System.out.println(result2);
	System.out.println(result3);

	
	//char:
	
	char char1= 'a';
	System.out.println(char1);
		
	char char2='9';
	char char3= '#';
	System.out.println(char2);
	System.out.println(char3);
		
	//char with numbers
	
	char char4= 67; /// Only time we use '' for char is when we are declaring single character
	//prints the character thats correspanding to 67 from ASCII table.
	System.out.println(char4);
	
	char char5= 'C';   // Prints the character as it's
	System.out.println(char5);
	
	
	char char6 = '{';
	char char7= 123;
	
	System.out.println(char7);//// numara karsiligi
	
	System.out.println(char6);/// aynisi direk
	
	// initializing char to other primitives: byte,short,int,long,float,double
	
	char MyChar1 = 'b';
	
	int Myint= 'b'; // the number that represents b us initialized to the int
	
	System.out.println(Myint); //98
	
	byte Mybyte = 'b';
	
	int Myint1= MyChar1; /// 98,   the number that represents b will be the answer
	
	System.out.println(Myint1);
	
	
	
	
	}

}
