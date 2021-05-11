package JavaSessions;

import java.util.ArrayList;

public class ArrayListTraverse {

	public static void main(String[] args) {
		
		//dynamic arrays- we are not bother about size of the list eg:ecommerce page the product on the page keep 
		//changing depending on season
		
		ArrayList<String>nameList = new ArrayList<String>();
		nameList.add("Sarada");//0
		nameList.add("Dixit");//1
		nameList.add("Baby");//2
		nameList.add("Tony");//3
		nameList.add("Joy");//4
		
		//traverse the arraylist: loop
		
		for(int i=0; i<nameList.size(); i++) { 
			
			System.out.println(nameList.get(i));
			
			if(nameList.get(i).equals("Baby")) {
				System.out.println("Hi.................");
				break;
			}
		}
		
		System.out.println("----------------------------");
		
		//for each loop:
		
		for(String e : nameList) {
			System.out.println(e);
			
			if(e.equals("Baby")) {
				System.out.println("Hi.......");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
