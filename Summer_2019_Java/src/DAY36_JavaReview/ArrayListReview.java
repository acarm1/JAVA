package DAY36_JavaReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListReview {

	/*
	 
	 ArrayList Methods: add(), get(), clear(),set(),size(),indexOf(),lastIndexOf(),remove(),Array.asList(),isEmpty
	 	 								addAll(),removeAll(),equals(),contains()
	 
	 
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 		// you cant skip the order in the array list

		
		/// add() : takes an object
		
		list.add(10); // assings primitive to object ==> Autoboxing
		
		list.add(20);
		
		
		/// add ( index, object) : it will insert the given object at the given index number
		
		
		list.add(1,30);   /// 20 will move to index 2 
		
		/// list.add(4,40); /// it will give index outofbond error. You cant skip the index order.
		
		list.add(3,50);
		
		System.out.println(list);
		
		/// retrieve specific objetc from the arraylist
		/// 
		// get (index number) : returns the object at the given index
		
		System.out.println(list.get(3));
		System.out.println(list.get(1));
		
		/// size() : returns the total number of elements in the list ( similar with length() ) 
		
		
		System.out.println(list.size()); /// 4
		
		//// last index number : list.size()-1
		
		// print in order
	
		for (int i =0; i<list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
			
		}
		System.out.println();
		
		///print in reverse
		
		for (int i = list.size()-1; i>=0;i-- ) {
			
			System.out.print(list.get(i)+" ");

		}
System.out.println();
		
		// clear() : removes all the object from arrayList, size will be 0.
		
		list.clear(); /// removes everything
		
		System.out.println(list);
		
		
		/// set( 0, object) : replaces the index with the given object
		
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Erhan");
		students.add("Homayra");
		students.add("Rahwa");
		students.add("Arzu");
		students.add("Mehmet");
		students.add("Rahwa");

		
		System.out.println(students);
		
		students.set(0, "Holly");
		System.out.println(students);
		
		students.set(4, "Happy birthday Mehmet");
		System.out.println(students);
		
		// indexOf(Object): returns the first matching objects index number.
		
		System.out.println(students.indexOf("Rahwa"));
	
		/// lastIndexOf(Object) : returns the last matching index number
		System.out.println(students.lastIndexOf("Rahwa"));
		
		//  equals(): checks the object in ArrayList and returns boolean statement.
		
		ArrayList<String> students2 = new ArrayList<>(Arrays.asList("A","B","C"));
		
		System.out.println(students.equals(students2)); ///false
		
		students2 = students;
		
		System.out.println(students.equals(students2));
		
		
		// Contains(Object): checks if the given object is contained in the arrayList and returns boolean expression
		
		System.out.println(students);
		
		System.out.println(students.contains("Muhtar"));  /// false
		 
		System.out.println(students.contains("Rahwa"));  /// true
		
		System.out.println(students.contains("Erhan"));  ///false
		
		
		
		// isEmpty(): checks if the size of the ARraylist is 0 or not, returns boolean expression
		
		
		ArrayList<Character> ch = new ArrayList<>();
			// ch.add('Y');
		
		System.out.println(ch.isEmpty()); // true
		
		
		// remove(primitives int): removes the index numbers
						// not designed to be used within the loop
		
		ArrayList<Integer> price =  new ArrayList<>();
			price.add(1);  // 0
			price.add(2);  // 1
			price.add(3);  // 2
			
			price.remove( 1 );  //[1, 3]
		
			System.out.println(price);
			
		
		// removeAll(Interface):  removes all the matching objects	
	
			
		ArrayList<Integer>  nums = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,3,1));
		nums.removeAll( Arrays.asList( 1 , 2 ) );
	
		/*
			for(int i =0; i < nums.size(); i++) {
				if(nums.get(i) == 1 ) {
					nums.remove(i);
				}			
			}
		*/	
		System.out.println(nums);	 // Iterables
	
		
		
		// addAll(Interface): adds multiple objects to the ArrayList
		
		ArrayList<String> n1 = new ArrayList<>();
		n1.addAll( Arrays.asList("Yasin", "Talha", "Ruslan") );
		
		System.out.println( n1 );
		
			
		
		// Collections.sort(ArrayList): sorts the arrayList in ascending order
		
		Integer[] arr = {1,2,3,4,5,5,5,100, -100, -9};
		
		ArrayList<Integer> lists = new ArrayList<>( Arrays.asList( arr ) );
		System.out.println(lists);
		
			Collections.sort(lists);
			System.out.println(lists);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
