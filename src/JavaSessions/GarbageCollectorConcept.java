package JavaSessions;

public class GarbageCollectorConcept {
	
	String name;
	int age;

	public static void main(String[] args) {
		
		
		//Total we have created 7 Objects in this program
		
		GarbageCollectorConcept e1 = new GarbageCollectorConcept();
		e1.name = "Tom";
		e1.age = 20;
		
		System.out.println(e1.name + " " + e1.age);
		
		// no reference Objects
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		new GarbageCollectorConcept();
		
	   GarbageCollectorConcept e2 = new GarbageCollectorConcept();
	   GarbageCollectorConcept e3 = new GarbageCollectorConcept();
		
	   // These are pointing to null reference
	   
	   e2 = null;
	   e3 = null; 
		
		System.gc();
		
		
		
		
		
		
		
		
		
		

	}

}
