package JavaSessions;

public class TestCompany {

	public static void main(String[] args) {
		
		Company c1 = new Company("IBM", 1000);
		
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		
		Company c2 = new Company("MS",2000,"Banglore");
		
		System.out.println(c2.name + " " + c2.empCount + " " + c2.city);
		
		System.out.println("..................................................");
		
		System.out.println(c2.address);//address is not in c2 constructor so it will give null
		
		System.out.println(".................");
		
		Company c3 = new Company("TCS",5000,"Pune","test address","TATA");
		System.out.println(c3.name);
		System.out.println(c3.ceoName);
		
		System.out.println(c1.ceoName);//null
		
		
		
		

	}

}
