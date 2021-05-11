package JavaSessions;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   
		
       // Post Increment
       int a =1;     // this incremented to 2 
       int b = a++; // post increment - b will get original value of a  which is 1 ,increment later- increase the value by 1
       
       System.out.println(a);//2
       System.out.println(b);//1
       
       int x = -99;
       int y = x++;
       
       System.out.println(x); //-98
       System.out.println(y); //-99
       
       
       //Pre Increment - immediately increase the value
       int m = 1;
       int n = ++m;
       
       System.out.println(m); // 2
       System.out.println(n); // 2
       
       
	    int p = -89;
	    int q = ++p;
	    
	    System.out.println(p); //-88
	    System.out.println(q);//-88
	    
	    
	    //post decrement: --
	    
	    int h = 2;//1
	    int g = h--;//2
	    
	    System.out.println(h); // value decreased to 1
	    System.out.println(g); // Assigning current value which is 2.
	    
	    //pre decrement
	    int t =2; //1
	    int u = --t; // 1
	    
	    System.out.println(t); 
	    System.out.println(u);
	    
	    int v = 2;
	    System.out.println(v++);//increase later - 2
	    System.out.println(v); //3
	    
	
	    int hh = 3;
	    System.out.println(++hh);
	
	    double d1 = 1.5;
	    double d2 = d1++;
	    
	    System.out.println(d1);//2.5
	    System.out.println(d2);//1.5
	
	
		
	
	}
	
	
}
