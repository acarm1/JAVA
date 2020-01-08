package DAY20;


import java.util.*;

class Main {
  public static void main(String[] args) {
    //DO NOT CHANGE
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    
    int age = scan.nextInt();
    
  if (age<10){
    
    System.out.println("ineligible");
    
  }
    
  else if (age==2){
    
    System.out.println("toddler");
  }  
    
  else if ((age<=3 || age<=5)){
    System.out.println("early childhood");
  }  
      
      
}
	
	
}
