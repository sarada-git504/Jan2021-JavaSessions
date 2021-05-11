package JavaSessions;

public class FinalizedMethod {
	
	String name = "Tom";

	public static void main(String[] args) {
		
		FinalizedMethod obj = new FinalizedMethod();
		obj = null;
		
		Window w1 = new Window();
		w1 = null;
		
		System.gc();// to call gc
		
		
		}

	@Override
	public void finalize() {
		System.out.println("FinalizedMethod-----finalize");
	}
	
	
	
	
	
	
	
	
	
}
