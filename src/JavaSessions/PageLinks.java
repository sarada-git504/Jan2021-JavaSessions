package JavaSessions;

import java.util.ArrayList;

public class PageLinks {
	//Very important program.
	//WAF where you need to pass the page name and return the total links
    // and another function -- return list of all the links text on the page.
	
	public int getLinksCount(String pageName) {
		int count = getPageLinksTextList(pageName).size();
		
//		switch (pageName) {
//		case "LoginPage":
//			//count = 5;//total number of links on the page is 5
//			break;
//		case "HomePage":
//			//count = 50;//total number of links on the page is 5
//			
//			break;
//		default:
//			break;
//		}
		
		return count;
	}
	
	public ArrayList<String> getPageLinksTextList(String pageName) {
		System.out.println("getting page links text for: " + pageName);
	    ArrayList<String> linksList = new ArrayList<String>();
				
		if(pageName.equals("LoginPage")){
	        linksList.add("login");
	        linksList.add("contact us");
	        linksList.add("privacy policy");
	      
		}
	
		else if(pageName.equals("HomePage")){
			linksList.add("logout");
	        linksList.add("wishlist");
	        linksList.add("bussiness");
			
		}
		else {
			System.out.println("page is not available....");
		}
		
		return linksList;
		
		}
	
	public static void main(String[] args) {
		
		PageLinks p1 = new PageLinks();
		int c1 = p1.getLinksCount("HomePage");
		System.out.println(c1);
		
		System.out.println(".......................");
		
		ArrayList<String> homelist = p1.getPageLinksTextList("HomePage");
		System.out.println(homelist);
		
		System.out.println("----continue in PageLinkstwo----------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
