package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {


	//1.Write a Java program to create a new array list, add some colors (string) and print out the collection

		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Red");//0
		ar.add("Yellow");//1
		ar.add("White");//2
		ar.add("Orange");//3
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		
		System.out.println(ar);
		
		//for each loop:
		
		for(String s1 : ar) {
			System.out.println(s1);
		}
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("..................................................");
		
		//2.Write a Java program to insert an element into the array list at the first and last positions:
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(6);
		
		// Using add method to add elements to the list.
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(14);
		arrlist.add(22);
		
		//adding or inserting element 10 and 26 
		
		arrlist.add(0, 10);
		arrlist.add(5, 26);
		
		for(Integer m : arrlist) {
			
			System.out.println("Number " + m);
			
		}
		
		System.out.println(".....................................");
		
		//3.Write a Java program to retrieve an element (at a specified index) from a given array list:
		
		
		System.out.println(arrlist.size());
		System.out.println(arrlist.get(0));
		
		System.out.println("..........................................");
		
		//4.Write a Java program to update specific array element by given element:
		
		 //updating the second element:
		
		arrlist.set(1, 12);
		System.out.println(arrlist.get(1));
		
		System.out.println(".......................................");
		
		
		//5. Write a Java program to remove the third element from a array list. 

		
		System.out.println(arrlist);
		
		arrlist.remove(2);
		
		System.out.println(arrlist);
	
		System.out.println("....................................");
	
		for(Integer n : arrlist) {
			System.out.println(n);
		}
		

		System.out.println(".......................................");
		
		//6. Write a Java program to search an element in a array list.
		
		  if(ar.contains("Red")) {
			  System.out.println("Found the color.............. " );
		  }
		  else {
			  System.out.println("Red color is not found......");
		  }
		
		System.out.println("............................................");
		
		/*An element in an ArrayList can be searched using the method java.util.ArrayList.indexOf(). This method returns the index of the first occurance of the element 
		 * that is specified. If the element is not available in the ArrayList, then this method returns -1.
		 */
		int index1 = ar.indexOf("Red");
		
		if(index1 == -1) {
			System.out.println("This color Red is not in the ArrayList");
		}
		else {
			System.out.println("Color Red is in ArrayList  " + index1);
		}
		
		
	    System.out.println("..............................................");
	    
	    //7. Write a Java program to reverse elements in a array list:
	    
	    //To reverse an ArrayList in java, one can use Collections class reverse method i.e Collections.reverse() method. Collections reverse method reverses the 
	    //element of ArrayList in linear time i.e time complexity is O(n).
	    
            System.out.println(arrlist);
            
            Collections.reverse(arrlist);
            
            System.out.println(arrlist);
		
		
		   System.out.println("......................................");
		   
		   //8.Write a Java program to extract a portion of a array list.
		   
		   System.out.println("Original list: " + arrlist);
		   
		   List<Integer> sub_list = arrlist.subList(3, 5);
		   
		   System.out.println("List of slice elements: " + sub_list);
		   
		   System.out.println("............................................");
		   
		   System.out.println("This the Original List : " + ar);
		   
		   List<String> sub_list1 = ar.subList(0, 2);
		
		   System.out.println("This is the sliced list:  " + sub_list1);
		   
		   System.out.println(".............................................");
		   
		   //9. Write a Java program of swap two elements in an array list.
		
		    // Swap means changing the position of the elements in the List.
		   
		   System.out.println("This the Original List : " + ar);
		
		   ar.add("Purple");
		   ar.add("Brown");
		
		   System.out.println("This the Original List : " + ar);
		   
		   Collections.swap(ar, 0, 4);
		   
		   System.out.println("This is the swap List : " + ar);
		   
		   System.out.println("........................................");
		   
		   //10. Write a Java program to empty an array list:
		   
		   // Clear arraylist with ArrayList.clear():
		   //Clear arraylist with ArrayList.removeAll():
		   
		   
		   System.out.println("This the Original List : " + arrlist);
		   
		   arrlist.clear();
		   
		   System.out.println("This is the empty List : " + arrlist);
		   
		   System.out.println(".....................................................");
		   
		   //11. Write a Java program to trim the virtual capacity of an array list the current list size:
		   
		   // trimToSize() method is used for memory optimization. It trims the capacity of ArrayList to the current list size.
		   //For e.g. An arraylist is having capacity of 15 but there are only 5 elements in it, calling trimToSize() method on this ArrayList would change 
		   //the capacity from 15 to 5.
		   
		   ArrayList<Character> list = new ArrayList<Character>();
		   
		   list.add('C');//0
		   list.add('B');//1
		   list.add('A');//2
		   list.add('D');//3
		   list.add('E');//4
		   list.add('G');//5
		   list.add('F');//6
		   
		   System.out.println("Size of the list: " + list.size());
		   System.out.println("Get the element in the list: " + list.get(2));
		   
		   Collections.sort(list);
		   
		   System.out.println("This is the sorted list: " + list);
		   
		   //trimToSize()
		   
		   System.out.println(list);
		   
		   list.trimToSize();
		   
		   System.out.println("This is the trimmed list: " +list);
		   
		   System.out.println("........................................");
		   
		   //12. Write a Java program to print all the elements of a ArrayList using the position of the elements:
		   
		   System.out.println("\nPrint using index of an element: ");
		   int no_of_elements = list.size();
		   for (int index2 = 0; index2 < no_of_elements; index2++)
		    System.out.println(list.get(index2));

		   
		   
		   
		   
		   
		   
		

	}

}
