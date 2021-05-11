package SuperKeyword;

public class BMW extends Car{
	String name;

public BMW() {
	super(10);
	System.out.println("BMW---------Constructor");
	
}

public BMW(String name) {
	super(10);
	this.name = name;
	
}


int speed = 150;
	
	public void checkSpeed() {
		System.out.println(speed);
	    System.out.println(super.speed);//parent class speed(accessing parent class properties)
	
	}
	
	
	public void display() {
		System.out.println("BMW ------ displaymethod");
		super.display();//parent class display method
		//this can't be given in syso because it's not declared as variable.
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
