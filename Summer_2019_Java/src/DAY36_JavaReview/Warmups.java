package DAY36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Warmups {
	
	/*
	 WarmUp:
	 
	 1. write a return method that can remove duplicated objects from
	 an Integer arraylist.
	 
	 2.  write a return method that can remove duplicated objects from
	 an String arraylist.
	 
	 
	3.  write a return method that can remove duplicated objects from
	 an Character arraylist.

	4. write a return method that can remove duplicated objects from
	 an Double arraylist.
	 
	 ArrayList Methods: add(), get(), clear(),set(),size(),indexOf(),lastIndexOf(),remove(),Array.asList()
	 	 								addAll(),removeAll(),equals(),contains()
	 
	 
	 
	 Constructors
	 
	 */
	
	//task001:
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3));
		
		System.out.println(list);
		
		list= RemoveDup(list); // [1,2,3]
		
		System.out.println(list);

		
		
		
		ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(4,4,5,5,6,6));
		
		System.out.println(list2);
		
		list2= RemoveDup(list2);
		
		System.out.println(list2);
		
		
		String [] names = {"Sherinay","Denis","Nurzat","Seyfo","Seyfo","Seyfo","Mehmet" };
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(names));
		
		System.out.println(list3);
		
		list3 = RemoveDup2(list3);
		System.out.println(list3);
		
	}

	
	
	
	
///// task1 	
	
	public static ArrayList<Integer> RemoveDup(ArrayList<Integer> list){
														//[1,1,1,2,2,2,3,3,3]

		ArrayList<Integer> result = new ArrayList<>(); // [1,2,3]
		
		for (int i=0; i<list.size(); i++) {
			
			if (! result.contains ( list.get(i) )){
			
				result.add( list.get(i) );
			
			}
			
		}
		return result;
	}
/// task2

public static ArrayList<String> RemoveDup2 ( ArrayList <String> list){
	
	ArrayList<String> result = new ArrayList<>(); // [1,2,3]
	
	for (int i=0; i<list.size(); i++) {
		
		if (! result.contains ( list.get(i) )){
		
			result.add( list.get(i) );
		
	
	
}



}
	return result;

}

/// task3










}