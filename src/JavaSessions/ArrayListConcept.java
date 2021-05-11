package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList is a default class in Java
		//maintains the indexing(it is also called order based)
		// default capacity of array is 10
		ArrayList<Object> ch = new ArrayList<Object>();
		
		System.out.println(ch.size());
		
		ch.add(10);//0 index
		ch.add(20);//1
		ch.add(30);//2
		
		System.out.println(ch.size());
		System.out.println(ch.get(0));
		
		ch.add(40);
		ch.add(50);
		
		System.out.println(ch.size());
		
		ch.add("Tom");
		ch.add(12.33);
		ch.add(true);
		ch.add("testing");
		ch.add('m');//9
		
		System.out.println(ch.size());
		System.out.println("LI = " + 0);
		System.out.println("HI = " +(ch.size()-1));
		
		ch.add(600);//10
		ch.add(700);//11
		ch.add("Ram");
		ch.add('c');
		ch.add(60.00);
		ch.add(24);
		//to print all values from array list
		
		for(int i=0; i<ch.size(); i++) {
			System.out.println(ch.get(i));
		}
		System.out.println("................................................");
		
		//int data in arraylist:
		ArrayList<Integer>marks = new ArrayList<Integer>();//don't write small int
		marks.add(100);
		System.out.println(marks.size());
		//marks.add("sting")- this is wrong
		System.out.println("----------------------------------------");
		
		ArrayList<String>nameList = new ArrayList<String>();//if number is given it will create that many segements only
		System.out.println(nameList.size());// gives 0
		System.out.println(nameList);
		nameList.add("Sarada");//0
		nameList.add("Dixit");//1
		nameList.add("Baby");//2
		nameList.add("Tony");//3
		nameList.add("Jira");//4
		System.out.println(nameList);
		System.out.println(nameList.get(4));
		//System.out.println(nameList.get(5));-IndexOutOfBoundsException
		//System.out.println(nameList.get(-1));-IndexOutOfBoundsException
		System.out.println("-----------------------------------");
		
		ArrayList<Double> salary = new ArrayList<Double>();
		salary.add(10.22);
		salary.add(200.00);
		System.out.println(salary);
		
		System.out.println("----------------------------------");
		
		//if you don't write anything it will give 10 or else the number mentioned now it is 5
		ArrayList<String> linksList = new ArrayList<String>(5);//if number is given it will create that many segements only.
		linksList.add("Home");//press f8 to skip previous debug lines
		linksList.add("Login");
		linksList.add("Contact us");
		
		System.out.println(linksList);
		linksList.remove(1);
		System.out.println(linksList);
		
		System.out.println("....................................");
		
		ArrayList<Integer> numList = new ArrayList<Integer>() ;
		numList.add(12);
		numList.add(15);
		numList.add(1);
		numList.add(22);
		numList.add(5);
		
		System.out.println(numList);
		Collections.sort(numList);//it will sort the numbers then print again
		System.out.println(numList);
		
		/* you can't print marks directly with Syso: for eg: 
		 * int marks[] = {10,2,3,44,55,22,200};-Array literals
		 * Syso(marks)-it gives memory address of that particular marks. Because int marks are not available in a form of object.but above
		 * arraylist above is available in form of object in memory.
		 */

	}

}
