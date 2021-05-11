package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {

          String st = "Hi this is my java code and I am so happy";
          
          System.out.println(st.length());// l=41,h[]=40,l[]=0
          
          //Character at index:
          
          System.out.println(st.charAt(0));
          System.out.println(st.charAt(36));
          
          //[41] index is not there in the string . 
          // you will get exception StringIndexOutOfBoundsException
         // System.out.println(st.charAt(41));
          
          //get the index of particular character:
          System.out.println(st.indexOf("j"));
          System.out.println(st.indexOf("i"));// 1st occurence of i
          
          //next occurrence of i start with index count from 2.
          //but this is hardcoded
          System.out.println(st.indexOf("i", 2));

          //the right way to search next i:
          
          System.out.println(st.indexOf("i", st.indexOf("i")+1));
          System.out.println(st.indexOf("code"));//started at [19]
          
          System.out.println(st.indexOf("hello"));// -1,it won't give exception it give -1
          
          
          System.out.println(".........................................");
          
          String mesg = "Welcome admin";
          if(mesg.indexOf("admin")>0) {// this mean admin is available
        	  System.out.println("user is there:");
          }
          
          else {
        	  System.out.println("user not available");
          }
          
          //otherway:
          
//          String mesg = "Welcome null";//no name
//          if(mesg.indexOf("admin")>0) {    	  // then this will be -1 and -1 less than 0 
//              System.out.println("user is there:");
//          }
//          else {
//        	  System.out.println("user not there:"); // cursor goes here since name is null
//          }
          
          System.out.println(".........................................");
          
          System.out.println(st.toLowerCase());
          System.out.println(st.toUpperCase());
          
          
          System.out.println("...............................................");
          
          //trim:
          String s1 = "   hello world   ";
          System.out.println(s1.trim());
          
          //comparision:
          
          String s2 = "this is selenium";
          String s3 = "this is selenium";
          
          System.out.println(s2.equals(s3));//it does exact comparision
          
          
          //Contains:
          String message = "this is your email id sarada@gmail.com";
          System.out.println(message.contains("sarada"));
          
          String url = "http://amazon.com/product/macbook";
          if(url.contains("macbook")) {
        	  System.out.println("url is correct");
          }
          
          else {
        	  System.out.println("url not correct");
          }
          
          String a = "testing";
          String b = "Selenium";
          int x = 100;
          int y = 200;
          System.out.println(a+b+x+y);
          // other way to do:
          System.out.println(a.concat(b)); 
          System.out.println(".................................."); 
          
          //substring:
          
          String m = "your transaction id is 12345 ";
          System.out.println(m.substring(3));
          System.out.println(m.substring(5, 10));//it will not include 10th index
          
          // star from number 1:
            System.out.println(m.substring(m.indexOf("is")+3,m.length()).trim());
            System.out.println(m.substring(m.indexOf("is")+3).trim());
            
         // Split:
            
            String lang = "JAVA_PYTHON_JAVASCRIPT_RUBY";
           String language[] =  lang.split("_");
           System.out.println(language.length);
          for(String e : language) {
        	  System.out.println(e);
          }
          
          System.out.println("........................................");
          
          //Storing user data in single string:Importnt example
          
          String userData = "Tom;peter;01-01-1990;NY;USA;909090";
          String user[] = userData.split(";");
          for(String e : user) {
        	  System.out.println(e);
          }
          
          System.out.println(".........................................");
          //Interview question:
          String test = "xXtestingxXXjavaXxXseleniumxXxpython";
          String myTest[] =  test.split("xX");//=>xX will be removed
          System.out.println(myTest[0]);// => blank space    
          System.out.println(myTest[1]); // testing
          System.out.println(myTest[2]); //XjavaX
          System.out.println(myTest[3]);// selenium
          System.out.println(myTest[4]);//xpython
         // System.out.println(myTest[5]);=>ArrayIndexOutOfBoundsException
          
          for (String s : myTest) {
        	  System.out.println(s);
          }
          System.out.println("...............................................");
          //split not working
         String seller = "seller|seller123";
         System.out.println(seller.split("\\|")[0]);
         System.out.println(seller.split("\\|")[1]);
         
               
          String log = "tester;tester123";
          String username = log.split(";")[0];
          String pwd = log.split(";")[1];
          System.out.println(username + " " +  pwd);
          
          //split with space:
          
          String cred1 = "testing test123 admin";
          System.out.println(cred1.split(" ")[0]);// =>testing
          System.out.println(cred1.split(" ")[1]);
          System.out.println(cred1.split(" ")[2]);
          
          System.out.println("....................................");
          
          //'|'- this is treated special as meta character. so use\\| same with dot.
          
          String cred = "testing|test123|admin";
          System.out.println(cred.split("\\|")[0]);// =>testing
          System.out.println(cred.split("\\|")[1]);// =>testing123
          System.out.println(cred.split("\\|")[2]);// => admin
          
          System.out.println(".........................................");
          
          String dot = "sarada.sarada123.admin";
          System.out.println(dot.split("\\.")[0]);
          System.out.println(dot.split("\\.")[1]);
          System.out.println(dot.split("\\.")[2]);
          
          String str = "Hi this is \"tom\" I love Java";
          System.out.println(str); //Hi this is "tom" I love Java
          
          System.out.println(".........................");
          
          
          
          getInfo("username"); //pass the value username
          //output://input[@id='username']
	}
	
	 public static void getInfo(String value) {
		 
		 String xpath = "//input[@id='"+value+"']";//to use above value as variable need to put in""
		 System.out.println(xpath);
		 
	 }
	
	
	

}
