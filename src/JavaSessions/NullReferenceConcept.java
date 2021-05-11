package JavaSessions;

public class NullReferenceConcept {
	
	String name;
	int age;
	

	public static void main(String[] args) {
		
		NullReferenceConcept obj = null;
		// here you will get nullpointer exception 
		System.out.println(obj.name);// still you are accessing because u r part of the class 
		System.out.println(obj.age);
		
//		NullReferenceConcept obj = new NullReferenceConcept();
//		
//		obj.name = "Tom";
//		obj.age = 24;
//		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
//		
//		System.out.println("...............................................");
//		
//		obj = null; //obj is not refering to any object. It refering to null.
		// since obj is pointing to null it gives NullPointerException
		
//		System.out.println(obj.name);
//		System.out.println(obj.age);
		
		new NullReferenceConcept();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
