package OOP_Encapsulation;

public class TestComp {

	public static void main(String[] args) {
		
		
		Company c1 = new Company("MS", 1000, "HR");
		Object ar[] = (c1.getCompInfo());
		
		for(Object e : ar) {
			System.out.println(e);
		}

		
	//	c1.setName("IBM");// just set the value
//		c1.setPolicy("financial policy");
//		c1.setSharePrice(100);
		
		
		//c1.getName(); // get the value.you directly in Syso.
//		System.out.println(c1.getName() + " " + c1.getPolicy() + " " + c1.getSharePrice());
//		
		
		
		
		
		
		

	}

}
