package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {

       BMW b = new BMW("320d");
       System.out.println(b.speed);
       System.out.println(b.name);
       
       
       b.checkSpeed();//this will give both parent/child speed
       b.display();	 //this give both parent/child display message  		

	}

}

	//output:
/*car ------ consructor 10
BMW---------Constructor
150
150
120
BMW ------ displaymethod
car ------- displaymethod */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	