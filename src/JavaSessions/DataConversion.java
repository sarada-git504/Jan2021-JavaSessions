package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		//String to Integer conversion:
		String x ="100";
		
		System.out.println(x+20);//10020
		
		int i = Integer.parseInt(x);//this is called Rapper class
		System.out.println(i+20); //output:120
		
		//String to double:
		
		String y = "12.33";
		System.out.println(y+20);
		
		Double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		String f = "true";
		if(Boolean.parseBoolean(f)) {
			System.out.println("Hi");
			
//		String t = "100A";//alphanumeric 
//		int k = Integer.parseInt(t);//here you get exception-Numberforamt exception
//		System.out.println(k+20);//=>
		
		//Spliting number and char from the string variable:
        String part = "100A";
        String ch = part.replaceAll("[^A-Za-z]","");
        String ch1 = part.replaceAll("[^0-9]","");
        System.out.println("Int = " + ch1);
        System.out.println("String = " + ch);
        int f1 = Integer.parseInt(ch1);
        System.out.println(f1+20);//=>120
        
        System.out.println(".....................................");
        
        //int to String:
        
        int total = 100;
        String t1 = String.valueOf(total);
        System.out.println(t1+20); //=>10020
        System.out.println(t1 + "" +20);//=>10020(u can try this way also)
        
        System.out.println("............................");
        
        
        
        
        
        
			
		}

	}

}
