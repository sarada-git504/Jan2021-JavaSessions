package JavaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 10;
		i1 = 20;
		i1 = 30; // Here the latest value of I is 30
		System.out.println(i1);
		
		System.out.println("--------------------------------------------");
		
		// if you want to store all he values of similar type of data we use array
		//1. Size is fixed: These are called static arrays where the size is fixed.You can't go beyond the size of array.
		   //a. if you have more segment and less data it's wastage of memory.
		   //b. if you have more data and less segments then you don't have segments
		
		//2. it can store only similar type of data
		
		// 1demensional array or single dim array:
		// 1. int array:
		
		int marks[] = {10,2,3,44,55,22,200}; //Array Literals. you can use when you are aware of how any segments will be there.
		System.out.println(marks.length);// size 7
		Arrays.sort(marks);//for sorting static arrays and use for loop to print
		
		for(int e : marks) {
			System.out.println(e);
		}
		
		System.out.println("-------------Test-------------------------");
		
		
		 int i[] = new int[4];// it divides into 4 and it takes 4*4=16 bits
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40; // length=hi+1=3+1=4;low=0,hight=3
		 
		 System.out.println(i[0]);
		 System.out.println(i[3]);
		 //System.out.println(i[4]);//Since i[4] gives exception error java.lang.ArrayIndexOutOfBoundsException
		 //System.out.println(i[-1]);//if i give negative number same exception error will be displayed. In Java negative index is strictly not allowed.
		 
		 System.out.println(i.length); // will print length of array which is hi+1=3+1=4
		 // if I comment i[2] and i[3] and run it it will the default value of int(i) which is zero.
		 
		 System.out.println("----------------------------------------");
		 
		 // print all the values from array : Use for loop:
		
		// for(int k=0; k<4; k++) -- you can do two more ways
		 //for (int k=0; k<=i.length-1; k++1 -- if you want to give <= which not correct then you need to minus 1 from length
		 for(int k=0; k<i.length; k++) // this is right way of doing.
		 {
			 System.out.println(i[k]); // 10,20,30,40
		 }
		
		 System.out.println("-------------for each--------------------");
		 
		 for(int k1 : i) {
			 System.out.println(k1);
		 }
		 
		 System.out.println("--------------------------------------");
		 
		 //double array:
		 
		 double d[] = new double[2];// double 8 bytes.
		 d[0] = 12.33;
		 d[1] = 23.44;
		 System.out.println(d[0] + d[1]);
		 //System.out.println(d[2]);--exception error java.lang.ArrayIndexOutOfBoundsException
		 //System.out.println(d[1]); -- it gets default value 0.0
		
		 for(int j=0; j<d.length; j++) {
			 System.out.println(d[j]);
		 }
		 
		 System.out.println("-------------------------------------------");
		
		 //for each loop
		 for(double f1 : d) {
			 System.out.println(f1);
		 }
		
		 System.out.println("----------------------------------");
		 
		// double num[] = new double[99]; // 3x8=24 bits using only 3 arrays.
		 //low = 0;
		 //high = 98; => lenght-1
		 //length = hi + 1 - 98+1=99
		 
		 //char array:
		 char c[] = new char[3];
		 c[0] = 'a';
		 c[1] = '$';
		 //c[2] = '1';-- default value blank value or empty value.
		 
		 //string array:
		 //String [] s = new String [4]; - you can declare array in this way also.
		 String lang[] = new String [4]; // default value in null
		 
		 lang[0] = "Java";
		 lang[1] = "C#";
		 lang[2] = "Python";
		// lang[3] = "Java Script"; -- this will give null and this is not primitive data type. It's a class.
		 
		 for(int p=0; p<lang.length; p++) {
			 System.out.println(lang[p]);
		 }
		 
		 
		System.out.println("-----------------------------------------");
		 
		 // an other way of writing for loop 
		 // for each loop:
		 
		 for(String e : lang) {        // e -variable for string and lang-is array name
			 System.out.println(e);
		 }
		
		System.out.println("---------different data type---------------------------");
		//Create an array where you want to store different type of data with static array:
		// emp info: name,age,'m',34.44,true 
		// to use this we need to use Object static array:
		// Object class is a super class
		
		Object ob[] = new Object[5];
		ob[0] = "Dixit";
		ob[1] = 30;
		ob[2] = 34.55;
		ob[3] = 'm';
		//ob[4] = true; -- default false - this is primitive data type.
		
		//System.out.println(ob[0]);
		
		for(int n=0; n<ob.length; n++) {
			System.out.println(ob[n]);
		}
		
		System.out.println("----------for each----------------------");
		
		for(Object g : ob)
			System.out.println(g);
		
		System.out.println("-------------boolean------------");
		
		//boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = true;
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		System.out.println("-------------assignment------------------------------");
		
		// Assignments:
		//You can initialize an array with a comma-separated sequence of elements enclosed in braces, like this:


		int [] rows = {0,1,2,3};
		int [] columns = {0,1,2,3,4,5,6,7,8,9};
//		for(int i2 : rows) {
//			for(int j2 : columns) {
//				System.out.print(rows[i2]+"" +columns[j2]+" ");
//			}
//			System.out.println(" ");
//		}
		
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
