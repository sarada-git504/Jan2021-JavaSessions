package JavaSessions;

public class ArrayAssignments {

	public static void main(String[] args) {
	   // Java_06_2DArray
       //2nd array: two dim array:
	   //use case: testNG -- data provider + with selenium --> data driven
	   // nested loops:
	 // 00 01 02 03
	 // 10 11 12 13
	 // 20 21 22 23
		
		for(int a = 0; a<=3; a++) {
			for(int b = 0; b<=3; b++) {
				System.out.print(a+ "" + b + " ");
			}
			System.out.println(" ");
		}

		System.out.println("==========================================");
		
		//2d array:
		
		int dd[][] = new int[3][3];
		
		for(int h=0; h<dd.length; h++) {
			for(int g=0; g<dd[0].length; g++) { //since even rows change columns will be same
				System.out.print(h + "" + g + " ");
			}
			System.out.println();
		}
		// Assignments:
				//You can initialize an array with a comma-separated sequence of elements enclosed in braces, like this:


				int [] rows = {0,1,2,3};
				int [] columns = {0,1,2,3,4,5,6,7,8,9};
//				for(int i2 : rows) {
//					for(int j2 : columns) {
//						System.out.print(rows[i2]+"" +columns[j2]+" ");
//					}
//					System.out.println(" ");
//				}
				
				System.out.println("-------------------------------------");
				
			for(int f=0; f<rows.length; f++) {
					for(int h=0; h<columns.length; h++) {
						System.out.print(rows[f]+"" + columns[h]+ " ");
					
					}
				
				 System.out.println(" ");
			}
				
			System.out.println("------------------------------------------");
			
				/* 2. Write a program to create a static Array, having following cricket data:
			--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)*/
			
			 Object ck[] = new Object[7];
			 ck[0] = "Arun";
			 ck[1] = 30;
			 ck[2] = "Sun Shine";
			 ck[3] = "03-21-1980";
			 ck[4] = 'm';
			 ck[5] = 2.33;
			 ck[6] = true;
			 
			 for(Object s : ck) {
				 System.out.println(s);
			 }
			 	 
			System.out.println("-----------------------------------------");	
			
			for(int g=0; g<ck.length; g++) {
				System.out.println(g);
			}
			
			System.out.println("......................................");
			
			
			int index =0;
			while(index < ck.length) {
				System.out.println(ck[index]);
				index++;
			}
			
				
		
		
				
		
		
		
		
		

	}

}
